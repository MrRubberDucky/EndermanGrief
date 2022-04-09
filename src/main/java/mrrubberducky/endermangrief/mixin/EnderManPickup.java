package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.EndermanGriefMain;
import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net/minecraft/entity/mob/EndermanEntity$PickUpBlockGoal", priority = 1500)
public class EnderManPickup {
    @Inject(method = "canStart()Z", at = @At(value = "HEAD"), cancellable = true)
    public void canStart(CallbackInfoReturnable<Boolean> cir) {
        if (ConfigFile.Config.isEnabledBlockPickUp()) {
            cir.setReturnValue(false);
        }
    }
}
