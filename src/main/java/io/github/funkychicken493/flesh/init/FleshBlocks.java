package io.github.funkychicken493.flesh.init;

import io.github.funkychicken493.flesh.Flesh;
import io.github.funkychicken493.flesh.block.FleshBlock.*;
import io.github.funkychicken493.flesh.block.FleshBrickBlock.FleshBrickBlock;
import io.github.funkychicken493.flesh.block.FleshBrickBlock.FleshBrickBlockSlab;
import io.github.funkychicken493.flesh.block.FleshBrickBlock.FleshBrickBlockStairs;
import io.github.funkychicken493.flesh.block.FleshBrickBlock.FleshBrickBlockWall;
import io.github.funkychicken493.flesh.block.FleshHardenedBlock.FleshHardenedBlock;
import io.github.funkychicken493.flesh.block.FleshHardenedBlock.FleshHardenedBlockSlab;
import io.github.funkychicken493.flesh.block.FleshHardenedBlock.FleshHardenedBlockStairs;
import io.github.funkychicken493.flesh.block.FleshHardenedBlock.FleshHardenedBlockWall;
import io.github.funkychicken493.flesh.block.FleshHardenedBrickBlock.FleshHardenedBrickBlock;
import io.github.funkychicken493.flesh.block.FleshHardenedBrickBlock.FleshHardenedBrickBlockSlab;
import io.github.funkychicken493.flesh.block.FleshHardenedBrickBlock.FleshHardenedBrickBlockStairs;
import io.github.funkychicken493.flesh.block.FleshHardenedBrickBlock.FleshHardenedBrickBlockWall;
import io.github.funkychicken493.flesh.block.base.FleshBlockBase;
import io.github.funkychicken493.flesh.block.base.FleshBrickBlockBase;
import io.github.funkychicken493.flesh.block.base.FleshHardenedBlockBase;
import io.github.funkychicken493.flesh.block.base.FleshHardenedBrickBlockBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FleshBlocks {

    public static void FleshBlocksInit() {
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_block"), FLESH_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_lantern"), FLESH_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_slab"), FLESH_BLOCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_stairs"), FLESH_BLOCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_wall"), FLESH_BLOCK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_block"), FLESH_BRICK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_slab"), FLESH_BRICK_BLOCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_stairs"), FLESH_BRICK_BLOCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_wall"), FLESH_BRICK_BLOCK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_block"), HARDENED_FLESH_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_slab"), HARDENED_FLESH_BLOCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_stairs"), HARDENED_FLESH_BLOCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_wall"), HARDENED_FLESH_BLOCK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_block"), HARDENED_FLESH_BRICK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_slab"), HARDENED_FLESH_BRICK_BLOCK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_stairs"), HARDENED_FLESH_BRICK_BLOCK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_wall"), HARDENED_FLESH_BRICK_BLOCK_WALL);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_block"), FLESH_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_lantern"), FLESH_LANTERN_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_slab"), FLESH_BLOCK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_stairs"), FLESH_BLOCK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_wall"), FLESH_BLOCK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_block"), FLESH_BRICK_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_slab"), FLESH_BRICK_BLOCK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_stairs"), FLESH_BRICK_BLOCK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "flesh_brick_wall"), FLESH_BRICK_BLOCK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_block"), HARDENED_FLESH_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_slab"), HARDENED_FLESH_BLOCK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_stairs"), HARDENED_FLESH_BLOCK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_wall"), HARDENED_FLESH_BLOCK_WALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_block"), HARDENED_FLESH_BRICK_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_slab"), HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_stairs"), HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flesh.ModInfo.MOD_ID, "hardened_flesh_brick_wall"), HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM);
    }

    //init blocks
    public static final Block FLESH_BLOCK = new FleshBlock(FabricBlockSettings.copyOf(FleshBlockBase.FLESH_BLOCK_BASE));
    public static final Block FLESH_LANTERN = new FleshBlockLantern(FabricBlockSettings.copyOf(FleshBlockBase.FLESH_BLOCK_BASE).luminance(10));
    public static final Block FLESH_BLOCK_SLAB = new FleshBlockSlab(FabricBlockSettings.copyOf(FleshBlockBase.FLESH_BLOCK_BASE));
    public static final Block FLESH_BLOCK_STAIRS = new FleshBlockStairs(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(FleshBlockBase.FLESH_BLOCK_BASE));
    public static final Block FLESH_BLOCK_WALL = new FleshBlockWall(FabricBlockSettings.copyOf(FleshBlockBase.FLESH_BLOCK_BASE));
    public static final Block FLESH_BRICK_BLOCK = new FleshBrickBlock(FabricBlockSettings.copyOf(FleshBrickBlockBase.FLESH_BRICK_BLOCK_BASE));
    public static final Block FLESH_BRICK_BLOCK_SLAB = new FleshBrickBlockSlab(FabricBlockSettings.copyOf(FleshBrickBlockBase.FLESH_BRICK_BLOCK_BASE));
    public static final Block FLESH_BRICK_BLOCK_STAIRS = new FleshBrickBlockStairs(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(FleshBrickBlockBase.FLESH_BRICK_BLOCK_BASE));
    public static final Block FLESH_BRICK_BLOCK_WALL = new FleshBrickBlockWall(FabricBlockSettings.copyOf(FleshBrickBlockBase.FLESH_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK = new FleshHardenedBlock(FabricBlockSettings.copyOf(FleshHardenedBlockBase.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK_SLAB = new FleshHardenedBlockSlab(FabricBlockSettings.copyOf(FleshHardenedBlockBase.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK_STAIRS = new FleshHardenedBlockStairs(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(FleshHardenedBlockBase.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BLOCK_WALL = new FleshHardenedBlockWall(FabricBlockSettings.copyOf(FleshHardenedBlockBase.FLESH_HARDENED_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK = new FleshHardenedBrickBlock(FabricBlockSettings.copyOf(FleshHardenedBrickBlockBase.FLESH_HARDENED_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_SLAB = new FleshHardenedBrickBlockSlab(FabricBlockSettings.copyOf(FleshHardenedBrickBlockBase.FLESH_HARDENED_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_STAIRS = new FleshHardenedBrickBlockStairs(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(FleshHardenedBrickBlockBase.FLESH_HARDENED_BRICK_BLOCK_BASE));
    public static final Block HARDENED_FLESH_BRICK_BLOCK_WALL = new FleshHardenedBrickBlockWall(FabricBlockSettings.copyOf(FleshHardenedBrickBlockBase.FLESH_HARDENED_BRICK_BLOCK_BASE));

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
    public static final BlockItem HARDENED_FLESH_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BLOCK, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BLOCK_WALL, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_SLAB_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_SLAB, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_STAIRS_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_STAIRS, new FabricItemSettings());
    public static final BlockItem HARDENED_FLESH_BRICK_BLOCK_WALL_ITEM = new BlockItem(HARDENED_FLESH_BRICK_BLOCK_WALL, new FabricItemSettings());
}
