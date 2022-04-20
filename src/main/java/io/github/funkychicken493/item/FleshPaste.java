package io.github.funkychicken493.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class FleshPaste extends Item {
    private static final StatusEffectInstance HUNGER = new StatusEffectInstance(StatusEffects.HUNGER, 300, 0);
    private static final StatusEffectInstance NAUSEA = new StatusEffectInstance(StatusEffects.NAUSEA, 600, 2);
    private static final FoodComponent fleshFoodComponent = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).statusEffect(HUNGER, 0.7f).statusEffect(NAUSEA, 0.2f).meat().build();
    public FleshPaste() {
        super((new FabricItemSettings()
                .food(fleshFoodComponent)
                )
        );
    }
    @SuppressWarnings("unused")
    public TypedActionResult<ItemStack> onUse(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_HONEY_BLOCK_BREAK, SoundCategory.MASTER, 2.0F, 1.46F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
