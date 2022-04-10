package mrrubberducky.endermangrief.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EnderManExplosionHelper {
    @Inject(method ="isImmuneToExplosion()Z", at = @At("HEAD"), cancellable = true) // even though IntelliJ complains, not having cancellable set to true will make the game crash with a Ticking Entity error
    protected void shouldNotExplode(CallbackInfoReturnable<Boolean> cir) {
    }
}
