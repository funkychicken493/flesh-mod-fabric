package io.github.funkychicken493.flesh;

import io.github.funkychicken493.flesh.init.Initialization;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Flesh.
 */
public class FleshMod implements ModInitializer {
    //Override the initialize method to register my stuff
    @Override
    public void onInitialize() {

        //I'd like to make it known that GitHub Copilot generated this code.
        ModInfo.LOGGER.info("Flesh is flesh. Where there's smoke there's fire.");
        ModInfo.LOGGER.info("Initializing...");

        Initialization.everything();

        //Mod initialization is complete, print a message to the console
        ModInfo.LOGGER.info("Version: " + ModInfo.MOD_VERSION);
        ModInfo.LOGGER.info("Author: " + ModInfo.MOD_AUTHOR);
        ModInfo.LOGGER.info("Initialized.");
    }

    /**
     * Constants for the mod's information.
     */
//Initialize mod information
    @SuppressWarnings("unused")
    public static final class ModInfo {
        /**
         * Mod ID.
         */
        public static final String MOD_ID = "flesh";
        /**
         * Mod name.
         */
        public static final String MOD_NAME = "Flesh Mod";
        /**
         * Version.
         */
        public static final String MOD_VERSION = "1.0.0";
        /**
         * ME.
         */
        public static final String MOD_AUTHOR = "funkychicken493";
        /**
         * The logger used for logging the logs of the logging mod.
         */
        //init logger provided by slf4j
        public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    }
}
