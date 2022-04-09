package mrrubberducky.endermangrief;

import io.netty.util.internal.logging.Slf4JLoggerFactory;
import mrrubberducky.endermangrief.config.ConfigFile;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.game.minecraft.Slf4jLogHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndermanGriefMain implements ModInitializer {
    // Don't blame me that the packages are called mrrubberducky.endermangrief, didn't realize they have to follow something
    public static final Logger LOGGER = LoggerFactory.getLogger("EndermanGrief");
    public static final ConfigFile config = new ConfigFile();

    @Override
    public void onInitialize() {
        LOGGER.info("[EndermanGrief] Initializing configuration file");
        config.load();
        LOGGER.info("[EndermanGrief] Done! Enjoy your cursed Endermen!");
    }
}
