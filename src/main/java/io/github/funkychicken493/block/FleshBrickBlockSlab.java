package io.github.funkychicken493.block;

import net.minecraft.block.SlabBlock;

import static io.github.funkychicken493.base.block.FleshBrickBlockBase.FLESH_BRICK_BLOCK_BASE;

public class FleshBrickBlockSlab extends SlabBlock {
    public FleshBrickBlockSlab() {
        super(FLESH_BRICK_BLOCK_BASE.nonOpaque());
    }
}
