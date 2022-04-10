package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EnderManLava extends EnderManLavaHelper {

    @Override
    protected void shouldItBeFireImmune(CallbackInfoReturnable<Boolean> cir) {
        if (!ConfigFile.Config.isAffectedByFire()) {
            cir.setReturnValue(true);
        }
    }
}
