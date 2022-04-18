package funky.fleshmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class FleshPaste extends Item {
    private static final StatusEffectInstance HUNGER = new StatusEffectInstance(net.minecraft.entity.effect.StatusEffects.HUNGER, 600, 0);
    public static final FoodComponent fleshFoodComponent = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).statusEffect(HUNGER, 0.7f).meat().build();
    public FleshPaste() {
        super((new FabricItemSettings()
                .food(fleshFoodComponent)
                )
        );
    }
}
