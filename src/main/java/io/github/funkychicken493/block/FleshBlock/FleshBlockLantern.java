package io.github.funkychicken493.block.FleshBlock;

import net.minecraft.block.FallingBlock;

import static io.github.funkychicken493.block.FleshBlock.FleshBlockBase.FLESH_BLOCK_BASE;

public class FleshBlockLantern extends FallingBlock {
    public FleshBlockLantern() {
        super(FLESH_BLOCK_BASE.nonOpaque().luminance(15).slipperiness(0.98F).velocityMultiplier(0.5F));
    }
}
