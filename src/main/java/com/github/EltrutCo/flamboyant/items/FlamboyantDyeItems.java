package com.github.EltrutCo.flamboyant.items;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;

import java.util.EnumMap;

public class FlamboyantDyeItems {

    private static final EnumMap<FDyeColor, Object> DYES = Maps.newEnumMap(FDyeColor.class);
    private final FDyeColor fDyeColor;

    public FlamboyantDyeItems(FlamboyantDyeItems flamboyantDyeItems, FDyeColor fDyeColor, Item.Settings group) {
        this.fDyeColor = fDyeColor;
        DYES.put(fDyeColor, this);
    }

    /*
    public FlamboyantDyeItems(FDyeColor fDyeColor, Item.Settings settings) {
        super(settings);
        this.fDyeColor = fDyeColor;
        DYES.put(fDyeColor, this);
    }

     */

    //Might need to mixin to this because it doesn't allow sheep to have this dyecolor
    /*
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (entity instanceof SheepEntity) {
            SheepEntity sheepEntity = (SheepEntity)entity;
            if (sheepEntity.isAlive() && !sheepEntity.isSheared() && sheepEntity.getColor() != this.color) {
                if (!user.world.isClient) {
                    sheepEntity.setColor(this.color);
                    stack.decrement(1);
                }

                return ActionResult.success(user.world.isClient);
            }
        }

        return ActionResult.PASS;
    }
     */

    public FDyeColor getColor() {
        return this.fDyeColor;
    }

    public static FlamboyantDyeItems byColor(FDyeColor color) {
        return (FlamboyantDyeItems)DYES.get(color);
    }

}
