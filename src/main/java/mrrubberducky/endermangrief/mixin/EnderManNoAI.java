package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EnderManNoAI extends EnderManNoAIHelper {
    protected void shouldWeDisableAI(CallbackInfoReturnable<Boolean> cir) {
        // We are returning here since we inherited the stuff in EnderManNoAIHelper mixin
        if (ConfigFile.Config.isEnabledDisableAI()) {
            cir.setReturnValue(true);
        }
    }
}
