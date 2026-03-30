package com.customskins;

import net.minecraft.client.texture.NativeImage;
import java.io.File;
import java.nio.file.Path;

public class SkinLoader {
    private static NativeImage customSkinImage;

    public static void loadCustomSkin() {
        try {
            Path skinsFolder = ConfigManager.getSkinsFolder();
            File skinFile = skinsFolder.resolve("custom_skin.png").toFile();

            if (skinFile.exists()) {
                customSkinImage = NativeImage.read(NativeImage.Format.RGBA, skinFile.toURI().toURL().openStream());
                CustomSkinsModClient.LOGGER.info("Custom skin loaded successfully!");
            } else {
                CustomSkinsModClient.LOGGER.info("No custom skin found. Place custom_skin.png in the skins folder.");
            }
        } catch (Exception e) {
            CustomSkinsModClient.LOGGER.error("Failed to load custom skin", e);
        }
    }

    public static NativeImage getCustomSkin() {
        return customSkinImage;
    }
}
