package mrrubberducky.endermangrief.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EnderManSilentHelper {
    @Inject(method = "isSilent()Z", at = @At("HEAD"), cancellable = true)
    protected void shouldItBeSilent(CallbackInfoReturnable<Boolean> cir) {
    }
}
