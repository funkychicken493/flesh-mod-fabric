package io.github.funkychicken493;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.funkychicken493.init.FleshBlocks.FLESH_BLOCK_ITEM;
import static io.github.funkychicken493.init.FleshBlocks.FleshBlocksInit;
import static io.github.funkychicken493.init.FleshItems.FLESH_PASTE;
import static io.github.funkychicken493.init.FleshItems.FleshItemsInit;
import static io.github.funkychicken493.util.FleshUtils.FleshPasteDrops.getFleshPasteDroppers;
import static io.github.funkychicken493.util.FleshUtils.ItemGroupBuilder.buildItemGroups;

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
		LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
			for (Identifier identifier : getFleshPasteDroppers()) {
				if (identifier.equals(id)) {
					FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
							.rolls(ConstantLootNumberProvider.create(3))
							.with(ItemEntry.builder(FLESH_PASTE).weight(10))
							.with(ItemEntry.builder(Blocks.AIR.asItem()).weight(50))
							.with(ItemEntry.builder(FLESH_BLOCK_ITEM).weight(1));
					table.pool(poolBuilder);
				}
			}
		});

		//Mod initialization is complete, print a message to the console
		LOGGER.info("Version: " + MOD_VERSION);
		LOGGER.info("Author: " + MOD_AUTHOR);
		LOGGER.info("Initialized.");
	}
}
