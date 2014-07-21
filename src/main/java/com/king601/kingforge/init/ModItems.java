package com.king601.kingforge.init;

import com.king601.kingforge.item.ItemKF;
import com.king601.kingforge.item.ItemTrident;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemKF trident = new ItemTrident();

    public static void init () {

        GameRegistry.registerItem(trident, "trident");

    }

}
