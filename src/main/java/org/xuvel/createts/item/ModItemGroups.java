package org.xuvel.createts.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.xuvel.createts.CreateTS;
import org.xuvel.createts.block.ModBlocks;

public class ModItemGroups {
        public static final ItemGroup MAIN_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier("tutorial", "test_group"), FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.TIN_INGOT))
                .displayName(Text.translatable("Create: Tempered Steel"))
                .entries((context, entries) -> {
                    entries.add(ModItems.RAW_TIN);
                    entries.add(ModItems.TIN_INGOT);
                    entries.add(ModItems.TIN_NUGGET);
                    entries.add(ModItems.BRONZE_INGOT);
                    entries.add(ModItems.BRONZE_SHEET);
                    entries.add(ModItems.BRONZE_NUGGET);
                    entries.add(ModItems.STEEL_INGOT);
                    entries.add(ModItems.STEEL_NUGGET);
                    entries.add(ModBlocks.TIN_BLOCK);
                    entries.add(ModBlocks.RAW_TIN_BLOCK);
                    entries.add(ModBlocks.BRONZE_BLOCK);
                    entries.add(ModBlocks.STEEL_BLOCK);
                    entries.add(ModBlocks.TIN_ORE);
                    entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
//                    entries.add(ModItems.STEEL_KNIFE);
//                    entries.add(ModItems.BRONZE_KNIFE);
                })
                .build());
    public static void register() {
        CreateTS.LOGGER.debug("Registering groups for " + CreateTS.MODID);
    }

}

