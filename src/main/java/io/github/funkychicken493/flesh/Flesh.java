package io.github.funkychicken493.flesh;

import io.github.funkychicken493.flesh.init.InitEverything;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flesh implements ModInitializer {
	//Initialize mod information
	public static final class ModInfo{
		public static final String MOD_ID = "flesh";
		public static final String MOD_NAME = "Flesh Mod";
		public static final String MOD_VERSION = "1.0.0";
		public static final String MOD_AUTHOR = "funkychicken493";
		//init logger provided by slf4j
		public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
	}

	//Override the initialize method to register my stuff
	@Override
	public void onInitialize() {

		//I'd like to make it known that GitHub Copilot generated this code.
		ModInfo.LOGGER.info("Flesh is flesh. Where there's smoke there's fire.");
		ModInfo.LOGGER.info("Initializing...");

		try {
			InitEverything.EverythingInit();
		} catch (Exception e) {
			ModInfo.LOGGER.error(String.valueOf(e));
		}

		//Mod initialization is complete, print a message to the console
		ModInfo.LOGGER.info("Version: " + ModInfo.MOD_VERSION);
		ModInfo.LOGGER.info("Author: " + ModInfo.MOD_AUTHOR);
		ModInfo.LOGGER.info("Initialized.");
	}
}
