package com.customskins;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomSkinsModClient implements ClientModInitializer {
    public static final String MOD_ID = "customskins";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Custom Skins Mod initialized!");
        ConfigManager.createSkinsFolder();
    }
}
