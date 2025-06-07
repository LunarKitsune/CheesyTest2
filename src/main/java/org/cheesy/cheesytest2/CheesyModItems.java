package org.cheesy.cheesytest2;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class CheesyModItems {

    public static void initialize(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(CheesyModItems.Cheesyite));
        CompostingChanceRegistry.INSTANCE.add(CheesyModItems.Cheesyite,.3f);
        FuelRegistryEvents.BUILD.register((builder,context) -> builder.add(CheesyModItems.Cheesyite,100));

    };

    public static final Item Cheesyite = register("cheesite", Item::new,
            new Item.Settings());


    public static Item register(String name, Function<Item.Settings, Item> itemFactory,
                                Item.Settings itemSettings){
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM,
                Identifier.of(Cheesytest2.MOD_ID, name));

        Item item = itemFactory.apply(itemSettings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }
}
