package io.github.funkychicken493.flesh.mixin;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ComposterBlock.class)
public interface RegisterCompostableItemInvoker {
    @Invoker("registerCompostableItem")
    public static void registerCompostableItem(float levelIncreaseChance, ItemConvertible item){
        throw new AssertionError();
    }
}
