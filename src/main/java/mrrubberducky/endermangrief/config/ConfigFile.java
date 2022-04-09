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
                @ConfigEntry(comment = "Disable Endermen from Randomly Teleporting")
                private static boolean disableEnderManRTP = false;
                @ConfigEntry(comment = "Disable Endermen from Placing Blocks")
                private static boolean disableEnderManBlockPlace = false;
                @ConfigEntry(comment = "Disable Endermen from Picking Up Blocks")
                private static boolean disableEnderManBlockPickUp = false;
                @ConfigEntry(comment = "Disable Endermen from Despawning")
                private static boolean enderManCannotDespawn = false;
                @ConfigEntry(comment = "Should Endermen be affected by potions?")
                private static boolean enderManAffectedByPotions = true;
                @ConfigEntry(comment = "Should Endermen be affected by fire/lava?")
                private static boolean enderManAffectedByFire = true;
                @ConfigEntry(comment = "Should Endermen be affected by water?")
                private static boolean enderManAffectedByWater = true;
                @ConfigEntry(comment = "Should Endermen only anger towards player if they look at them?")
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
                public static boolean isAlwaysAngered() {
                    return enderManOnlyAngerWhenLooking;
                }
    }
}
