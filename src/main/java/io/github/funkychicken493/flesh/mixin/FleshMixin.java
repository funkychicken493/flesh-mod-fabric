//I now understand what this is and why it exists, but it is not used in this project.

package io.github.funkychicken493.flesh.mixin;

import net.minecraft.client.resource.SplashTextResourceSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashTextResourceSupplier.class)
public class FleshMixin {

	@Inject(method = "get", at = @At(value = "HEAD"))
	private void inject(CallbackInfoReturnable<String> cir) {
	}
}
