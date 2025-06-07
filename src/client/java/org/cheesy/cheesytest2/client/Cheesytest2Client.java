package org.cheesy.cheesytest2.client;

import net.fabricmc.api.ClientModInitializer;
import org.cheesy.cheesytest2.CheesyModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cheesytest2Client implements ClientModInitializer {

    public static final String MOD_ID = "cheesytest2";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("*******TEST LOG********");
        CheesyModItems.initialize();
    }
}
