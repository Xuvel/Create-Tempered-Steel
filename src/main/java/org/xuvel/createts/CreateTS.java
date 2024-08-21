package org.xuvel.createts;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xuvel.createts.block.ModBlocks;
import org.xuvel.createts.compat.farmersdelight.Knives;
import org.xuvel.createts.compat.farmersdelight.RegisterKnives;
import org.xuvel.createts.compat.farmersdelight.ToolMaterials;
import org.xuvel.createts.item.ModItemGroups;
import org.xuvel.createts.item.ModItems;
import org.xuvel.createts.worldgen.ModFeatures;

public class CreateTS implements ModInitializer {
	public static final String MODID = "createts";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static boolean isFarmersDelightLoaded = false;

	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
			isFarmersDelightLoaded = true;
			RegisterKnives.register();
		}
		ModItems.register();
		ModItemGroups.register();
		ModBlocks.register();
		ModFeatures.register();
	}
}