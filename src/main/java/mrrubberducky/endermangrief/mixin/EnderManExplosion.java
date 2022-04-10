package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.config.ConfigFile;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EnderManExplosion extends EnderManExplosionHelper {
    @Override
    protected void shouldNotExplode(CallbackInfoReturnable<Boolean> cir) {
        if (ConfigFile.Config.isEnderManAffectedByExplosions()) {
            cir.setReturnValue(true);
        }
    }
}
