package org.cheesy.cheesytest2.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.advancement.AdvancementProvider;

public class CheesyBaseGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(CheesyAdvancementProvider::new);
        pack.addProvider(CheesyRecipeGenerator::new);
        pack.addProvider(CheesyBlockGenerator::new);
    }


}
