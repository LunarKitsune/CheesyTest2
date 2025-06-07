package org.cheesy.cheesytest2;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class CheesyModBlocks {


    public static final Block Cheesite_Block = register("cheesite_block",Block::new,
            AbstractBlock.Settings.create()
                    .strength(4.0f)
                    .sounds(BlockSoundGroup.CHAIN), true
    );

    public static Logger blockRegisterLogger =
            LoggerFactory.getLogger(Cheesytest2.MOD_ID);

    private static Block register(String path, Function<AbstractBlock.Settings,
                Block> blockFactory, AbstractBlock.Settings settings,
                                  boolean shouldRegisterItem){

        final Identifier identifier = Identifier.of("cheesytest2",path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK,
                identifier);

        final Block modBlock = Blocks.register(registryKey, blockFactory, settings);

        Items.register(modBlock);

        return modBlock;
    }



    public static void initialize() {
        blockRegisterLogger.info("BlockRegistry Successful");

    }
}
