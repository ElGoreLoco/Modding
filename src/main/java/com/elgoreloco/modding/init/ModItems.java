package com.elgoreloco.modding.init;

import com.elgoreloco.modding.item.ItemMODDING;
import com.elgoreloco.modding.item.ItemPaella;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMODDING paella = new ItemPaella();

    public static void init()
    {
        GameRegistry.registerItem(paella, "Paella");
    }
}
