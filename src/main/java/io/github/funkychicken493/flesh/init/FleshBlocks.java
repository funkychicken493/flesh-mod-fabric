package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.block.flesh.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldAccess;

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
        registerBlock(FLESH_BLOCK_PRESSURE_PLATE, "flesh_pressure_plate");
        registerBlock(FLESH_BRICK_BLOCK, "flesh_brick_block");
        registerBlock(FLESH_BRICK_BLOCK_SLAB, "flesh_brick_slab");
        registerBlock(FLESH_BRICK_BLOCK_STAIRS, "flesh_brick_stairs");
        registerBlock(FLESH_BRICK_BLOCK_WALL, "flesh_brick_wall");
        registerBlock(FLESH_BRICK_BLOCK_FENCE, "flesh_brick_fence");
        registerBlock(FLESH_BRICK_BLOCK_FENCE_GATE, "flesh_brick_fence_gate");
        registerBlock(FLESH_BRICK_BLOCK_BUTTON, "flesh_brick_button");
        registerBlock(FLESH_BRICK_BLOCK_PRESSURE_PLATE, "flesh_brick_pressure_plate");
        registerBlock(HARDENED_FLESH_BLOCK, "hardened_flesh_block");
        registerBlock(HARDENED_FLESH_BLOCK_SLAB, "hardened_flesh_slab");
        registerBlock(HARDENED_FLESH_BLOCK_STAIRS, "hardened_flesh_stairs");
        registerBlock(HARDENED_FLESH_BLOCK_WALL, "hardened_flesh_wall");
        registerBlock(HARDENED_FLESH_BLOCK_FENCE, "hardened_flesh_fence");
        registerBlock(HARDENED_FLESH_BLOCK_FENCE_GATE, "hardened_flesh_fence_gate");
        registerBlock(HARDENED_FLESH_BLOCK_BUTTON, "hardened_flesh_button");
        registerBlock(HARDENED_FLESH_BLOCK_PRESSURE_PLATE, "hardened_flesh_pressure_plate");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK, "hardened_flesh_brick_block");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_SLAB, "hardened_flesh_brick_slab");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_STAIRS, "hardened_flesh_brick_stairs");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_WALL, "hardened_flesh_brick_wall");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_FENCE, "hardened_flesh_brick_fence");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_FENCE_GATE, "hardened_flesh_brick_fence_gate");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_BUTTON, "hardened_flesh_brick_button");
        registerBlock(HARDENED_FLESH_BRICK_BLOCK_PRESSURE_PLATE, "hardened_flesh_brick_pressure_plate");

        //Block Items
        registerItem(FLESH_BLOCK_ITEM, "flesh_block");
        registerItem(FLESH_LANTERN_ITEM, "flesh_lantern");
        registerItem(FLESH_BLOCK_SLAB_ITEM, "flesh_slab");
        registerItem(FLESH_BLOCK_STAIRS_ITEM, "flesh_stairs");
        registerItem(FLESH_BLOCK_WALL_ITEM, "flesh_wall");
        registerItem(FLESH_BLOCK_FENCE_ITEM, "flesh_fence");
        registerItem(FLESH_BLOCK_FENCE_GATE_ITEM, "flesh_fence_gate");
        registerItem(FLESH_BLOCK_BUTTON_ITEM, "flesh_button");
        registerItem(FLESH_BLOCK_PRESSURE_PLATE_ITEM, "flesh_pressure_plate");
        registerItem(FLESH_BRICK_BLOCK_ITEM, "flesh_brick_block");
        registerItem(FLESH_BRICK_BLOCK_SLAB_ITEM, "flesh_brick_slab");
        registerItem(FLESH_BRICK_BLOCK_STAIRS_ITEM, "flesh_brick_stairs");
        registerItem(FLESH_BRICK_BLOCK_WALL_ITEM, "flesh_brick_wall");
        registerItem(FLESH_BRICK_BLOCK_FENCE_ITEM, "flesh_brick_fence");
        registerItem(FLESH_BRICK_BLOCK_FENCE_GATE_ITEM, "flesh_brick_fence_gate");
        registerItem(FLESH_BRICK_BLOCK_BUTTON_ITEM, "flesh_brick_button");
        registerItem(FLESH_BRICK_BLOCK_PRESSURE_PLATE_ITEM, "flesh_brick_pressure_plate");
        registerItem(HARDENED_FLESH_BLOCK_ITEM, "hardened_flesh_block");
        registerItem(HARDENED_FLESH_BLOCK_SLAB_ITEM, "hardened_flesh_slab");
        registerItem(HARDENED_FLESH_BLOCK_STAIRS_ITEM, "hardened_flesh_stairs");
        registerItem(HARDENED_FLESH_BLOCK_WALL_ITEM, "hardened_flesh_wall");
        registerItem(HARDENED_FLESH_BLOCK_FENCE_ITEM, "hardened_flesh_fence");
        registerItem(HARDENED_FLESH_BLOCK_FENCE_GATE_ITEM, "hardened_flesh_fence_gate");
        registerItem(HARDENED_FLESH_BLOCK_BUTTON_ITEM, "hardened_flesh_button");
        registerItem(HARDENED_FLESH_BLOCK_PRESSURE_PLATE_ITEM, "hardened_flesh_pressure_plate");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_ITEM, "hardened_flesh_brick_block");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM, "hardened_flesh_brick_slab");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM, "hardened_flesh_brick_stairs");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM, "hardened_flesh_brick_wall");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_FENCE_ITEM, "hardened_flesh_brick_fence");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_FENCE_GATE_ITEM, "hardened_flesh_brick_fence_gate");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_BUTTON_ITEM, "hardened_flesh_brick_button");
        registerItem(HARDENED_FLESH_BRICK_BLOCK_PRESSURE_PLATE_ITEM, "hardened_flesh_brick_pressure_plate");
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
    public static final Block FLESH_BLOCK_PRESSURE_PLATE = new FleshBlockPressurePlate(FabricBlockSettings.copyOf(Base.FLESH_BLOCK_BASE).jumpVelocityMultiplier(0.1f).collidable(false));
    public static final Block FLESH_BRICK_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_STAIRS = new StairsAccess(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block FLESH_BRICK_BLOCK_BUTTON = new ButtonAccess(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f).collidable(false).slipperiness(0.66f), SoundEvents.BLOCK_SHROOMLIGHT_PLACE);
    public static final Block FLESH_BRICK_BLOCK_PRESSURE_PLATE = new PressurePlateAccess(FabricBlockSettings.copyOf(Base.FLESH_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f).collidable(false), SoundEvents.BLOCK_SHROOMLIGHT_PLACE, SoundEvents.BLOCK_SHROOMLIGHT_BREAK);
    public static final Block HARDENED_FLESH_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_STAIRS = new StairsAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BLOCK_BUTTON = new ButtonAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f).collidable(false).slipperiness(0.66f), SoundEvents.BLOCK_SHROOMLIGHT_PLACE);
    public static final Block HARDENED_FLESH_BLOCK_PRESSURE_PLATE = new PressurePlateAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BLOCK_BASE).jumpVelocityMultiplier(0.85f).collidable(false), SoundEvents.BLOCK_SHROOMLIGHT_PLACE, SoundEvents.BLOCK_SHROOMLIGHT_BREAK);
    public static final Block HARDENED_FLESH_BRICK_BLOCK = new Block(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_STAIRS = new StairsAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_WALL = new WallBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_BUTTON = new ButtonAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f).collidable(false).slipperiness(0.66f), SoundEvents.BLOCK_CALCITE_PLACE);
    public static final Block HARDENED_FLESH_BRICK_BLOCK_PRESSURE_PLATE = new PressurePlateAccess(FabricBlockSettings.copyOf(Base.FLESH_HARDENED_BRICK_BLOCK_BASE).jumpVelocityMultiplier(0.85f).collidable(false), SoundEvents.BLOCK_CALCITE_PLACE, SoundEvents.BLOCK_CALCITE_BREAK);

    //init items for the blocks
    public static final Item FLESH_BLOCK_ITEM = new BlockItem(FLESH_BLOCK, BLOCK_ITEM_BASE);
    public static final Item FLESH_LANTERN_ITEM = new BlockItem(FLESH_LANTERN, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_WALL_ITEM = new BlockItem(FLESH_BLOCK_WALL, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_FENCE_ITEM = new BlockItem(FLESH_BLOCK_FENCE, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_FENCE_GATE_ITEM = new BlockItem(FLESH_BLOCK_FENCE_GATE, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_BUTTON_ITEM = new BlockItem(FLESH_BLOCK_BUTTON, BLOCK_ITEM_BASE);
    public static final Item FLESH_BLOCK_PRESSURE_PLATE_ITEM = new BlockItem(FLESH_BLOCK_PRESSURE_PLATE, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_ITEM = new BlockItem(FLESH_BRICK_BLOCK, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(FLESH_BRICK_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(FLESH_BRICK_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(FLESH_BRICK_BLOCK_WALL, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_FENCE_ITEM = new BlockItem(FLESH_BRICK_BLOCK_FENCE, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_FENCE_GATE_ITEM = new BlockItem(FLESH_BRICK_BLOCK_FENCE_GATE, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_BUTTON_ITEM = new BlockItem(FLESH_BRICK_BLOCK_BUTTON, BLOCK_ITEM_BASE);
    public static final Item FLESH_BRICK_BLOCK_PRESSURE_PLATE_ITEM = new BlockItem(FLESH_BRICK_BLOCK_PRESSURE_PLATE, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BLOCK, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_WALL, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_FENCE_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_FENCE, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_FENCE_GATE_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_FENCE_GATE, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_BUTTON_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_BUTTON, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BLOCK_PRESSURE_PLATE_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_PRESSURE_PLATE, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_SLAB, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_WALL, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_FENCE_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_FENCE, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_FENCE_GATE_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_FENCE_GATE, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_BUTTON_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_BUTTON, BLOCK_ITEM_BASE);
    public static final Item HARDENED_FLESH_BRICK_BLOCK_PRESSURE_PLATE_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_PRESSURE_PLATE, BLOCK_ITEM_BASE);

    private static class StairsAccess extends StairsBlock {
        private StairsAccess(FabricBlockSettings settings) {
            super(Blocks.COBBLESTONE_STAIRS.getDefaultState(), settings);
        }
    }

    private static class ButtonAccess extends AbstractButtonBlock {
        SoundEvent sound;
        private ButtonAccess(FabricBlockSettings settings, SoundEvent sound) {
            super(false, settings);
            this.sound = sound;
        }

        @Override
        protected SoundEvent getClickSound(boolean powered) {
            return this.sound;
        }
    }

    private static class PressurePlateAccess extends PressurePlateBlock {
        SoundEvent depressSound;
        SoundEvent pressSound;
        private PressurePlateAccess(Settings settings, SoundEvent depressSound, SoundEvent pressSound) {
            super(ActivationRule.EVERYTHING, settings);

            this.depressSound = depressSound;
            this.pressSound = pressSound;
        }

        @Override
        protected void playPressSound(WorldAccess world, BlockPos pos) {
            world.playSound(null, pos, pressSound, SoundCategory.BLOCKS, 0.3F, 0.6F);
        }

        @Override
        protected void playDepressSound(WorldAccess world, BlockPos pos) {
            world.playSound(null, pos, depressSound, SoundCategory.BLOCKS, 0.3F, 0.7F);
        }
    }

    public static void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }
}
