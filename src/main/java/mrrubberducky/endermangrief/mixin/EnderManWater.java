package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.EndermanGriefMain;
import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EndermanEntity.class, priority = 1500)
public class EnderManWater {
    @Inject(method = {"hurtByWater()Z"}, at = @At(value = "HEAD"), cancellable = true)
    private void hurtByWater(CallbackInfoReturnable<Boolean> cir) {
        if (!ConfigFile.Config.isAffectedByWater()) {
            cir.setReturnValue(false);
        }
    }
}
