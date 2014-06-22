package com.king601.kingforge;

import com.king601.kingforge.reference.Messages;
import com.king601.kingforge.reference.Reference;
import com.king601.kingforge.util.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class KingForge {

    @Mod.Instance(Reference.MOD_ID)
    public static KingForge instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LogHelper.info(Messages.MOD_LOADED);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogHelper.info(Messages.MOD_LOADED);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info(Messages.MOD_LOADED);
    }
}
