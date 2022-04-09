package mrrubberducky.endermangrief.mixin;

import mrrubberducky.endermangrief.EndermanGriefMain;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EndermanEntity.class, priority = 1500)
public class EndermanDespawn {
    @Inject(method = "cannotDespawn()Z", at = @At(value = "HEAD"), cancellable = true)
    public void canDespawn(CallbackInfoReturnable<Boolean> cir) {
        if (EndermanGriefMain.EnderManGriefConfig.enderManCannotDespawn) {
            cir.setReturnValue(true);
        }
    }
    // mogus :thumbs_up:
}
