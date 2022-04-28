package io.github.funkychicken493.block.FleshBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FleshBlockBase {
    public static final FabricBlockSettings FLESH_BLOCK_BASE = FabricBlockSettings.of(Material.STONE)
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
            .velocityMultiplier(1.3f)
            .slipperiness(0.7f)
            //.luminance(0)
            .emissiveLighting((state, world, pos) -> false)
            .blockVision((state, world, pos) -> true)
            .nonOpaque()
            .breakInstantly();
}
