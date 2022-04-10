package mrrubberducky.endermangrief.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EnderManFreezeHelper {
    @Inject(method = "canFreeze()Z", at = @At("HEAD"), cancellable = true)
    protected void enableEnderManFreeze(CallbackInfoReturnable<Boolean> cir) {
    }
}
