package com.example.examplemod.mixin.nei;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.example.examplemod.ExampleMod;

import codechicken.nei.ClientHandler;

@Mixin(ClientHandler.class)
public class ExampleLateMixin {

	@Inject(at = @At("HEAD"), method = "preInit", remap = false)
	private static void onPreInit(CallbackInfo info) {
		ExampleMod.LOGGER.info("Hello, from example mod late mixin");
	}
}
