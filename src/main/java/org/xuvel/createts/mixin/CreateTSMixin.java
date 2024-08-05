package org.xuvel.createts.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class CreateTSMixin {
	@Inject(method = "loadWorld", at = @At("HEAD"))
	private void keybind$onLoadWorld(CallbackInfo ci) {
		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}