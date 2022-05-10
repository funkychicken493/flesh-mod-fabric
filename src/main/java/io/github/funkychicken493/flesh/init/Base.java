package io.github.funkychicken493.flesh.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static io.github.funkychicken493.flesh.init.InitEverything.FLESH_GROUP_BLOCKS;
import static io.github.funkychicken493.flesh.init.InitEverything.FLESH_GROUP_ITEMS;

public class Base {

    public static final FabricItemSettings ITEM_BASE = new FabricItemSettings().group(FLESH_GROUP_ITEMS);
    public static final FabricItemSettings BLOCK_ITEM_BASE = new FabricItemSettings().group(FLESH_GROUP_BLOCKS);

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
            .luminance(0)
            .emissiveLighting((state, world, pos) -> false)
            .blockVision((state, world, pos) -> true)
            .nonOpaque()
            .breakInstantly();
    public static final int fleshFallDelay = 2;


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

    public static FabricBlockSettings FLESH_HARDENED_BLOCK_BASE = FabricBlockSettings.copyOf(FLESH_BRICK_BLOCK_BASE);

    public static FabricBlockSettings FLESH_HARDENED_BRICK_BLOCK_BASE = FabricBlockSettings.copyOf(FLESH_HARDENED_BLOCK_BASE)
            .sounds(new BlockSoundGroup(
                    0.5f,
                    0.7f,
                    BlockSoundGroup.CALCITE.getBreakSound(),
                    BlockSoundGroup.CALCITE.getStepSound(),
                    BlockSoundGroup.CANDLE.getPlaceSound(),
                    BlockSoundGroup.CANDLE.getHitSound(),
                    BlockSoundGroup.CANDLE.getFallSound()
            ));
}
