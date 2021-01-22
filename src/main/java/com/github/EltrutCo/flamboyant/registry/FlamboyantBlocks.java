package com.github.EltrutCo.flamboyant.registry;

import com.github.EltrutCo.flamboyant.Flamboyant;
import com.github.EltrutCo.flamboyant.block.FCarpetBlock;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FlamboyantBlocks {

    /**
     * TODO: Make all the blocks and items as the other counterparts so they could have the correct dye color and material color
     */

    //Flamboyant Wool
    public static final Block AMBER_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block BEIGE_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block CREAM_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block DARK_GREEN_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block FOREST_GREEN_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block HOT_PINK_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block INDIGO_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block MAROON_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block NAVY_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block OLIVE_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block PALE_GREEN_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block PALE_PINK_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block PALE_YELLOW_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block SKY_BLUE_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block SLATE_GRAY_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));
    public static final Block VIOLET_WOOL = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL));

    //Flamboyant Carpet
    public static final FCarpetBlock AMBER_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock BEIGE_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock CREAM_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock DARK_GREEN_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock FOREST_GREEN_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock HOT_PINK_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock INDIGO_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock MAROON_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock NAVY_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock OLIVE_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock PALE_GREEN_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock PALE_PINK_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock PALE_YELLOW_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock SKY_BLUE_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock SLATE_GRAY_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));
    public static final FCarpetBlock VIOLET_CARPET = new FCarpetBlock(DyeColor.BLACK, AbstractBlock.Settings.of(Material.CARPET, MaterialColor.WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL));

    //Flamboyant Terracotta
    public static final Block AMBER_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block BEIGE_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block CREAM_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block DARK_GREEN_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block FOREST_GREEN_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block HOT_PINK_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block INDIGO_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block MAROON_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block NAVY_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block OLIVE_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block PALE_GREEN_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block PALE_PINK_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block PALE_YELLOW_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block SKY_BLUE_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block SLATE_GRAY_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));
    public static final Block VIOLET_TERRACOTTA = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA));

    //Flamboyant Glazed Terracotta
    public static final GlazedTerracottaBlock AMBER_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock BEIGE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock CREAM_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock DARK_GREEN_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock FOREST_GREEN_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock HOT_PINK_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock INDIGO_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock MAROON_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock NAVY_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock OLIVE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock PALE_GREEN_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock PALE_PINK_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock PALE_YELLOW_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock SKY_BLUE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock SLATE_GRAY_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));
    public static final GlazedTerracottaBlock VIOLET_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BLACK_GLAZED_TERRACOTTA));

    //Flamboyant Concrete
    public static final Block AMBER_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block BEIGE_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block CREAM_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block DARK_GREEN_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block FOREST_GREEN_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block HOT_PINK_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block INDIGO_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block MAROON_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block NAVY_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block OLIVE_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block PALE_GREEN_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block PALE_PINK_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block PALE_YELLOW_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block SKY_BLUE_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block SLATE_GRAY_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));
    public static final Block VIOLET_CONCRETE = new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));

    //Flamboyant Concrete Powder
    public static final ConcretePowderBlock AMBER_CONCRETE_POWDER = new ConcretePowderBlock(AMBER_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock BEIGE_CONCRETE_POWDER = new ConcretePowderBlock(BEIGE_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock CREAM_CONCRETE_POWDER = new ConcretePowderBlock(CREAM_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock DARK_GREEN_CONCRETE_POWDER = new ConcretePowderBlock(DARK_GREEN_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock FOREST_GREEN_CONCRETE_POWDER = new ConcretePowderBlock(FOREST_GREEN_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock HOT_PINK_CONCRETE_POWDER = new ConcretePowderBlock(HOT_PINK_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock INDIGO_CONCRETE_POWDER = new ConcretePowderBlock(INDIGO_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock MAROON_CONCRETE_POWDER = new ConcretePowderBlock(MAROON_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock NAVY_CONCRETE_POWDER = new ConcretePowderBlock(NAVY_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock OLIVE_CONCRETE_POWDER = new ConcretePowderBlock(OLIVE_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock PALE_GREEN_CONCRETE_POWDER = new ConcretePowderBlock(PALE_GREEN_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock PALE_PINK_CONCRETE_POWDER = new ConcretePowderBlock(PALE_PINK_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock PALE_YELLOW_CONCRETE_POWDER = new ConcretePowderBlock(PALE_YELLOW_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock SKY_BLUE_CONCRETE_POWDER = new ConcretePowderBlock(SKY_BLUE_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock SLATE_GRAY_CONCRETE_POWDER = new ConcretePowderBlock(SLATE_GRAY_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));
    public static final ConcretePowderBlock VIOLET_CONCRETE_POWDER = new ConcretePowderBlock(VIOLET_CONCRETE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE_POWDER));

    //Flamboyant Stained Glass
    public static final GlassBlock AMBER_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock BEIGE_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock CREAM_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock DARK_GREEN_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock FOREST_GREEN_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock HOT_PINK_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock INDIGO_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock MAROON_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock NAVY_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock OLIVE_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock PALE_GREEN_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock PALE_PINK_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock PALE_YELLOW_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock SKY_BLUE_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock SLATE_GRAY_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));
    public static final GlassBlock VIOLET_STAINED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS));

    //Flamboyant Stained Glass Pane
    public static final StainedGlassPaneBlock AMBER_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock BEIGE_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock CREAM_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock DARK_GREEN_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock FOREST_GREEN_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock HOT_PINK_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock INDIGO_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock MAROON_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock NAVY_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock OLIVE_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock PALE_GREEN_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock PALE_PINK_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock PALE_YELLOW_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock SKY_BLUE_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock SLATE_GRAY_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));
    public static final StainedGlassPaneBlock VIOLET_STAINED_GLASS_PANE = new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS_PANE));

    public static void init() {

        //Flamboyant Wool
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_wool"),AMBER_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_wool"),BEIGE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_wool"),CREAM_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_wool"),DARK_GREEN_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_wool"),FOREST_GREEN_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_wool"),HOT_PINK_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_wool"),INDIGO_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_wool"),MAROON_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_wool"),NAVY_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_wool"),OLIVE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_wool"),PALE_GREEN_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_wool"),PALE_PINK_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_wool"),PALE_YELLOW_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_wool"),SKY_BLUE_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_wool"),SLATE_GRAY_WOOL);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_wool"),VIOLET_WOOL);

        //Flamboyant Carpet
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_carpet"),AMBER_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_carpet"),BEIGE_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_carpet"),CREAM_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_carpet"),DARK_GREEN_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_carpet"),FOREST_GREEN_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_carpet"),HOT_PINK_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_carpet"),INDIGO_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_carpet"),MAROON_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_carpet"),NAVY_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_carpet"),OLIVE_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_carpet"),PALE_GREEN_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_carpet"),PALE_PINK_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_carpet"),PALE_YELLOW_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_carpet"),SKY_BLUE_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_carpet"),SLATE_GRAY_CARPET);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_carpet"),VIOLET_CARPET);

        //Flamboyant Terracotta
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_terracotta"),AMBER_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_terracotta"),BEIGE_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_terracotta"),CREAM_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_terracotta"),DARK_GREEN_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_terracotta"),FOREST_GREEN_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_terracotta"),HOT_PINK_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_terracotta"),INDIGO_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_terracotta"),MAROON_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_terracotta"),NAVY_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_terracotta"),OLIVE_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_terracotta"),PALE_GREEN_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_terracotta"),PALE_PINK_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_terracotta"),PALE_YELLOW_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_terracotta"),SKY_BLUE_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_terracotta"),SLATE_GRAY_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_terracotta"),VIOLET_TERRACOTTA);

        //Flamboyant Glazed Terracotta
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_glazed_terracotta"),AMBER_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_glazed_terracotta"),BEIGE_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_glazed_terracotta"),CREAM_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_glazed_terracotta"),DARK_GREEN_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_glazed_terracotta"),FOREST_GREEN_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_glazed_terracotta"),HOT_PINK_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_glazed_terracotta"),INDIGO_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_glazed_terracotta"),MAROON_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_glazed_terracotta"),NAVY_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_glazed_terracotta"),OLIVE_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_glazed_terracotta"),PALE_GREEN_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_glazed_terracotta"),PALE_PINK_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_glazed_terracotta"),PALE_YELLOW_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_glazed_terracotta"),SKY_BLUE_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_glazed_terracotta"),SLATE_GRAY_GLAZED_TERRACOTTA);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_glazed_terracotta"),VIOLET_GLAZED_TERRACOTTA);

        //Flamboyant Concrete
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_concrete"),AMBER_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_concrete"),BEIGE_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_concrete"),CREAM_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_concrete"),DARK_GREEN_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_concrete"),FOREST_GREEN_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_concrete"),HOT_PINK_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_concrete"),INDIGO_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_concrete"),MAROON_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_concrete"),NAVY_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_concrete"),OLIVE_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_concrete"),PALE_GREEN_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_concrete"),PALE_PINK_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_concrete"),PALE_YELLOW_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_concrete"),SKY_BLUE_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_concrete"),SLATE_GRAY_CONCRETE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_concrete"),VIOLET_CONCRETE);

        //Flamboyant Concrete Powder
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_concrete_powder"),AMBER_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_concrete_powder"),BEIGE_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_concrete_powder"),CREAM_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_concrete_powder"),DARK_GREEN_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_concrete_powder"),FOREST_GREEN_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_concrete_powder"),HOT_PINK_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_concrete_powder"),INDIGO_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_concrete_powder"),MAROON_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_concrete_powder"),NAVY_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_concrete_powder"),OLIVE_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_concrete_powder"),PALE_GREEN_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_concrete_powder"),PALE_PINK_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_concrete_powder"),PALE_YELLOW_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_concrete_powder"),SKY_BLUE_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_concrete_powder"),SLATE_GRAY_CONCRETE_POWDER);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_concrete_powder"),VIOLET_CONCRETE_POWDER);

        //Flamboyant Stained Glass
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_stained_glass"),AMBER_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_stained_glass"),BEIGE_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_stained_glass"),CREAM_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_stained_glass"),DARK_GREEN_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_stained_glass"),FOREST_GREEN_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_stained_glass"),HOT_PINK_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_stained_glass"),INDIGO_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_stained_glass"),MAROON_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_stained_glass"),NAVY_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_stained_glass"),OLIVE_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_stained_glass"),PALE_GREEN_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_stained_glass"),PALE_PINK_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_stained_glass"),PALE_YELLOW_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_stained_glass"),SKY_BLUE_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_stained_glass"),SLATE_GRAY_STAINED_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_stained_glass"),VIOLET_STAINED_GLASS);

        //Flamboyant Stained Glass Pane
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "amber_stained_glass_pane"),AMBER_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "beige_stained_glass_pane"),BEIGE_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "cream_stained_glass_pane"),CREAM_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "dark_green_stained_glass_pane"),DARK_GREEN_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "forest_green_stained_glass_pane"),FOREST_GREEN_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "hot_pink_stained_glass_pane"),HOT_PINK_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "indigo_stained_glass_pane"),INDIGO_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "maroon_stained_glass_pane"),MAROON_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "navy_stained_glass_pane"),NAVY_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "olive_stained_glass_pane"),OLIVE_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_green_stained_glass_pane"),PALE_GREEN_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_pink_stained_glass_pane"),PALE_PINK_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "pale_yellow_stained_glass_pane"),PALE_YELLOW_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "sky_blue_stained_glass_pane"),SKY_BLUE_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "slate_gray_stained_glass_pane"),SLATE_GRAY_STAINED_GLASS_PANE);
        Registry.register(Registry.BLOCK, new Identifier(Flamboyant.MODID, "violet_stained_glass_pane"),VIOLET_STAINED_GLASS_PANE);

    }

}
