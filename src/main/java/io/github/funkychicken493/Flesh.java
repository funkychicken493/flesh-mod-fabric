package io.github.funkychicken493;

import io.github.funkychicken493.block.*;
import io.github.funkychicken493.item.FleshBrick;
import io.github.funkychicken493.item.FleshPaste;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class Flesh implements ModInitializer {
	//init mod information
	public static final String MOD_ID = "flesh";
	public static final String MOD_NAME = "Flesh";
	public static final String MOD_VERSION = "1.0.0";
	public static final String MOD_AUTHOR = "funkychicken493";

	//init logger provided by slf4j
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	//init blocks
	private static final FleshBlock FLESH_BLOCK = new FleshBlock();
	private static final FleshBlockLantern FLESH_LANTERN = new FleshBlockLantern();
	private static final FleshBlockSlab FLESH_BLOCK_SLAB = new FleshBlockSlab();
	private static final FleshBlockStairs FLESH_BLOCK_STAIRS = new FleshBlockStairs();
	private static final FleshBlockWall FLESH_BLOCK_WALL = new FleshBlockWall();
	private static final FleshBrickBlock FLESH_BRICK_BLOCK = new FleshBrickBlock();
	private static final FleshBrickBlockSlab FLESH_BRICK_BLOCK_SLAB = new FleshBrickBlockSlab();
	private static final FleshBrickBlockStairs FLESH_BRICK_BLOCK_STAIRS = new FleshBrickBlockStairs();
	private static final FleshBrickBlockWall FLESH_BRICK_BLOCK_WALL = new FleshBrickBlockWall();

	//init items
	private static final FleshPaste FLESH_PASTE = new FleshPaste();
	private static final FleshBrick FLESH_BRICK = new FleshBrick();

	//init items for the blocks
	private static final BlockItem FLESH_BLOCK_ITEM = new BlockItem(FLESH_BLOCK, new FabricItemSettings());
	private static final BlockItem FLESH_LANTERN_ITEM = new BlockItem(FLESH_LANTERN, new FabricItemSettings());
	private static final BlockItem FLESH_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BLOCK_SLAB, new FabricItemSettings());
	private static final BlockItem FLESH_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BLOCK_STAIRS, new FabricItemSettings());
	private static final BlockItem FLESH_BLOCK_WALL_ITEM = new BlockItem(FLESH_BLOCK_WALL, new FabricItemSettings());
	private static final BlockItem FLESH_BRICK_BLOCK_ITEM = new BlockItem(FLESH_BRICK_BLOCK, new FabricItemSettings());
	private static final BlockItem FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BRICK_BLOCK_SLAB, new FabricItemSettings());
	private static final BlockItem FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BRICK_BLOCK_STAIRS, new FabricItemSettings());
	private static final BlockItem FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(FLESH_BRICK_BLOCK_WALL, new FabricItemSettings());

	//init itemgroup items
	@SuppressWarnings("unused")
	public static final ItemGroup FLESH_GROUP_ITEMS = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "items"))
			.icon(() -> new ItemStack(FLESH_PASTE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FLESH_PASTE));
				stacks.add(new ItemStack(FLESH_BRICK));
			})
			.build();

	//init itemgroup blocks
	@SuppressWarnings("unused")
	public static final ItemGroup FLESH_GROUP_BLOCKS = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "blocks"))
			.icon(() -> new ItemStack(FLESH_BLOCK_ITEM))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FLESH_BLOCK_ITEM));
				stacks.add(new ItemStack(FLESH_LANTERN_ITEM));
				stacks.add(new ItemStack(FLESH_BLOCK_SLAB_ITEM));
				stacks.add(new ItemStack(FLESH_BLOCK_STAIRS_ITEM));
				stacks.add(new ItemStack(FLESH_BLOCK_WALL_ITEM));
				stacks.add(new ItemStack(FLESH_BRICK_BLOCK_ITEM));
				stacks.add(new ItemStack(FLESH_BRICK_BLOCK_SLAB_ITEM));
				stacks.add(new ItemStack(FLESH_BRICK_BLOCK_STAIRS_ITEM));
				stacks.add(new ItemStack(FLESH_BRICK_BLOCK_WALL_ITEM));
			})
			.build();

	@Override
	public void onInitialize() {

		//I'd like to make it known that GitHub Copilot generated this code.
		LOGGER.info("Flesh is flesh. Where there's smoke there's fire.");
		LOGGER.info("Flesh Mod Initializing...");

		//Register the blocks + their item forms
		try {
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block"), FLESH_BLOCK);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block"), FLESH_BLOCK_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_lantern"), FLESH_LANTERN);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_lantern"), FLESH_LANTERN_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block_slab"), FLESH_BLOCK_SLAB);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block_slab"), FLESH_BLOCK_SLAB_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block_stairs"), FLESH_BLOCK_STAIRS);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block_stairs"), FLESH_BLOCK_STAIRS_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block_wall"), FLESH_BLOCK_WALL);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block_wall"), FLESH_BLOCK_WALL_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_block"), FLESH_BRICK_BLOCK);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_block"), FLESH_BRICK_BLOCK_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_slab"), FLESH_BRICK_BLOCK_SLAB);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_slab"), FLESH_BRICK_BLOCK_SLAB_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_stairs"), FLESH_BRICK_BLOCK_STAIRS);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_stairs"), FLESH_BRICK_BLOCK_STAIRS_ITEM);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_wall"), FLESH_BRICK_BLOCK_WALL);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_wall"), FLESH_BRICK_BLOCK_WALL_ITEM);
		} catch (Exception e) {
			LOGGER.error("Failed to register blocks!");
			LOGGER.error(e.getMessage());
		}

		//Register the items
		try {
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_paste"), FLESH_PASTE);
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick"), FLESH_BRICK);
		} catch (Exception e) {
			LOGGER.error("Failed to register items!");
			LOGGER.error(e.getMessage());
		}

		LOGGER.info("Minecraft Mod-loader: " + MinecraftClient.getInstance().getGameVersion());
		LOGGER.info("Minecraft Version: " + MinecraftClient.getInstance().getName());
		LOGGER.info("Flesh Mod Version: " + MOD_VERSION);
		LOGGER.info("Flesh Mod Author: " + MOD_AUTHOR);
		LOGGER.info("Flesh Mod Initialized.");
	}
}
