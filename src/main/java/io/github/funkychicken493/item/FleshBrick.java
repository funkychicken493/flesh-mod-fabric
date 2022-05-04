package io.github.funkychicken493.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class FleshBrick extends Item {
    public FleshBrick(FabricItemSettings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        float pitch = new Random().nextFloat() + new Random().nextFloat();
        if(new Random().nextBoolean()){
            playerEntity.playSound(SoundEvents.BLOCK_HONEY_BLOCK_BREAK, 2.0F, pitch);
        }else{
            playerEntity.playSound(SoundEvents.BLOCK_SLIME_BLOCK_BREAK, 2.0F, pitch);
        }
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
