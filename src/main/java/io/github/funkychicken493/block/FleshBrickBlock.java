package io.github.funkychicken493.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FleshBrickBlock extends Block {
    public FleshBrickBlock() {
        super(Settings.of(Material.STONE)
                .sounds(new BlockSoundGroup(
                        0.5f,
                        0.7f,
                        BlockSoundGroup.DEEPSLATE_BRICKS.getBreakSound(),
                        BlockSoundGroup.DEEPSLATE.getStepSound(),
                        BlockSoundGroup.STONE.getPlaceSound(),
                        BlockSoundGroup.DEEPSLATE_BRICKS.getHitSound(),
                        BlockSoundGroup.STONE.getFallSound()
                ))
                .jumpVelocityMultiplier(0.85f)
                .velocityMultiplier(1.25f)
                .slipperiness(0.66f)
                .strength(1.5f)
                .hardness(1.5f)
                .resistance(1.0f)
        );
    }
}
