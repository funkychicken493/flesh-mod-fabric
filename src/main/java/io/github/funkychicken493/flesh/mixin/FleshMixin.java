package io.github.funkychicken493.flesh.mixin;

import net.minecraft.block.ComposterBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static io.github.funkychicken493.flesh.init.FleshBlocks.FLESH_BLOCK_ITEM;
import static io.github.funkychicken493.flesh.init.FleshItems.BONE_MARROW;
import static io.github.funkychicken493.flesh.init.FleshItems.FLESH_PASTE;
import static io.github.funkychicken493.flesh.mixin.RegisterCompostableItemInvoker.registerCompostableItem;

@Mixin(ComposterBlock.class)
public abstract class FleshMixin {

	@Inject(method = "registerDefaultCompostableItems", at = @At(value = "TAIL"))
	private static void registerDefaultCompostableItems(CallbackInfo ci) {
		registerCompostableItem(0.1F, FLESH_PASTE);
		registerCompostableItem(0.1F, BONE_MARROW);
		registerCompostableItem(0.9F, FLESH_BLOCK_ITEM);
	}
}
