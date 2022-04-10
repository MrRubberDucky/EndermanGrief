package mrrubberducky.endermangrief.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EnderManLavaHelper {
    @Inject(method = "Lnet/minecraft/entity/Entity;isFireImmune()Z", at = @At("HEAD"), cancellable = true)
    protected void shouldItBeFireImmune(CallbackInfoReturnable<Boolean> cir) {
    }
}
