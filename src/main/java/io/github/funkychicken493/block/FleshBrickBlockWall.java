package io.github.funkychicken493.block;

import net.minecraft.block.WallBlock;

import static io.github.funkychicken493.base.block.FleshBrickBlockBase.FLESH_BRICK_BLOCK_BASE;

public class FleshBrickBlockWall extends WallBlock {
    public FleshBrickBlockWall() {
        super(FLESH_BRICK_BLOCK_BASE.nonOpaque());
    }
}
