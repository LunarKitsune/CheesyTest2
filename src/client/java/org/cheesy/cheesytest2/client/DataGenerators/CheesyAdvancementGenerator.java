package org.cheesy.cheesytest2.client;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.cheesy.cheesytest2.Cheesytest2;
import org.cheesy.cheesytest2.ModItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CheesyAdvancementProvider extends FabricAdvancementProvider {
    protected CheesyAdvancementProvider(FabricDataOutput output,
                                        CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(output,registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {

        AdvancementEntry getCheesite = Advancement.Builder.create()
                .display(
                        ModItems.Cheesyite,
                        Text.literal("You get Cheesyite!"),
                        Text.literal("You can now craft Cheesyite!"),
                        Identifier.ofVanilla("textures/gui/advancements" +
                                "/backgrounds" +
                                "/adventure.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("got_logs",
                        InventoryChangedCriterion.Conditions.items(Items.OAK_LOG))
                .build(consumer, Cheesytest2.MOD_ID + ":get_cheesyite");


    }
//build an advancement generator that can get quiries here

//    public void provideAdvancementData(Items item, Text title, Text descript,
//                                       Text advancementBG, boolean showToast,
//                                       boolean announcePublic, boolean hidden)
//    {
//        Ad
//    }
}
