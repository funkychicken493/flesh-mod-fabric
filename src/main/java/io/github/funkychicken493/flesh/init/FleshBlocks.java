package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.block.Base;
import io.github.funkychicken493.flesh.block.flesh.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.funkychicken493.flesh.Flesh.ModInfo.MOD_ID;
import static io.github.funkychicken493.flesh.init.InitEverything.FLESH_GROUP_BLOCKS;

public class FleshBlocks {
    public static void FleshBlocksInit() {
        //Blocks
        registerBlock(FLESH_BLOCK, "flesh_block");
        registerBlock(FLESH_LANTERN, "flesh_lantern");
        registerBlock(FLESH_BLOCK_SLAB, "flesh_slab");
        registerBlock(FLESH_BLOCK_STAIRS, "flesh_stairs");
        registerBlock(FLESH_BLOCK_WALL, "flesh_wall");
        registerBlock(FLESH_BLOCK_FENCE, "flesh_fence");
        registerBlock(FLESH_BLOCK_FENCE_GATE, "flesh_fence_gate");
        registerBlock(FLESH_BRICK_BLOCK, "flesh_brick_block");
        registerBlock(FLESH_BRICK_BLOCK_SLAB, "flesh_brick_slab");
        registerBlock(FLESH_BRICK_BLOCK_STAIRS, "flesh_brick_stairs");
        registerBlock(FLESH_BRICK_BLOCK_WALL, "flesh_brick_wall");
        registerBlock(HARDENED_FLESH_BLOCK, "hardened_flesh_block");
        registerBlock(HARDENED_FLESH_BLOCK_SLAB, "hardened_flesh_slab");
        registerBlock(HARDENED_FLESH_BLOCK_STAIRS, "hardened_flesh_stairs");
        registerBlock(HARDENED_FLESH_BLOCK_WALL, "hardened_flesh_wall");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK, "hardened_flesh_brick_block");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_SLAB, "hardened_flesh_brick_slab");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_STAIRS, "hardened_flesh_brick_stairs");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_WALL, "hardened_flesh_brick_wall");

        //Block Items
        registerBlockItem(FLESH_BLOCK_ITEM, "flesh_block");
        registerBlockItem(FLESH_LANTERN_ITEM, "flesh_lantern");
        registerBlockItem(FLESH_BLOCK_SLAB_ITEM, "flesh_slab");
        registerBlockItem(FLESH_BLOCK_STAIRS_ITEM, "flesh_stairs");
        registerBlockItem(FLESH_BLOCK_WALL_ITEM, "flesh_wall");
        registerBlockItem(FLESH_BRICK_BLOCK_ITEM, "flesh_brick_block");
        registerBlockItem(FLESH_BRICK_BLOCK_SLAB_ITEM, "flesh_brick_slab");
        registerBlockItem(FLESH_BRICK_BLOCK_STAIRS_ITEM, "flesh_brick_stairs");
        registerBlockItem(FLESH_BRICK_BLOCK_WALL_ITEM, "flesh_brick_wall");
        registerBlockItem(FLESH_BLOCK_FENCE_ITEM, "flesh_fence");
        registerBlockItem(FLESH_BLOCK_FENCE_GATE_ITEM, "flesh_fence_gate");
        registerBlockItem(HARDENED_FLESH_BLOCK_ITEM, "hardened_flesh_block");
        registerBlockItem(HARDENED_FLESH_BLOCK_SLAB_ITEM, "hardened_flesh_slab");
        registerBlockItem(HARDENED_FLESH_BLOCK_STAIRS_ITEM, "hardened_flesh_stairs");
        registerBlockItem(HARDENED_FLESH_BLOCK_WALL_ITEM, "hardened_flesh_wall");
        registerBlockItem(HARDENED_FLESH_BRICK_BLOCK_ITEM, "hardened_flesh_brick_block");
        registerBlockItem(HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM, "hardened_flesh_brick_slab");
        registerBlockItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM, "hardened_flesh_brick_stairs");
        registerBlockItem(HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM, "hardened_flesh_brick_wall");
    }

    //init blocks
    public static final Block FLESH_BLOCK = new FallingBlock(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_LANTERN = new FallingBlock(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).luminance(10).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_SLAB = new FleshBlockSlab(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_STAIRS = new FleshBlockStairs(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_WALL = new FleshBlockWall(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_FENCE = new FleshBlockFence(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_FENCE_GATE = new FleshBlockFenceGate(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BRICK_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_STAIRS = new StairsAccess(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_STAIRS = new StairsAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_STAIRS = new StairsAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));

    //init items for the blocks
    public static final BlockItem FLESH_BLOCK_ITEM = new BlockItem(FLESH_BLOCK, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_LANTERN_ITEM = new BlockItem(FLESH_LANTERN, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BLOCK_SLAB, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BLOCK_STAIRS, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BLOCK_WALL_ITEM = new BlockItem(FLESH_BLOCK_WALL, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BLOCK_FENCE_ITEM = new BlockItem(FLESH_BLOCK_FENCE, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BLOCK_FENCE_GATE_ITEM = new BlockItem(FLESH_BLOCK_FENCE_GATE, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BRICK_BLOCK_ITEM = new BlockItem(FLESH_BRICK_BLOCK, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BRICK_BLOCK_SLAB, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BRICK_BLOCK_STAIRS, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(FLESH_BRICK_BLOCK_WALL, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BLOCK, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_SLAB, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_STAIRS, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_WALL, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_SLAB, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_WALL, new FabricItemSettings().group(FLESH_GROUP_BLOCKS));

    private static class StairsAccess extends StairsBlock {
        private StairsAccess(FabricBlockSettings settings) {
            super(Blocks.COBBLESTONE_STAIRS.getDefaultState(), settings);
        }
    }

    public static void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void registerBlockItem(BlockItem item, String name) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }
}
