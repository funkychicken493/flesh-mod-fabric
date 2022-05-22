package io.github.funkychicken493.flesh.mixin;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

/**
 * The interface Register compostable item invoker.
 */
@Mixin(ComposterBlock.class)
public interface RegisterCompostableItemInvoker {
    /**
     * Register compostable item.
     *
     * @param levelIncreaseChance the level increase chance
     * @param item                the item
     */
    @Invoker("registerCompostableItem")
    static void registerCompostableItem(float levelIncreaseChance, ItemConvertible item) {
        throw new AssertionError();
    }
}
