package com.customskins;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConfigManager {
    private static final String SKINS_FOLDER = ".minecraft/config/customskins/skins";

    public static void createSkinsFolder() {
        try {
            Path skinsPath = Paths.get(System.getProperty("user.home"), SKINS_FOLDER);
            if (!Files.exists(skinsPath)) {
                Files.createDirectories(skinsPath);
                CustomSkinsModClient.LOGGER.info("Created skins folder at: " + skinsPath);
            }
        } catch (Exception e) {
            CustomSkinsModClient.LOGGER.error("Failed to create skins folder", e);
        }
    }

    public static Path getSkinsFolder() {
        return Paths.get(System.getProperty("user.home"), SKINS_FOLDER);
    }
}
