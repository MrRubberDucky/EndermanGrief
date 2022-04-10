package mrrubberducky.endermangrief.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EnderManInvisibleHelper {
    @Inject(method = "isInvisible()Z", at = @At("HEAD"), cancellable = true)
    protected void shouldItBeInvisible(CallbackInfoReturnable<Boolean> cir) {
    }
}
