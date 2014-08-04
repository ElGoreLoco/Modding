package com.elgoreloco.modding.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //load the configuration file
            configuration.load();

            //read in properties from configuration file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configCalue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            //log the exception
        }
        finally
        {
            //save the configuration file
            configuration.save();
        }
    }
}
