package org.xuvel.createts;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xuvel.createts.block.ModBlocks;
import org.xuvel.createts.item.ModItemGroups;
import org.xuvel.createts.item.ModItems;
import org.xuvel.createts.worldgen.ModFeatures;

public class CreateTS implements ModInitializer {
	public static final String MODID = "createts";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModItemGroups.register();
		ModBlocks.register();
		ModFeatures.register();
	}
}