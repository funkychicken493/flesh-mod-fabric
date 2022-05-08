package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.block.Base;
import io.github.funkychicken493.flesh.block.flesh.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.funkychicken493.flesh.Flesh.ModInfo.MOD_ID;

public class FleshBlocks {

    public static void FleshBlocksInit() {
        //Blocks
        register(FLESH_BLOCK, "flesh_block");
        register(FLESH_LANTERN, "flesh_lantern");
        register(FLESH_BLOCK_SLAB, "flesh_slab");
        register(FLESH_BLOCK_STAIRS, "flesh_stairs");
        register(FLESH_BLOCK_WALL, "flesh_wall");
        register(FLESH_BLOCK_FENCE, "flesh_fence");
        register(FLESH_BLOCK_FENCE_GATE, "flesh_fence_gate");
        register(FLESH_BRICK_BLOCK, "flesh_brick_block");
        register(FLESH_BRICK_BLOCK_SLAB, "flesh_brick_slab");
        register(FLESH_BRICK_BLOCK_STAIRS, "flesh_brick_stairs");
        register(FLESH_BRICK_BLOCK_WALL, "flesh_brick_wall");
        register(HARDENED_FLESH_BLOCK, "hardened_flesh_block");
        register(HARDENED_FLESH_BLOCK_SLAB, "hardened_flesh_slab");
        register(HARDENED_FLESH_BLOCK_STAIRS, "hardened_flesh_stairs");
        register(HARDENED_FLESH_BLOCK_WALL, "hardened_flesh_wall");
        register(HARDENED_FLESH_BRICK_BLOCK, "hardened_flesh_brick_block");
        register(HARDENED_FLESH_BRICK_BLOCK_SLAB, "hardened_flesh_brick_slab");
        register(HARDENED_FLESH_BRICK_BLOCK_STAIRS, "hardened_flesh_brick_stairs");
        register(HARDENED_FLESH_BRICK_BLOCK_WALL, "hardened_flesh_brick_wall");

        //Block Items
        register(FLESH_BLOCK_ITEM, "flesh_block");
        register(FLESH_LANTERN_ITEM, "flesh_lantern");
        register(FLESH_BLOCK_SLAB_ITEM, "flesh_slab");
        register(FLESH_BLOCK_STAIRS_ITEM, "flesh_stairs");
        register(FLESH_BLOCK_WALL_ITEM, "flesh_wall");
        register(FLESH_BRICK_BLOCK_ITEM, "flesh_brick_block");
        register(FLESH_BRICK_BLOCK_SLAB_ITEM, "flesh_brick_slab");
        register(FLESH_BRICK_BLOCK_STAIRS_ITEM, "flesh_brick_stairs");
        register(FLESH_BRICK_BLOCK_WALL_ITEM, "flesh_brick_wall");
        register(FLESH_BLOCK_FENCE_ITEM, "flesh_fence");
        register(FLESH_BLOCK_FENCE_GATE_ITEM, "flesh_fence_gate");
        register(HARDENED_FLESH_BLOCK_ITEM, "hardened_flesh_block");
        register(HARDENED_FLESH_BLOCK_SLAB_ITEM, "hardened_flesh_slab");
        register(HARDENED_FLESH_BLOCK_STAIRS_ITEM, "hardened_flesh_stairs");
        register(HARDENED_FLESH_BLOCK_WALL_ITEM, "hardened_flesh_wall");
        register(HARDENED_FLESH_BRICK_BLOCK_ITEM, "hardened_flesh_brick_block");
        register(HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM, "hardened_flesh_brick_slab");
        register(HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM, "hardened_flesh_brick_stairs");
        register(HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM, "hardened_flesh_brick_wall");
    }

    //init blocks
    public static final Block FLESH_BLOCK = new FallingBlock(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_LANTERN = new FallingBlock(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).luminance(10).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_SLAB = new FleshBlockSlab(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_STAIRS = new FleshBlockStairs(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_WALL = new FleshBlockWall(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_FENCE = new FleshBlockFence(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_FENCE_GATE = new FleshBlockFenceGate(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BRICK_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE));
    public static final Block FLESH_BRICK_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE));
    public static final Block FLESH_BRICK_BLOCK_STAIRS = new StairsAccess(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE));
    public static final Block FLESH_BRICK_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK_STAIRS = new StairsAccess(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_STAIRS = new StairsAccess(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE));

    //init items for the blocks
    public static final BlockItem FLESH_BLOCK_ITEM = new BlockItem(FLESH_BLOCK, new FabricItemSettings());
    public static final BlockItem FLESH_LANTERN_ITEM = new BlockItem(FLESH_LANTERN, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_WALL_ITEM = new BlockItem(FLESH_BLOCK_WALL, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_FENCE_ITEM = new BlockItem(FLESH_BLOCK_FENCE, new FabricItemSettings());
    public static final BlockItem FLESH_BLOCK_FENCE_GATE_ITEM = new BlockItem(FLESH_BLOCK_FENCE_GATE, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_ITEM = new BlockItem(FLESH_BRICK_BLOCK, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BRICK_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BRICK_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(FLESH_BRICK_BLOCK_WALL, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BLOCK, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_WALL, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_WALL, new FabricItemSettings());

    public static void register(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void register(BlockItem item, String name) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    private static class StairsAccess extends StairsBlock {
        private StairsAccess(BlockState state, FabricBlockSettings settings) {
            super(state, settings);
        }
    }
}
