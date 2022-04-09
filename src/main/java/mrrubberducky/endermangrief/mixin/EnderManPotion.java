package mrrubberducky.endermangrief.mixin;
// hey there, general kenobi
import mrrubberducky.endermangrief.EndermanGriefMain;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EndermanEntity.class, priority = 1500)
public class EnderManPotion {
    @Inject(method = {"damageFromPotion"}, at = @At(value = "HEAD"), cancellable = true)
    public void canStart(CallbackInfoReturnable<Boolean> cir) {
        if (!EndermanGriefMain.EnderManGriefConfig.enderManAffectedByPotions) {
            cir.setReturnValue(false);
        }
    }
}
