package org.xuvel.createts.compat.farmersdelight;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import org.xuvel.createts.CreateTS;
import org.xuvel.createts.item.ModItems;

public class RegisterKnives {
    public static final Item STEEL_KNIFE = ModItems.registerItem("steel_knife", new Knives(ToolMaterials.STEEL,
            new FabricItemSettings()));
    public static final Item BRONZE_KNIFE = ModItems.registerItem("bronze_knife", new Knives(ToolMaterials.BRONZE,
            new FabricItemSettings()));
    public static void register() {
        CreateTS.LOGGER.debug("Registering knives from Farmer's Delight for " + CreateTS.MODID);
    }
}
