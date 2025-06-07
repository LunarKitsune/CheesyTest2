package org.cheesy.cheesytest2.client.DataGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.cheesy.cheesytest2.CheesyModItems;

import java.util.concurrent.CompletableFuture;

public class CheesyRecipeGenerator extends FabricRecipeProvider {
    public CheesyRecipeGenerator(FabricDataOutput output,
                                     CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture){
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {

                createShaped(RecipeCategory.MISC, CheesyModItems.Cheesyite, 1)
                        .pattern("www")
                        .input('w', ItemTags.LOGS)
                        .group("testItems")
                        .criterion(hasItem(Items.OAK_PLANKS),
                                conditionsFromItem(Items.OAK_PLANKS))
                        .showNotification(true)
                        .offerTo(exporter);


                RegistryWrapper.Impl<Item> itemLookup =
                        registries.getOrThrow(RegistryKeys.ITEM);
            }
        };
    }

    @Override
    public String getName() {
        return "CheesyRecipeGenerator";
    }

}
