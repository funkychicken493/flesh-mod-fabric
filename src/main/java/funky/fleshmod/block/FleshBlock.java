package funky.fleshmod.block;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FleshBlock extends FallingBlock {
    private final static BlockSoundGroup HONEY = BlockSoundGroup.HONEY;
    private final static BlockSoundGroup SLIME = BlockSoundGroup.SLIME;
    public FleshBlock() {
        super(Settings.of(Material.STONE)
                .sounds(new BlockSoundGroup(
                        0.5f,
                        0.7f,
                        HONEY.getBreakSound(),
                        SLIME.getStepSound(),
                        HONEY.getPlaceSound(),
                        HONEY.getHitSound(),
                        HONEY.getFallSound()
                ))
                .jumpVelocityMultiplier(0.1f)
                .velocityMultiplier(1.2f)
                .slipperiness(0.7f)
                .breakInstantly()
        );
    }
}
