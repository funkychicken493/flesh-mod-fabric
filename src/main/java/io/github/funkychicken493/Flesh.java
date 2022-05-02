package io.github.funkychicken493;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.funkychicken493.init.FleshBlocks.FLESH_BLOCK_ITEM;
import static io.github.funkychicken493.init.FleshBlocks.FleshBlocksInit;
import static io.github.funkychicken493.init.FleshGroupBuilder.buildItemGroups;
import static io.github.funkychicken493.init.FleshItems.*;
import static io.github.funkychicken493.util.FleshUtils.AIR;
import static io.github.funkychicken493.util.FleshUtils.DropRegistry.boneMarrowDroppers;
import static io.github.funkychicken493.util.FleshUtils.DropRegistry.fleshPasteDroppers;

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

		//Build the item groups before they are needed
		@SuppressWarnings("unused")
		final ItemGroup[] FLESH_ITEM_GROUPS = buildItemGroups();

		//Register the blocks + their item forms
		try {
			FleshBlocksInit();
		} catch (Exception e) {
			//Catch any exceptions and log them
			LOGGER.error("Failed to register blocks!\n" + e.getMessage());
		}

		//Register the items
		try {
			FleshItemsInit();
		} catch (Exception e) {
			//Catch any exceptions and log them
			LOGGER.error("Failed to register items!\n" + e.getMessage());
		}

		//Register the loot tables for flesh paste
		try {
			LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
				FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
						.rolls(ConstantLootNumberProvider.create(3))
						.with(ItemEntry.builder(AIR).weight(90));
				for (Identifier identifier : fleshPasteDroppers()) {
					if (identifier.equals(id)) {
						poolBuilder.with(ItemEntry.builder(FLESH_PASTE).weight(20));
						poolBuilder.with(ItemEntry.builder(FLESH_BLOCK_ITEM).weight(1));
					}
				}
				for (Identifier identifier : boneMarrowDroppers()) {
					if(identifier.equals(id)) {
						poolBuilder.with(ItemEntry.builder(BONE_MARROW).weight(10));
					}
				}
				table.pool(poolBuilder);
			});
		} catch (Exception e) {
			//Catch any exceptions and log them
			LOGGER.error("Failed to register loot tables!\n" + e.getMessage());
		}

		//Mod initialization is complete, print a message to the console
		LOGGER.info("Version: " + MOD_VERSION);
		LOGGER.info("Author: " + MOD_AUTHOR);
		LOGGER.info("Initialized.");
	}
}
