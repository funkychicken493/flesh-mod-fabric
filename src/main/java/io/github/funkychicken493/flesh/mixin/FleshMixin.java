//I now understand what this is and why it exists, but it is not used in this project.

package io.github.funkychicken493.flesh.mixin;

import net.minecraft.block.ComposterBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static io.github.funkychicken493.flesh.init.FleshItems.FLESH_PASTE;
import static io.github.funkychicken493.flesh.mixin.RegisterCompostableItemInvoker.registerCompostableItem;

@Mixin(ComposterBlock.class)
public class FleshMixin {
	@Inject(method = "registerDefaultCompostableItems", at = @At(value = "TAIL"))
	private static void registerDefaultCompostableItems(CallbackInfo ci) {
		registerCompostableItem(0.3F, FLESH_PASTE);
	}
}
