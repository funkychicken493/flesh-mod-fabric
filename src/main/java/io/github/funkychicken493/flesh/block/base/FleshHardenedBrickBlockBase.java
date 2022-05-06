package io.github.funkychicken493.flesh.block.base;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.sound.BlockSoundGroup;

import static io.github.funkychicken493.flesh.block.base.FleshHardenedBlockBase.FLESH_HARDENED_BLOCK_BASE;

public class FleshHardenedBrickBlockBase {
    public static FabricBlockSettings FLESH_HARDENED_BRICK_BLOCK_BASE = FabricBlockSettings.copyOf(FLESH_HARDENED_BLOCK_BASE)
            .sounds(new BlockSoundGroup(
                    0.5f,
                    0.7f,
                    BlockSoundGroup.CALCITE.getBreakSound(),
                    BlockSoundGroup.CALCITE.getStepSound(),
                    BlockSoundGroup.CANDLE.getPlaceSound(),
                    BlockSoundGroup.CANDLE.getHitSound(),
                    BlockSoundGroup.CANDLE.getFallSound()
            ))
            ;
}
