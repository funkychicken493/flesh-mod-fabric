package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.block.flesh.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.funkychicken493.flesh.Flesh.ModInfo.MOD_ID;
import static io.github.funkychicken493.flesh.init.Base.BLOCK_ITEM_BASE;

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
        registerBlock(FLESH_BLOCK_BUTTON, "flesh_button");
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
        registerItem(FLESH_BLOCK_ITEM, "flesh_block");
        registerItem(FLESH_LANTERN_ITEM, "flesh_lantern");
        registerItem(FLESH_BLOCK_SLAB_ITEM, "flesh_slab");
        registerItem(FLESH_BLOCK_STAIRS_ITEM, "flesh_stairs");
        registerItem(FLESH_BLOCK_WALL_ITEM, "flesh_wall");
        registerItem(FLESH_BLOCK_FENCE_ITEM, "flesh_fence");
        registerItem(FLESH_BLOCK_FENCE_GATE_ITEM, "flesh_fence_gate");
        registerItem(FLESH_BLOCK_BUTTON_ITEM, "flesh_button");
        registerItem(FLESH_BRICK_BLOCK_ITEM, "flesh_brick_block");
        registerItem(FLESH_BRICK_BLOCK_SLAB_ITEM, "flesh_brick_slab");
        registerItem(FLESH_BRICK_BLOCK_STAIRS_ITEM, "flesh_brick_stairs");
        registerItem(FLESH_BRICK_BLOCK_WALL_ITEM, "flesh_brick_wall");
        registerItem(HARDENED_FLESH_BLOCK_ITEM, "hardened_flesh_block");
        registerItem(HARDENED_FLESH_BLOCK_SLAB_ITEM, "hardened_flesh_slab");
        registerItem(HARDENED_FLESH_BLOCK_STAIRS_ITEM, "hardened_flesh_stairs");
        registerItem(HARDENED_FLESH_BLOCK_WALL_ITEM, "hardened_flesh_wall");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_ITEM, "hardened_flesh_brick_block");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM, "hardened_flesh_brick_slab");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM, "hardened_flesh_brick_stairs");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM, "hardened_flesh_brick_wall");
    }

    //init blocks
    public static final Block FLESH_BLOCK = new FallingBlock(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_LANTERN = new FallingBlock(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).luminance(10).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_SLAB = new FleshBlockSlab(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_STAIRS = new FleshBlockStairs(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_WALL = new FleshBlockWall(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_FENCE = new FleshBlockFence(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_FENCE_GATE = new FleshBlockFenceGate(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f));
    public static final Block FLESH_BLOCK_BUTTON = new FleshBlockButton(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(1.0f).collidable(false).slipperiness(0.66f));
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
    public static final Item FLESH_BLOCK_ITEM = new BlockItem(FLESH_BLOCK, BLOCK_ITEM_BASE);
    public static final Item FLESH_LANTERN_ITEM = new BlockItem(FLESH_LANTERN, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_WALL_ITEM = new BlockItem(FLESH_BLOCK_WALL, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_FENCE_ITEM = new BlockItem(FLESH_BLOCK_FENCE, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_FENCE_GATE_ITEM = new BlockItem(FLESH_BLOCK_FENCE_GATE, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_BUTTON_ITEM = new BlockItem(FLESH_BLOCK_BUTTON, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_ITEM = new BlockItem(FLESH_BRICK_BLOCK, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BRICK_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BRICK_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(FLESH_BRICK_BLOCK_WALL, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BLOCK, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_WALL, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_WALL, BLOCK_ITEM_BASE);

    private static class StairsAccess extends StairsBlock {
        private StairsAccess(FabricBlockSettings settings) {
            super(Blocks.COBBLESTONE_STAIRS.getDefaultState(), settings);
        }
    }

    public static void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }
}
