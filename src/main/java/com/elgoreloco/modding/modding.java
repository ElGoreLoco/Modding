package com.elgoreloco.modding;

import com.elgoreloco.modding.configuration.ConfigurationHandler;
import com.elgoreloco.modding.proxy.IProxy;
import com.elgoreloco.modding.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class modding
{
    @Mod.Instance(Reference.MOD_ID)
    public static modding instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //Bloques, items...
    @Mod.EventHandler //dice: el siguiente método es un eventhandler
    public void preInit(FMLPreInitializationEvent event) //le puedes poner cualquier nombre y le dices que es un método de PreInitialization
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }
    //GUIs, recetas, tile.entities
   @Mod.EventHandler
    public void init(FMLInitializationEvent event)
   {

   }
    //hacer cosas después de que otros mods inicien
   @Mod.EventHandler
   public void postInti(FMLPostInitializationEvent event)
   {

   }
}