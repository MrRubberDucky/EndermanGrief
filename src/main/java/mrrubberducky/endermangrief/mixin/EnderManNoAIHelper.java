package mrrubberducky.endermangrief.mixin;

import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
public abstract class EnderManNoAIHelper {
    @Inject(method = "isAiDisabled()Z", at = @At("HEAD"), cancellable = true)
    protected void shouldWeDisableAI(CallbackInfoReturnable<Boolean> cir) {
        // We aren't returning anything here since another mixin will inherit it's value
    }

}
