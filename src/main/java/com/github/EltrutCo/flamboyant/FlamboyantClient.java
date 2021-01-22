package com.github.EltrutCo.flamboyant;

import com.github.EltrutCo.flamboyant.registry.FlamboyantBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FlamboyantClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        //Flamboyant Glass
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.AMBER_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.BEIGE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.CREAM_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.HOT_PINK_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.INDIGO_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.MAROON_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.NAVY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.OLIVE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.PALE_PINK_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.VIOLET_STAINED_GLASS, RenderLayer.getTranslucent());

        //Flamboyant Glass Pane
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.AMBER_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.BEIGE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.CREAM_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.HOT_PINK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.INDIGO_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.MAROON_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.NAVY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.OLIVE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.PALE_PINK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FlamboyantBlocks.VIOLET_STAINED_GLASS_PANE, RenderLayer.getTranslucent());

    }
}
