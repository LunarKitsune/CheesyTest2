package org.cheesy.cheesytest2.client.DataGenerators;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
//import net.minecraft.client.data.Models;
//import net.minecraft.client.data.TextureMap;
//import net.minecraft.util.Identifier;
import net.minecraft.client.data.TexturedModel;
import org.cheesy.cheesytest2.CheesyModBlocks;
import org.w3c.dom.Text;
//import org.cheesy.cheesytest2.CheesyModItems;
//import org.cheesy.cheesytest2.CheesyModBlocks; ==> Import this later

public class CheesyBlockGenerator extends FabricModelProvider {

    public CheesyBlockGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleState(CheesyModBlocks.Cheesite_Block);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }

    @Override
    public String getName(){
        return "cheesytest2 Model Provider";
    }
}
