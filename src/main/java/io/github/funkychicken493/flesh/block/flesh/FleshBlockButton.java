package io.github.funkychicken493.flesh.block.flesh;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LandingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;

import java.util.Random;

import static io.github.funkychicken493.flesh.init.Base.fleshFallDelay;
import static net.minecraft.block.FallingBlock.canFallThrough;

/**
 * The type Flesh block button.
 */
public class FleshBlockButton extends AbstractButtonBlock implements LandingBlock {
    /**
     * Instantiates a new Flesh block button.
     *
     * @param settings the settings
     */
    public FleshBlockButton(FabricBlockSettings settings) {
        super(false, settings);
    }

    /**
     * Gets random entity sound.
     *
     * @return the random entity sound
     */
    public static SoundEvent getRandomEntitySound(ServerWorld world) {
        return switch (world.random.nextInt(0, 9)) {
            case 0 -> SoundEvents.ENTITY_PARROT_IMITATE_SLIME;
            case 1 -> SoundEvents.ENTITY_SLIME_JUMP;
            case 2 -> SoundEvents.ENTITY_SLIME_SQUISH;
            case 3 -> SoundEvents.ENTITY_SLIME_SQUISH_SMALL;
            case 4 -> SoundEvents.ENTITY_SLIME_ATTACK;
            case 5 -> SoundEvents.ENTITY_SLIME_DEATH;
            case 6 -> SoundEvents.ENTITY_SLIME_HURT;
            case 7 -> SoundEvents.ENTITY_SLIME_DEATH_SMALL;
            case 8 -> SoundEvents.ENTITY_SLIME_HURT_SMALL;
            case 9 -> SoundEvents.ENTITY_SLIME_JUMP_SMALL;
            default -> null;
        };
    }

    private static SoundEvent getRandomEntitySound() {
        return switch (new Random().nextInt(0, 9)) {
            case 0 -> SoundEvents.ENTITY_PARROT_IMITATE_SLIME;
            case 1 -> SoundEvents.ENTITY_SLIME_JUMP;
            case 2 -> SoundEvents.ENTITY_SLIME_SQUISH;
            case 3 -> SoundEvents.ENTITY_SLIME_SQUISH_SMALL;
            case 4 -> SoundEvents.ENTITY_SLIME_ATTACK;
            case 5 -> SoundEvents.ENTITY_SLIME_DEATH;
            case 6 -> SoundEvents.ENTITY_SLIME_HURT;
            case 7 -> SoundEvents.ENTITY_SLIME_DEATH_SMALL;
            case 8 -> SoundEvents.ENTITY_SLIME_HURT_SMALL;
            case 9 -> SoundEvents.ENTITY_SLIME_JUMP_SMALL;
            default -> null;
        };
    }

    /**
     * Gets random block sound.
     *
     * @return the random block sound
     */
    public static SoundEvent getRandomBlockSound(ServerWorld world) {
        return switch (world.random.nextInt(0, 9)) {
            case 0 -> SoundEvents.BLOCK_SLIME_BLOCK_BREAK;
            case 1 -> SoundEvents.BLOCK_SLIME_BLOCK_FALL;
            case 2 -> SoundEvents.BLOCK_SLIME_BLOCK_HIT;
            case 3 -> SoundEvents.BLOCK_SLIME_BLOCK_PLACE;
            case 4 -> SoundEvents.BLOCK_SLIME_BLOCK_STEP;
            case 5 -> SoundEvents.BLOCK_HONEY_BLOCK_BREAK;
            case 6 -> SoundEvents.BLOCK_HONEY_BLOCK_FALL;
            case 7 -> SoundEvents.BLOCK_HONEY_BLOCK_HIT;
            case 8 -> SoundEvents.BLOCK_HONEY_BLOCK_PLACE;
            case 9 -> SoundEvents.BLOCK_HONEY_BLOCK_STEP;
            default -> null;
        };
    }

    public static SoundEvent getRandomBlockSound() {
        return switch (new Random().nextInt(0, 9)) {
            case 0 -> SoundEvents.BLOCK_SLIME_BLOCK_BREAK;
            case 1 -> SoundEvents.BLOCK_SLIME_BLOCK_FALL;
            case 2 -> SoundEvents.BLOCK_SLIME_BLOCK_HIT;
            case 3 -> SoundEvents.BLOCK_SLIME_BLOCK_PLACE;
            case 4 -> SoundEvents.BLOCK_SLIME_BLOCK_STEP;
            case 5 -> SoundEvents.BLOCK_HONEY_BLOCK_BREAK;
            case 6 -> SoundEvents.BLOCK_HONEY_BLOCK_FALL;
            case 7 -> SoundEvents.BLOCK_HONEY_BLOCK_HIT;
            case 8 -> SoundEvents.BLOCK_HONEY_BLOCK_PLACE;
            case 9 -> SoundEvents.BLOCK_HONEY_BLOCK_STEP;
            default -> null;
        };
    }

    @Override
    public void powerOn(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, state.with(POWERED, true), 3);
        this.updateNeighbors(state, world, pos);
        world.createAndScheduleBlockTick(pos, this, world.random.nextInt(5, 15));
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        if (new Random().nextBoolean()) {
            return getRandomEntitySound();
        }
        return getRandomBlockSound();
    }

    @SuppressWarnings("deprecation")
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.createAndScheduleBlockTick(pos, this, fleshFallDelay);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.createAndScheduleBlockTick(pos, this, fleshFallDelay);
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
            FallingBlockEntity.spawnFromBlock(world, pos, state);
        }
        if (state.get(POWERED)) {
            world.setBlockState(pos, state.with(POWERED, false), 3);
            this.updateNeighbors(state, world, pos);
            this.playClickSound(null, world, pos, false);
            world.emitGameEvent(GameEvent.BLOCK_UNPRESS, pos);
        }
    }

    private void updateNeighbors(BlockState state, World world, BlockPos pos) {
        world.updateNeighborsAlways(pos, this);
        world.updateNeighborsAlways(pos.offset(getDirection(state).getOpposite()), this);
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
}
