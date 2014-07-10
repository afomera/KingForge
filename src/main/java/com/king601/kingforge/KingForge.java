package com.king601.kingforge;

import com.king601.kingforge.handler.ConfigurationHandler;
import com.king601.kingforge.proxy.IProxy;
import com.king601.kingforge.reference.Messages;
import com.king601.kingforge.reference.Reference;
import com.king601.kingforge.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class KingForge {

    @Mod.Instance(Reference.MOD_ID)
    public static KingForge instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LogHelper.info(Messages.MOD_PREINIT);

        //Load the config file
        LogHelper.info(Messages.CONFIG_LOADING);
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info(Messages.MOD_INIT);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info(Messages.MOD_LOADED);

    }
}
