package com.github.EltrutCo.flamboyant.registry;

import com.github.EltrutCo.flamboyant.Flamboyant;
import net.minecraft.item.*;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FlamboyantItems {

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, name), item);
    }

    //Flamboyant Wool Item
    public static final BlockItem AMBER_WOOL_ITEM = new BlockItem(FlamboyantBlocks.AMBER_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BEIGE_WOOL_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CREAM_WOOL_ITEM = new BlockItem(FlamboyantBlocks.CREAM_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DARK_GREEN_WOOL_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem FOREST_GREEN_WOOL_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem HOT_PINK_WOOL_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem INDIGO_WOOL_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAROON_WOOL_ITEM = new BlockItem(FlamboyantBlocks.MAROON_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem NAVY_WOOL_ITEM = new BlockItem(FlamboyantBlocks.NAVY_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem OLIVE_WOOL_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_GREEN_WOOL_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_PINK_WOOL_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_YELLOW_WOOL_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SKY_BLUE_WOOL_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SLATE_GRAY_WOOL_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem VIOLET_WOOL_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_WOOL,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Flamboyant Carpet Item
    public static final BlockItem AMBER_CARPET_ITEM = new BlockItem(FlamboyantBlocks.AMBER_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem BEIGE_CARPET_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem CREAM_CARPET_ITEM = new BlockItem(FlamboyantBlocks.CREAM_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem DARK_GREEN_CARPET_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem FOREST_GREEN_CARPET_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem HOT_PINK_CARPET_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem INDIGO_CARPET_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem MAROON_CARPET_ITEM = new BlockItem(FlamboyantBlocks.MAROON_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem NAVY_CARPET_ITEM = new BlockItem(FlamboyantBlocks.NAVY_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem OLIVE_CARPET_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_GREEN_CARPET_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_PINK_CARPET_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_YELLOW_CARPET_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SKY_BLUE_CARPET_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SLATE_GRAY_CARPET_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem VIOLET_CARPET_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_CARPET,  new Item.Settings().group(ItemGroup.DECORATIONS));

    //Flamboyant Terracotta Item
    public static final BlockItem AMBER_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.AMBER_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BEIGE_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CREAM_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.CREAM_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DARK_GREEN_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem FOREST_GREEN_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem HOT_PINK_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem INDIGO_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAROON_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.MAROON_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem NAVY_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.NAVY_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem OLIVE_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_GREEN_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_PINK_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_YELLOW_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SKY_BLUE_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SLATE_GRAY_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem VIOLET_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_TERRACOTTA,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Flamboyant Glazed Terracotta Item
    public static final BlockItem AMBER_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.AMBER_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem BEIGE_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem CREAM_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.CREAM_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem DARK_GREEN_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem FOREST_GREEN_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem HOT_PINK_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem INDIGO_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem MAROON_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.MAROON_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem NAVY_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.NAVY_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem OLIVE_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_GREEN_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_PINK_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_YELLOW_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SKY_BLUE_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SLATE_GRAY_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem VIOLET_GLAZED_TERRACOTTA_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_GLAZED_TERRACOTTA,  new Item.Settings().group(ItemGroup.DECORATIONS));

    //Flamboyant Concrete Item
    public static final BlockItem AMBER_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.AMBER_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BEIGE_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CREAM_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.CREAM_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DARK_GREEN_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem FOREST_GREEN_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem HOT_PINK_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem INDIGO_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAROON_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.MAROON_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem NAVY_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.NAVY_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem OLIVE_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_GREEN_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_PINK_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_YELLOW_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SKY_BLUE_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SLATE_GRAY_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem VIOLET_CONCRETE_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_CONCRETE,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Flamboyant Concrete Powder Item
    public static final BlockItem AMBER_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.AMBER_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BEIGE_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CREAM_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.CREAM_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DARK_GREEN_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem FOREST_GREEN_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem HOT_PINK_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem INDIGO_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAROON_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.MAROON_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem NAVY_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.NAVY_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem OLIVE_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_GREEN_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_PINK_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_YELLOW_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SKY_BLUE_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SLATE_GRAY_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem VIOLET_CONCRETE_POWDER_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_CONCRETE_POWDER,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Flamboyant Stained Glass Item
    public static final BlockItem AMBER_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.AMBER_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BEIGE_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CREAM_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.CREAM_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DARK_GREEN_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem FOREST_GREEN_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem HOT_PINK_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem INDIGO_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAROON_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.MAROON_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem NAVY_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.NAVY_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem OLIVE_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_GREEN_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_PINK_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PALE_YELLOW_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SKY_BLUE_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SLATE_GRAY_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem VIOLET_STAINED_GLASS_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_STAINED_GLASS,  new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Flamboyant Stained Glass Pane Item
    public static final BlockItem AMBER_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.AMBER_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem BEIGE_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.BEIGE_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem CREAM_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.CREAM_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem DARK_GREEN_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem FOREST_GREEN_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem HOT_PINK_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.HOT_PINK_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem INDIGO_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.INDIGO_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem MAROON_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.MAROON_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem NAVY_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.NAVY_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem OLIVE_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.OLIVE_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_GREEN_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_PINK_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.PALE_PINK_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PALE_YELLOW_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SKY_BLUE_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SLATE_GRAY_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem VIOLET_STAINED_GLASS_PANE_ITEM = new BlockItem(FlamboyantBlocks.VIOLET_STAINED_GLASS_PANE,  new Item.Settings().group(ItemGroup.DECORATIONS));

    //Flamboyant Dyes
    public static Item AMBER_DYE;
    public static Item BEIGE_DYE;
    public static Item CREAM_DYE;
    public static Item DARK_GREEN_DYE;
    public static Item FOREST_GREEN_DYE;
    public static Item HOT_PINK_DYE;
    public static Item INDIGO_DYE;
    public static Item MAROON_DYE;
    public static Item NAVY_DYE;
    public static Item OLIVE_DYE;
    public static Item PALE_GREEN_DYE;
    public static Item PALE_PINK_DYE;
    public static Item PALE_YELLOW_DYE;
    public static Item SKY_BLUE_DYE;
    public static Item SLATE_GRAY_DYE;
    public static Item VIOLET_DYE;

    public static void init() {

        //Flamboyant Wool Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_wool"),AMBER_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_wool"),BEIGE_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_wool"),CREAM_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_wool"),DARK_GREEN_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_wool"),FOREST_GREEN_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_wool"),HOT_PINK_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_wool"),INDIGO_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_wool"),MAROON_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_wool"),NAVY_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_wool"),OLIVE_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_wool"),PALE_GREEN_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_wool"),PALE_PINK_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_wool"),PALE_YELLOW_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_wool"),SKY_BLUE_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_wool"),SLATE_GRAY_WOOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_wool"),VIOLET_WOOL_ITEM);

        //Flamboyant Carpet Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_carpet"),AMBER_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_carpet"),BEIGE_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_carpet"),CREAM_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_carpet"),DARK_GREEN_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_carpet"),FOREST_GREEN_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_carpet"),HOT_PINK_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_carpet"),INDIGO_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_carpet"),MAROON_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_carpet"),NAVY_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_carpet"),OLIVE_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_carpet"),PALE_GREEN_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_carpet"),PALE_PINK_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_carpet"),PALE_YELLOW_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_carpet"),SKY_BLUE_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_carpet"),SLATE_GRAY_CARPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_carpet"),VIOLET_CARPET_ITEM);

        //Flamboyant Terracotta Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_terracotta"),AMBER_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_terracotta"),BEIGE_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_terracotta"),CREAM_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_terracotta"),DARK_GREEN_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_terracotta"),FOREST_GREEN_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_terracotta"),HOT_PINK_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_terracotta"),INDIGO_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_terracotta"),MAROON_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_terracotta"),NAVY_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_terracotta"),OLIVE_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_terracotta"),PALE_GREEN_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_terracotta"),PALE_PINK_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_terracotta"),PALE_YELLOW_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_terracotta"),SKY_BLUE_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_terracotta"),SLATE_GRAY_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_terracotta"),VIOLET_TERRACOTTA_ITEM);

        //Flamboyant Glazed Terracotta Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_glazed_terracotta"),AMBER_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_glazed_terracotta"),BEIGE_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_glazed_terracotta"),CREAM_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_glazed_terracotta"),DARK_GREEN_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_glazed_terracotta"),FOREST_GREEN_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_glazed_terracotta"),HOT_PINK_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_glazed_terracotta"),INDIGO_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_glazed_terracotta"),MAROON_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_glazed_terracotta"),NAVY_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_glazed_terracotta"),OLIVE_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_glazed_terracotta"),PALE_GREEN_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_glazed_terracotta"),PALE_PINK_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_glazed_terracotta"),PALE_YELLOW_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_glazed_terracotta"),SKY_BLUE_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_glazed_terracotta"),SLATE_GRAY_GLAZED_TERRACOTTA_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_glazed_terracotta"),VIOLET_GLAZED_TERRACOTTA_ITEM);

        //Flamboyant Concrete Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_concrete"),AMBER_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_concrete"),BEIGE_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_concrete"),CREAM_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_concrete"),DARK_GREEN_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_concrete"),FOREST_GREEN_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_concrete"),HOT_PINK_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_concrete"),INDIGO_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_concrete"),MAROON_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_concrete"),NAVY_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_concrete"),OLIVE_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_concrete"),PALE_GREEN_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_concrete"),PALE_PINK_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_concrete"),PALE_YELLOW_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_concrete"),SKY_BLUE_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_concrete"),SLATE_GRAY_CONCRETE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_concrete"),VIOLET_CONCRETE_ITEM);

        //Flamboyant Concrete Powder Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_concrete_powder"),AMBER_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_concrete_powder"),BEIGE_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_concrete_powder"),CREAM_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_concrete_powder"),DARK_GREEN_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_concrete_powder"),FOREST_GREEN_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_concrete_powder"),HOT_PINK_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_concrete_powder"),INDIGO_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_concrete_powder"),MAROON_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_concrete_powder"),NAVY_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_concrete_powder"),OLIVE_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_concrete_powder"),PALE_GREEN_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_concrete_powder"),PALE_PINK_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_concrete_powder"),PALE_YELLOW_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_concrete_powder"),SKY_BLUE_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_concrete_powder"),SLATE_GRAY_CONCRETE_POWDER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_concrete_powder"),VIOLET_CONCRETE_POWDER_ITEM);

        //Flamboyant Stained Glass Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_stained_glass"),AMBER_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_stained_glass"),BEIGE_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_stained_glass"),CREAM_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_stained_glass"),DARK_GREEN_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_stained_glass"),FOREST_GREEN_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_stained_glass"),HOT_PINK_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_stained_glass"),INDIGO_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_stained_glass"),MAROON_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_stained_glass"),NAVY_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_stained_glass"),OLIVE_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_stained_glass"),PALE_GREEN_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_stained_glass"),PALE_PINK_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_stained_glass"),PALE_YELLOW_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_stained_glass"),SKY_BLUE_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_stained_glass"),SLATE_GRAY_STAINED_GLASS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_stained_glass"),VIOLET_STAINED_GLASS_ITEM);

        //Flamboyant Stained Glass Pane Item
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "amber_stained_glass_pane"),AMBER_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "beige_stained_glass_pane"),BEIGE_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "cream_stained_glass_pane"),CREAM_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "dark_green_stained_glass_pane"),DARK_GREEN_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "forest_green_stained_glass_pane"),FOREST_GREEN_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "hot_pink_stained_glass_pane"),HOT_PINK_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "indigo_stained_glass_pane"),INDIGO_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "maroon_stained_glass_pane"),MAROON_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "navy_stained_glass_pane"),NAVY_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "olive_stained_glass_pane"),OLIVE_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_green_stained_glass_pane"),PALE_GREEN_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_pink_stained_glass_pane"),PALE_PINK_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "pale_yellow_stained_glass_pane"),PALE_YELLOW_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "sky_blue_stained_glass_pane"),SKY_BLUE_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "slate_gray_stained_glass_pane"),SLATE_GRAY_STAINED_GLASS_PANE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Flamboyant.MODID, "violet_stained_glass_pane"),VIOLET_STAINED_GLASS_PANE_ITEM);

        //Flamboyant Dyes
        AMBER_DYE = FlamboyantItems.register((String)"amber_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        BEIGE_DYE = FlamboyantItems.register((String)"beige_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        CREAM_DYE = FlamboyantItems.register((String)"cream_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        DARK_GREEN_DYE = FlamboyantItems.register((String)"dark_green_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        FOREST_GREEN_DYE = FlamboyantItems.register((String)"forest_green_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        HOT_PINK_DYE = FlamboyantItems.register((String)"hot_pink_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        INDIGO_DYE = FlamboyantItems.register((String)"indigo_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        MAROON_DYE = FlamboyantItems.register((String)"maroon_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        NAVY_DYE = FlamboyantItems.register((String)"navy_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        OLIVE_DYE = FlamboyantItems.register((String)"olive_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        PALE_GREEN_DYE = FlamboyantItems.register((String)"pale_green_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        PALE_PINK_DYE = FlamboyantItems.register((String)"pale_pink_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        PALE_YELLOW_DYE = FlamboyantItems.register((String)"pale_yellow_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        SKY_BLUE_DYE = FlamboyantItems.register((String)"sky_blue_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        SLATE_GRAY_DYE = FlamboyantItems.register((String)"slate_gray_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
        VIOLET_DYE = FlamboyantItems.register((String)"violet_dye", (Item)(new DyeItem(DyeColor.BLACK, (new Item.Settings()).group(ItemGroup.MATERIALS))));

    }
}
