package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.EndermanGriefMain;
import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EndermanEntity.class, priority = 1500)
public class EnderManLava {
    @Inject(method = {"damage"}, at = @At(value = "HEAD"), cancellable = true)
    public void isFireImmune(CallbackInfoReturnable<Boolean> cir) {
        if (!ConfigFile.Config.isAffectedByFire()) {
            cir.setReturnValue(true);
        }
    }
}
