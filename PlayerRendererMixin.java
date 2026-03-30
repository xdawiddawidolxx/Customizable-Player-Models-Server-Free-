package com.customskins.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.model.ModelPart;

@Mixin(PlayerEntityRenderer.class)
public class PlayerRendererMixin {
    @Inject(method = "renderArm", at = @At("HEAD"), cancellable = true)
    private static void onRenderArm(ModelPart arm, boolean showArm, boolean leftArm, CallbackInfo ci) {
        // Custom skin rendering hook
    }
}
