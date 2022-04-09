package mrrubberducky.endermangrief;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import mrrubberducky.endermangrief.config.ConfigFile;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndermanGriefMain implements ModInitializer {
    // Don't blame me that the packages are called mrrubberducky.endermangrief, didn't realize they have to follow something
    public static final ConfigFile EnderManGriefConfig = AutoConfig.register(ConfigFile.class, JanksonConfigSerializer::new).getConfig();
    @Override
    public void onInitialize() {
    }
}
