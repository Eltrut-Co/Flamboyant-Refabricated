package com.github.steveplayzz.modid;

import com.github.steveplayzz.modid.registry.ExampleModBlocks;
import com.github.steveplayzz.modid.config.ModConfig;
import com.github.steveplayzz.modid.registry.ExampleModEntities;
import com.github.steveplayzz.modid.registry.ExampleModItems;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInitializer {

	public static final String MODID = "modid";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitialize() {
		ExampleModBlocks.init();
		ExampleModItems.init();
		ExampleModEntities.init();
		new ExampleModItems();
		new ExampleModBlocks();
	}

	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}
}
