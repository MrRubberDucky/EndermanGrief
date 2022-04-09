package mrrubberducky.endermangrief.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "endermangrief/general_config")
public class ConfigFile implements ConfigData {

    @Comment("""
            ===== Enderman Grief Config ====
            
            Disable Enderman's Random Teleport Ability (default: false)
            Endermen tend to teleport around without player's action, this effectively makes them dumber by disabling it altogether
            They won't try to avoid water nor lava in order to reach you
            (requires restart)
            """)
    public boolean disableEnderManRTP = false;

    // I put a new line there because I had a stroke trying to read it for some reason
    // Don't question it please, I have no idea myself why it helps lmao
    @Comment("""
            
            Disable Enderman's Block Placing Ability (default: false)
            Endermen will no longer be able to place blocks in the world if this is set to true
            (requires restart)""")
    public boolean disableEnderManBlockPlace = false;

    @Comment("""
            
            Disable Enderman's Block Pickup Ability (default: false)
            Endermen will no longer be able to pick up blocks from the world if this is set to true
            (requires restart)""")
    public boolean disableEnderManBlockPickUp = false;

    @Comment("""
            
            Disable Despawning of Enderman (default: false)
            Endermen will no longer be able to despawn if this is set to true
            (requires restart)
            """)
    public boolean enderManCannotDespawn = false;
    @Comment("""
            
            Should Enderman be affected by potion effects? (default: true)
            Endermen are still vulnerable to potion damage, this option effectively disables that
            (requires restart)""")
    public boolean enderManAffectedByPotions = true;

    @Comment("""
            
            Should Enderman be hurt from being lit on fire/thrown into a volcano? (default: true)
            Endermen are still vulnerable to fire and damage coming from lava, this makes them immune to it
            (requires restart)""")
    public boolean enderManAffectedByFire = true;

    @Comment("""
            
            Should Enderman be hurt from being submerged in water?  (default: true)
            Enderman by default get hurt while being submerged in water, this option effectively disables it
            (requires restart)""")
    public boolean enderManAffectedByWater = true;

    @Comment("""
            
            Should Endermen only anger when player looks at them? (default: true)
            If set to true, Enderman will only be angered after player looks at them
            If set to false, Enderman will hunt down players
            (requires restart)
            """)
    public boolean enderManOnlyAngerWhenLooking = true;

    @Comment("""
            Heyyy, you're inside the configs. Aren't you cool?
            Well since you're here, I may as well put some music i'm listening to while creating this
            #1: https://www.youtube.com/watch?v=Hf3B8A7WNhE
            #2: https://www.youtube.com/watch?v=FR91CB5SBWU (this is a good cover ngl)
            #3: https://www.youtube.com/watch?v=c8RgBaPxLxw (it's ancient but good imo)
            #4: https://www.youtube.com/watch?v=IbLA7Ca0_ng (another one that I liked)
            #5: https://www.youtube.com/watch?v=QpSyNV0wqr8 (it's a good remix)
            #6:https://www.youtube.com/watch?v=fKf3wxTMIus  (have you ever listened to harshcore?)
            #7: https://www.youtube.com/watch?v=-rAfpBtUoss (good t+paz mix)
            This is pretty pointless config entry but why not have fun while i'm at it. Plus the music is good.
            You might like it or not, try it. Give it a chance. :p
            """)
    public String PrettyPointlessTryingToEditThisOne = "As it has no effect on anything. You can use this to take notes if you want. But why would you? Notepads are free applications. Obsidian is a good markdown notepad if you're looking for something good. Why am I even typing this?";
}
