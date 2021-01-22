package com.github.EltrutCo.flamboyant.items;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.MaterialColor;
import net.minecraft.util.DyeColor;
import net.minecraft.util.StringIdentifiable;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public enum FDyeColor implements StringIdentifiable {

    AMBER(0, "amber", 16383998,MaterialColor.WHITE, 15790320, 16777215),
    BEIGE(1, "beige", 16351261, MaterialColor.ORANGE, 15435844, 16738335),
    CREAM(2, "cream", 13061821, MaterialColor.MAGENTA, 12801229, 16711935),
    DARK_GREEN(3, "dark_green", 3847130, MaterialColor.LIGHT_BLUE, 6719955, 10141901),
    FOREST_GREEN(4, "forest_green", 16701501, MaterialColor.YELLOW, 14602026, 16776960),
    HOT_PINK(5, "hot_pink", 8439583, MaterialColor.LIME, 4312372, 12582656),
    INDIGO(6, "indigo", 15961002, MaterialColor.PINK, 14188952, 16738740),
    MAROON(7, "maroon", 4673362, MaterialColor.GRAY, 4408131, 8421504),
    NAVY(8, "navy", 10329495, MaterialColor.LIGHT_GRAY, 11250603, 13882323),
    OLIVE(9, "olive", 1481884, MaterialColor.CYAN, 2651799, 65535),
    PALE_GREEN(10, "pale_green", 8991416, MaterialColor.PURPLE, 8073150, 10494192),
    PALE_PINK(11, "pale_pink", 3949738, MaterialColor.BLUE, 2437522, 255),
    PALE_YELLOW(12, "pale_yellow", 8606770, MaterialColor.BROWN, 5320730, 9127187),
    SKY_BLUE(13, "sky_blue", 6192150, MaterialColor.GREEN, 3887386, 65280),
    SLATE_GRAY(14, "slate_gray", 11546150, MaterialColor.RED, 11743532, 16711680),
    VIOLET(15, "violet", 1908001, MaterialColor.BLACK, 1973019, 0);

    public static final FDyeColor[] VALUES = (FDyeColor[]) Arrays.stream(values()).sorted(Comparator.comparingInt(FDyeColor::getId)).toArray((i) -> {
        return new FDyeColor[i];
    });
    public static final Int2ObjectOpenHashMap<FDyeColor> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap((Map)Arrays.stream(values()).collect(Collectors.toMap((fDyeColor) -> {
        return fDyeColor.fireworkColor;
    }, (fDyeColor) -> {
        return fDyeColor;
    })));
    public final int id;
    public final String name;
    public final MaterialColor materialColor;
    public final int color;
    public final int colorSwapped;
    public final float[] colorComponents;
    public final int fireworkColor;
    public final int signColor;

    FDyeColor(int woolId, String name, int color, MaterialColor materialColor, int fireworkColor, int signColor) {
        this.id = woolId;
        this.name = name;
        this.color = color;
        this.materialColor = materialColor;
        this.signColor = signColor;
        int j = (color & 16711680) >> 16;
        int k = (color & '\uff00') >> 8;
        int l = (color & 255) >> 0;
        this.colorSwapped = l << 16 | k << 8 | j << 0;
        this.colorComponents = new float[]{(float)j / 255.0F, (float)k / 255.0F, (float)l / 255.0F};
        this.fireworkColor = fireworkColor;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float[] getColorComponents() {
        return this.colorComponents;
    }

    public MaterialColor getMaterialColor() {
        return this.materialColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    @Environment(EnvType.CLIENT)
    public int getSignColor() {
        return this.signColor;
    }

    public static FDyeColor byId(int id) {
        if (id < 0 || id >= VALUES.length) {
            id = 0;
        }

        return VALUES[id];
    }

    public static FDyeColor byName(String name, FDyeColor defaultColor) {
        FDyeColor[] var2 = values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            FDyeColor fDyeColor = var2[var4];
            if (fDyeColor.name.equals(name)) {
                return fDyeColor;
            }
        }

        return defaultColor;
    }

    @Nullable
    @Environment(EnvType.CLIENT)
    public static FDyeColor byFireworkColor(int color) {
        return (FDyeColor)BY_FIREWORK_COLOR.get(color);
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }

}
