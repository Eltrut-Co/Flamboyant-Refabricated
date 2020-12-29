package com.github.steveplayzz.modid.registry;

import com.github.steveplayzz.modid.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {



    private static Block register(String name, Block item) {
        return Registry.register(Registry.BLOCK, new Identifier(ExampleMod.MODID, name), item);
    }

    public static void init() {
        // NO-OP
    }

    private Blocks() {
        // NO-OP
    }
}
