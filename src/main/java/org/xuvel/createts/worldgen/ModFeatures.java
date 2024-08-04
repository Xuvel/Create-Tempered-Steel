package org.xuvel.createts.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.xuvel.createts.CreateTS;

import java.util.function.Predicate;

public class ModFeatures {
    public static final RegistryKey<PlacedFeature> TIN_ORE = registerOreFeature(
            "tin_ore",
            RegistryKeys.PLACED_FEATURE,
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES
    );

    private static RegistryKey<PlacedFeature> registerOreFeature(String id, RegistryKey<Registry<PlacedFeature>> registryKey, Predicate<BiomeSelectionContext> biomeSelectionContext, GenerationStep.Feature feature) {
        RegistryKey<PlacedFeature> result = RegistryKey.of(registryKey, new Identifier(CreateTS.MODID, id));
        BiomeModifications.addFeature(biomeSelectionContext, feature, result);

        return result;
    }

    public static void register() {
        CreateTS.LOGGER.debug("Registering worldgen for " + CreateTS.MODID);
    }
}
