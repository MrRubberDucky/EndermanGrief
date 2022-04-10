package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EnderManSilent extends EnderManSilentHelper {
    @Override
    protected void shouldItBeSilent(CallbackInfoReturnable<Boolean> cir) {
        if (ConfigFile.Config.isEnabledEnderMenCantSpeak()) {
            cir.setReturnValue(true);
        }
    }
}
