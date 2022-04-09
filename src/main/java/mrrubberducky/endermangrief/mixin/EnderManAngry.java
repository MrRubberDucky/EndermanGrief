package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EndermanEntity.class, priority = 1500)
public class EnderManAngry {
    @Inject(method = {"isAngry()Z"}, at = @At(value = "HEAD"), cancellable = true)
    public void isAngry(CallbackInfoReturnable<Boolean> cir) {
        // The ! is opposite from true so we are checking if it's false
        if (!ConfigFile.Config.isAlwaysAngered()) {
            cir.setReturnValue(true);
            // If it is false then we enable the feature
        }
    }
}
// my balls itch
