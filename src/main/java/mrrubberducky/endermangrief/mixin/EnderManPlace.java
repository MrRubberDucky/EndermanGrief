package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.EndermanGriefMain;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net/minecraft/entity/mob/EndermanEntity$PlaceBlockGoal", priority = 1500)
public class EnderManPlace {
    @Inject(method = "canStart()Z", at = @At(value = "HEAD"), cancellable = true)
    public void canStart(CallbackInfoReturnable<Boolean> cir) {
        if (EndermanGriefMain.EnderManGriefConfig.disableEnderManBlockPlace) {
            cir.setReturnValue(false);
        }
    }
}
