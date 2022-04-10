package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EnderManInvisible extends EnderManInvisibleHelper {
    @Override
    protected void shouldItBeInvisible(CallbackInfoReturnable<Boolean> cir) {
        if (ConfigFile.Config.isEnabledEnderMenInvisible()) {
            cir.setReturnValue(true);
        }
    }
}
