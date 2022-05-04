package io.github.funkychicken493;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.funkychicken493.init.InitializeEverything.InitEverything;

public class Flesh implements ModInitializer {
	//init mod information
	public static final String MOD_ID = "flesh";
	public static final String MOD_NAME = "Flesh Mod";
	public static final String MOD_VERSION = "1.0.0";
	public static final String MOD_AUTHOR = "funkychicken493";

	//init logger provided by slf4j
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	//Override the initialize method to register my stuff
	@Override
	public void onInitialize() {

		//I'd like to make it known that GitHub Copilot generated this code.
		LOGGER.info("Flesh is flesh. Where there's smoke there's fire.");
		LOGGER.info("Initializing...");

		InitEverything();

		//Mod initialization is complete, print a message to the console
		LOGGER.info("Version: " + MOD_VERSION);
		LOGGER.info("Author: " + MOD_AUTHOR);
		LOGGER.info("Initialized.");
	}
}
