package com.elgoreloco.modding;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "modding", name = "Modding", version = "1.7.2-1.0")
public class modding
{
    @Mod.Instance("modding")
    public static modding instance;

    //Bloques, items...
    @Mod.EventHandler //dice: el siguiente método es un eventhandler
    public void preInit(FMLPreInitializationEvent event) //le puedes poner cualquier nombre y le dices que es un método de PreInitialization
    {

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