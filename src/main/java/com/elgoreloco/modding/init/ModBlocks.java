package com.elgoreloco.modding.init;

import com.elgoreloco.modding.block.BlockFlag;
import com.elgoreloco.modding.block.BlockMODDING;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockMODDING flag =  new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}