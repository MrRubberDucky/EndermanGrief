package mrrubberducky.endermangrief.config;


import me.lortseam.completeconfig.api.ConfigContainer;
import me.lortseam.completeconfig.api.ConfigEntry;
import me.lortseam.completeconfig.api.ConfigGroup;
import me.lortseam.completeconfig.data.Config;


public class ConfigFile extends Config implements ConfigContainer {
            public ConfigFile() {
                super("endermangrief");
}
    @Transitive
    public static class Config implements ConfigGroup {
                @ConfigEntry(comment = "Disable Endermen from Randomly Teleporting. This does nothing if Disable Enderman AI is set to true")
                private static boolean disableEnderManRTP = false;
                @ConfigEntry(comment = "Disable Endermen from Placing Blocks. This does nothing if Disable Enderman AI is set to true")
                private static boolean disableEnderManBlockPlace = false;
                @ConfigEntry(comment = "Disable Endermen from Picking Up Blocks. This does nothing if Disable Enderman AI is set to true")
                private static boolean disableEnderManBlockPickUp = false;
                @ConfigEntry(comment = "Disable Endermen from Despawning")
                private static boolean enderManCannotDespawn = false;
                @ConfigEntry(comment = "Disable Enderman AI. Warning: This will nuke AI for all Endermen in your world, only newly spawned Endermen will have AI once this is false")
                private static boolean enderManDisableAI = false;
                @ConfigEntry(comment = "Should Endermen be silent?")
                private static boolean enderManCantSpeak = false;
                @ConfigEntry(comment = "Should Endermen be Invisible? Only eyes and particles will show if this is set to true")
                private static boolean enderMenAreInvisible = false;
                @ConfigEntry(comment = "Should Endermen be affected by potions?")
                private static boolean enderManAffectedByPotions = true;
                @ConfigEntry(comment = "Should Endermen be affected by fire/lava?")
                private static boolean enderManAffectedByFire = true;
                @ConfigEntry(comment = "Should Endermen be affected by water?")
                private static boolean enderManAffectedByWater = true;
                @ConfigEntry(comment = "Should Endermen be affected by explosions?")
                private static boolean enderManAffectedByExplosions = true;
                @ConfigEntry(comment = "Should Endermen be affected by freezing? (ex. powdered snow)")
                private static boolean enderManAffectedByFreezing = true;
                @ConfigEntry(comment = "Should Endermen only anger towards player if they look at them? This does nothing if Disable Enderman AI is set to true")
                private static boolean enderManOnlyAngerWhenLooking = true;


                public static boolean isEnabledEnderManRTP() {
                    return disableEnderManRTP;
                }
                public static boolean isEnabledBlockPlace() {
                    return disableEnderManBlockPlace;
                }
                public static boolean isEnabledBlockPickUp() {
                    return disableEnderManBlockPickUp;
                }
                public static boolean isEnabledDisableAI() {return enderManDisableAI;}
                public static boolean isNoDespawnEnabled() {
                    return enderManCannotDespawn;
                }
                public static boolean isAffectedByPotions() {
                    return enderManAffectedByPotions;
                }
                public static boolean isAffectedByFire() {
                    return enderManAffectedByFire;
                }
                public static boolean isAffectedByWater() {
                    return enderManAffectedByWater;
                }
                public static boolean isAffectedByFreezing() {return enderManAffectedByFreezing;}
                public static boolean isEnderManAffectedByExplosions() {return enderManAffectedByExplosions;}
                public static boolean isAlwaysAngered() {
                    return enderManOnlyAngerWhenLooking;
                }
                public static boolean isEnabledEnderMenCantSpeak() {return enderManCantSpeak;}
                public static boolean isEnabledEnderMenInvisible() {return enderMenAreInvisible;}
    }
}
