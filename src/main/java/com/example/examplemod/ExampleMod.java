package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.NAME, version = ExampleMod.VERSION, dependencies = ExampleMod.DEPENDENCIES)
public class ExampleMod {

	public static final String MOD_ID = "examplemod";
	public static final String NAME = "ExampleMod";
	public static final String VERSION = "0@VERSION@";
	public static final String DEPENDENCIES = "required-after:mixinconbooter;";
	public static final Logger LOGGER = LogManager.getLogger();

	@SidedProxy(
			clientSide = "com.example.examplemod.client.ExampleModClientProxy",
			serverSide = "com.example.examplemod.ExampleModCommonProxy",
			modId = ExampleMod.MOD_ID)
	public static ExampleModCommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.info("Hello, from example mod preInit");
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Hello, from example mod init");
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LOGGER.info("Hello, from example mod postInit");
		proxy.postInit(event);
	}
}
