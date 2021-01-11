package com.github.steveplayzz.modid.registry;

import com.github.steveplayzz.modid.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleModItems {



    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExampleMod.MODID, name), item);
    }

    public static void init() {
        // NO-OP
    }

    public ExampleModItems() {
        // NO-OP
    }
}
