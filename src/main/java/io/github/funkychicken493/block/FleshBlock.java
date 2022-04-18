package io.github.funkychicken493.block;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FleshBlock extends FallingBlock {
    public FleshBlock() {
        super(Settings.of(Material.STONE)
                .sounds(new BlockSoundGroup(
                        0.5f,
                        0.7f,
                        BlockSoundGroup.HONEY.getBreakSound(),
                        BlockSoundGroup.SLIME.getStepSound(),
                        BlockSoundGroup.HONEY.getPlaceSound(),
                        BlockSoundGroup.HONEY.getHitSound(),
                        BlockSoundGroup.HONEY.getFallSound()
                ))
                .jumpVelocityMultiplier(0.1f)
                .velocityMultiplier(1.2f)
                .slipperiness(0.7f)
                .breakInstantly()
        );

        
    }
}
