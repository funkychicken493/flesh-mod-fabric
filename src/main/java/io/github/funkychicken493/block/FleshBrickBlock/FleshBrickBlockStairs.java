package io.github.funkychicken493.block.FleshBrickBlock;

import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

import static io.github.funkychicken493.block.FleshBrickBlock.FleshBrickBlockBase.FLESH_BRICK_BLOCK_BASE;

public class FleshBrickBlockStairs extends StairsBlock {
    public FleshBrickBlockStairs() {
        super(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FLESH_BRICK_BLOCK_BASE);
    }
}
