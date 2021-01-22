package com.github.EltrutCo.flamboyant.config;

import com.github.EltrutCo.flamboyant.Flamboyant;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigManager;
import me.sargunvohra.mcmods.autoconfig1u.serializer.ConfigSerializer;

public class ConfigUtils {

    private ConfigUtils() {
        // NO-OP
    }

    public static void serializeConfig() {
        try {
            ((ConfigManager<ModConfig>) AutoConfig.getConfigHolder(ModConfig.class)).getSerializer().serialize(Flamboyant.CONFIG);
        } catch (ConfigSerializer.SerializationException serializeException) {
            Flamboyant.LOGGER.error("Failed to serialize " + Flamboyant.LOGGER.getName() + "'s config!", serializeException);
        }
    }
}
