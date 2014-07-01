package com.king601.kingforge.configuration;

import java.io.File;

import com.king601.kingforge.util.LogHelper;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

    public static void init(File configFile) {

        //Create Config object from given config file
        Configuration configuration = new Configuration(configFile);
        boolean testValue = false;

        try {
            configuration.load();

            testValue = configuration.get(Configuration.CATEGORY_GENERAL, "testValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e) {
            LogHelper.error("Config File did not load properly");
        }
        finally {

            //Save it
            configuration.save();

        }
    }
}
