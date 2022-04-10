package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EnderManFreeze extends EnderManFreezeHelper {
    @Override
    protected void enableEnderManFreeze(CallbackInfoReturnable<Boolean> cir) {
        if (ConfigFile.Config.isAffectedByFreezing()) {
            cir.setReturnValue(false);
        }
    }
}
