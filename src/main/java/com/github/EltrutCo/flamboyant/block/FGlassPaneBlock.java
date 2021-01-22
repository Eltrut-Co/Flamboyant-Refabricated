package com.github.EltrutCo.flamboyant.block;

import net.minecraft.block.PaneBlock;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.ItemStack;

public class FGlassPaneBlock extends PaneBlock implements ItemColorProvider {
    protected FGlassPaneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getColor(ItemStack stack, int tintIndex) {
        return 0;
    }
}
