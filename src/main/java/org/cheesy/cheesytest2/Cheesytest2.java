package org.cheesy.cheesytest2;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cheesytest2 implements ModInitializer {

    public static final String MOD_ID = "cheesytest2";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        LOGGER.info("MAIN MOD INITIATED SUCCESSFULLY");
        CheesyModItems.initialize();
        CheesyModBlocks.initialize();



    }
}
