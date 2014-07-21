package com.king601.kingforge.init;

import com.king601.kingforge.block.BlockDerpTrident;
import com.king601.kingforge.block.BlockKF;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockKF derpTrident = new BlockDerpTrident();

    public static void init() {

        GameRegistry.registerBlock(derpTrident, "derpTrident");

    }
}
