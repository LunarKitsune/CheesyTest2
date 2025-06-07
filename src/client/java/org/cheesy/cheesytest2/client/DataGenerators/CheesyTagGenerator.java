package org.cheesy.cheesytest2.client.DataGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.cheesy.cheesytest2.Cheesytest2;
import org.cheesy.cheesytest2.CheesyModItems;

import java.util.concurrent.CompletableFuture;

public class CheesyTagGenerator extends FabricTagProvider<Item> {
    public static final TagKey<Item> chypcktItems = TagKey.of(RegistryKeys.ITEM,
            Identifier.of(Cheesytest2.MOD_ID, "chsypckitems"));

    /**
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registriesFuture the backing registry for the tag type
     */
    public CheesyTagGenerator(FabricDataOutput output,
                              CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture){
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(chypcktItems)
                .add(CheesyModItems.Cheesyite)
                .setReplace(true);

    }
}
