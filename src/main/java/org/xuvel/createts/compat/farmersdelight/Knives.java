package org.xuvel.createts.compat.farmersdelight;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ToolMaterial;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class Knives extends KnifeItem {
    public Knives(ToolMaterial tier, FabricItemSettings settings) {
        super(tier, .5f, -2f, settings);
    }
}