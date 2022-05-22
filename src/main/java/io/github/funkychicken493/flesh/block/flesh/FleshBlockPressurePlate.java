package io.github.funkychicken493.flesh.block.flesh;

import net.minecraft.block.BlockState;
import net.minecraft.block.LandingBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Random;

import static io.github.funkychicken493.flesh.init.Base.fleshFallDelay;
import static net.minecraft.block.FallingBlock.canFallThrough;

/**
 * The type Flesh block pressure plate.
 */
public class FleshBlockPressurePlate extends PressurePlateBlock implements LandingBlock {
    /**
     * The Rand.
     */
    static Random rand = new Random();

    /**
     * Instantiates a new Flesh block pressure plate.
     *
     * @param settings the settings
     */
    public FleshBlockPressurePlate(Settings settings) {
        super(ActivationRule.EVERYTHING, settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(POWERED, false));
    }

    @Override
    public void playPressSound(WorldAccess world, BlockPos pos) {
        if (rand.nextBoolean()) {
            world.playSound(null, pos, FleshBlockButton.getRandomEntitySound((ServerWorld) world), SoundCategory.BLOCKS, 0.3F, 0.6F);
        } else {
            world.playSound(null, pos, FleshBlockButton.getRandomBlockSound(), SoundCategory.BLOCKS, 0.3F, 0.5F);
        }
    }

    @Override
    public void playDepressSound(WorldAccess world, BlockPos pos) {
        if (rand.nextBoolean()) {
            world.playSound(null, pos, FleshBlockButton.getRandomEntitySound((ServerWorld) world), SoundCategory.BLOCKS, 0.3F, 0.6F);
        } else {
            world.playSound(null, pos, FleshBlockButton.getRandomBlockSound(), SoundCategory.BLOCKS, 0.3F, 0.5F);
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.createAndScheduleBlockTick(pos, this, fleshFallDelay);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.createAndScheduleBlockTick(pos, this, fleshFallDelay);
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
            FallingBlockEntity.spawnFromBlock(world, pos, state);
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(16) == 0) {
            BlockPos blockPos = pos.down();
            if (canFallThrough(world.getBlockState(blockPos))) {
                double d = (double) pos.getX() + random.nextDouble();
                double e = (double) pos.getY() - 0.05D;
                double f = (double) pos.getZ() + random.nextDouble();
                world.addParticle(new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state), d, e, f, 0.0D, 0.0D, 0.0D);
            }
        }
    }
}
