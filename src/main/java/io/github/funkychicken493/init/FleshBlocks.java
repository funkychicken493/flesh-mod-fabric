package io.github.funkychicken493.init;

import io.github.funkychicken493.block.FleshBlock.*;
import io.github.funkychicken493.block.FleshBrickBlock.FleshBrickBlock;
import io.github.funkychicken493.block.FleshBrickBlock.FleshBrickBlockSlab;
import io.github.funkychicken493.block.FleshBrickBlock.FleshBrickBlockStairs;
import io.github.funkychicken493.block.FleshBrickBlock.FleshBrickBlockWall;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.funkychicken493.Flesh.MOD_ID;
import static io.github.funkychicken493.block.FleshBlock.FleshBlockBase.FLESH_BLOCK_BASE;

public class FleshBlocks {

    public static void FleshBlocksInit() {
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block"), FLESH_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_lantern"), FLESH_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block_slab"), FLESH_BLOCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block_stairs"), FLESH_BLOCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_block_wall"), FLESH_BLOCK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_block"), FLESH_BRICK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_slab"), FLESH_BRICK_BLOCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_stairs"), FLESH_BRICK_BLOCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "flesh_brick_wall"), FLESH_BRICK_BLOCK_WALL);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block"), FLESH_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_lantern"), FLESH_LANTERN_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block_slab"), FLESH_BLOCK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block_stairs"), FLESH_BLOCK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_block_wall"), FLESH_BLOCK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_block"), FLESH_BRICK_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_slab"), FLESH_BRICK_BLOCK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_stairs"), FLESH_BRICK_BLOCK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh_brick_wall"), FLESH_BRICK_BLOCK_WALL_ITEM);
    }

    //init blocks
    public static final Block FLESH_BLOCK = new FleshBlock();
    public static final Block FLESH_LANTERN = new FleshBlockLantern();
    public static final Block FLESH_BLOCK_SLAB = new FleshBlockSlab(FLESH_BLOCK_BASE);
    public static final Block FLESH_BLOCK_STAIRS = new FleshBlockStairs();
    public static final Block FLESH_BLOCK_WALL = new FleshBlockWall();
    public static final Block FLESH_BRICK_BLOCK = new FleshBrickBlock();
    public static final Block FLESH_BRICK_BLOCK_SLAB = new FleshBrickBlockSlab();
    public static final Block FLESH_BRICK_BLOCK_STAIRS = new FleshBrickBlockStairs();
    public static final Block FLESH_BRICK_BLOCK_WALL = new FleshBrickBlockWall();

    //init items for the blocks
    public static final BlockItem FLESH_BLOCK_ITEM = new BlockItem(FLESH_BLOCK, new FabricItemSettings());
    public static final BlockItem FLESH_LANTERN_ITEM = new BlockItem(FLESH_LANTERN, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_WALL_ITEM = new BlockItem(FLESH_BLOCK_WALL, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_ITEM = new BlockItem(FLESH_BRICK_BLOCK, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BRICK_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BRICK_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(FLESH_BRICK_BLOCK_WALL, new FabricItemSettings());
}
