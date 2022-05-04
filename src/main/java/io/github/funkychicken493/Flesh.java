package io.github.funkychicken493;

import io.github.funkychicken493.util.FleshUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemGroup;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

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

	public static final GameRules.Key<GameRules.BooleanRule> SHOULD_DROP_BONE_MARROW =
			GameRuleRegistry.register("shouldDropBoneMarrow", GameRules.Category.MOBS, GameRuleFactory.createBooleanRule(true));


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
						poolBuilder.with(ItemEntry.builder(FLESH_PASTE).weight(30));
						poolBuilder.with(ItemEntry.builder(FLESH_BLOCK_ITEM).weight(2));
					}
				}
				for (Identifier identifier : boneMarrowDroppers()) {
					if(identifier.equals(id)) {
						poolBuilder.with(ItemEntry.builder(BONE_MARROW).weight(40));
					}
				}
				table.pool(poolBuilder);
			});
		} catch (Exception e) {
			//Catch any exceptions and log them
			LOGGER.error("Failed to register loot tables!\n" + e.getMessage());
		}

		try {
			String s = File.separator;
			String splashes = new String(MinecraftClient.getInstance().getResourcePackProvider().getPack().open(ResourceType.CLIENT_RESOURCES, new Identifier("texts/splashes.txt")).readAllBytes());
			String path = Flesh.class.getProtectionDomain().getCodeSource().getLocation()
					.toURI().getPath().replaceAll(s + "build" + s + "classes"  + s + "java"  + s + "main", "");
			String pathfull = path + "src" + s + "main" + s + "resources" + s + "assets" + s + "minecraft" + s + "texts" + s + "splashes.txt";
			LOGGER.info(pathfull);
			File f = new File(pathfull);
			if (f.createNewFile()) {
				LOGGER.info("File created: " + f.getName());
			} else {
				LOGGER.info("File already exists.");
			}
			FileWriter fw = new FileWriter(f.getAbsoluteFile());
			//fw.write(splashes);
			fw.write(splashes);
			fw.append("""
					Now with 30% more flesh!
					Make a meat castle!
					Flesh paste!!!!
					Bone marrow!!!!
					It's a fleshy world!
					Flesh is flesh. Where there's smoke there's fire.
					the end is never the end is never the end is never the end
					funky fresh
					funky flesh
					Flesh belongs on pizza!
					It's an awful world!
					My reasoning? Flesh!
					100% bone free!
					squishy!
					Now without glowing flesh paste slabs!
					Flesh paste will NOT give you hunger!
					Rotten flesh is better than no flesh!
					Flesh from the dead!
					Try cooking flesh paste blocks!
					Flesh paste is the best paste!
					Literally 1984!
					Flesh exists for a reason!
					"""
			);
			fw.close();
		} catch (Exception e) {
			LOGGER.error(String.valueOf(e));
		}

		//Mod initialization is complete, print a message to the console
		LOGGER.info("Version: " + MOD_VERSION);
		LOGGER.info("Author: " + MOD_AUTHOR);
		LOGGER.info("Initialized.");
	}
}
