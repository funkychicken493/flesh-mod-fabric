package io.github.funkychicken493.flesh.block.flesh;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.LandingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Random;

import static io.github.funkychicken493.flesh.init.Base.fleshFallDelay;
import static net.minecraft.block.FallingBlock.canFallThrough;

/**
 * The type Flesh block slab.
 */
public class FleshBlockSlab extends SlabBlock implements LandingBlock {
    /**
     * Instantiates a new Flesh block slab.
     *
     * @param settings the settings
     */
    public FleshBlockSlab(FabricBlockSettings settings) {
        super(settings);
    }

    @SuppressWarnings("deprecation")
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.createAndScheduleBlockTick(pos, this, fleshFallDelay);
        //Check if the block is placed in top version, if so, set the state to bottom version
        if (state.get(SlabBlock.TYPE) == SlabType.TOP) {
            world.setBlockState(pos, state.with(SlabBlock.TYPE, SlabType.BOTTOM));
        }
        if (world.getBlockState(pos.down()).getBlock() == this && world.getBlockState(pos.down()).get(SlabBlock.TYPE) == SlabType.BOTTOM) {
            world.setBlockState(pos.down(), state.with(SlabBlock.TYPE, SlabType.DOUBLE));
            world.removeBlock(pos, false);
        }
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.createAndScheduleBlockTick(pos, this, fleshFallDelay);
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @SuppressWarnings("deprecation")
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
            FallingBlockEntity.spawnFromBlock(world, pos, state);
        }
    }

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

    @Override
    @SuppressWarnings("unused")
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        BlockState state = fallingBlockEntity.getBlockState();
        if (world.getBlockState(pos).getBlock() instanceof FleshBlockSlab && world.getBlockState(pos).get(SlabBlock.TYPE) == SlabType.BOTTOM) {
            fallingBlockEntity.setPos(pos.getX(), pos.getY() - 10000, pos.getZ());
            world.setBlockState(pos, state.with(SlabBlock.TYPE, SlabType.DOUBLE));
        }
    }
}
