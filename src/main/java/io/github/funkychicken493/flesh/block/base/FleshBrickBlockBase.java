package io.github.funkychicken493.flesh.block.base;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FleshBrickBlockBase {
    public static FabricBlockSettings FLESH_BRICK_BLOCK_BASE = FabricBlockSettings.of(Material.STONE)
            .sounds(new BlockSoundGroup(
                    0.5f,
                    0.7f,
                    //break sound
                    BlockSoundGroup.POINTED_DRIPSTONE.getBreakSound(),
                    //step sound
                    BlockSoundGroup.BONE.getStepSound(),
                    //place sound
                    BlockSoundGroup.SHROOMLIGHT.getPlaceSound(),
                    //hit sound
                    BlockSoundGroup.POINTED_DRIPSTONE.getHitSound(),
                    //fall sound
                    BlockSoundGroup.STEM.getFallSound()
            ))
            .jumpVelocityMultiplier(0.85f)
            .velocityMultiplier(1.25f)
            .slipperiness(0.66f)
            .strength(1.5f)
            .hardness(1.5f)
            .luminance(0)
            .resistance(1.0f);
}
