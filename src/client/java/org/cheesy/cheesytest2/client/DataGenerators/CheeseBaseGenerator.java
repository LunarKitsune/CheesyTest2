package org.cheesy.cheesytest2.client.DataGenerators;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CheeseBaseGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(CheesyAdvancementGenerator::new);
        pack.addProvider(CheesyRecipeGenerator::new);
        pack.addProvider(CheesyBlockGenerator::new);
        pack.addProvider(CheesyTagGenerator::new);
    }


}
