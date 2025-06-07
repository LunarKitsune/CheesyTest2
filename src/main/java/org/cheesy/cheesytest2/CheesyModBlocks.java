package org.cheesy.cheesytest2;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class CheesyModBlocks {

    private static Block register(String path, Function<AbstractBlock.Settings,
                Block> blockFactory, AbstractBlock.Settings settings){

        final Identifier identifier = Identifier.of("cheesytest2",path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK,
                identifier);

        final Block modBlock = Blocks.register(registryKey, blockFactory, settings);

        Items.register(modBlock);

        return modBlock;
    }

    public static void initialize() {

    }
}
