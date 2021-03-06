package io.github.funkychicken493.flesh.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

/**
 * The type Flesh paste.
 */
public class FleshPaste extends Item {
    private static final StatusEffectInstance HUNGER = new StatusEffectInstance(StatusEffects.HUNGER, 300, 0);
    private static final StatusEffectInstance NAUSEA = new StatusEffectInstance(StatusEffects.NAUSEA, 600, 2);
    private static final FoodComponent FLESH_FOOD_COMPONENT = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).statusEffect(HUNGER, 0.7f).statusEffect(NAUSEA, 0.2f).meat().build();

    /**
     * Instantiates a new Flesh paste.
     *
     * @param settings the settings
     */
    public FleshPaste(FabricItemSettings settings) {
        super((settings.food(FLESH_FOOD_COMPONENT))
        );
    }

    /**
     * On use typed action result.
     *
     * @param world        the world
     * @param playerEntity the player entity
     * @param hand         the hand
     *
     * @return success
     */
    @SuppressWarnings("unused")
    public TypedActionResult<ItemStack> onUse(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_HONEY_BLOCK_BREAK, SoundCategory.MASTER, 2.0F, 1.46F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.flesh.flesh_paste.tooltip0").formatted(Formatting.GRAY));
    }
}
