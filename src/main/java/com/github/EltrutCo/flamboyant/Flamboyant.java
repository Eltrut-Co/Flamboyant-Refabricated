package com.github.EltrutCo.flamboyant;

import com.github.EltrutCo.flamboyant.config.ModConfig;
import com.github.EltrutCo.flamboyant.registry.FlamboyantBlocks;
import com.github.EltrutCo.flamboyant.registry.FlamboyantItems;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Flamboyant implements ModInitializer {

	public static final String MODID = "flamboyant";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitialize() {
		FlamboyantBlocks.init();
		FlamboyantItems.init();
		new FlamboyantItems();
		new FlamboyantBlocks();
	}

	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}
}
