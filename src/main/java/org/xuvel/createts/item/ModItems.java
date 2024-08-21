package org.xuvel.createts.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.xuvel.createts.CreateTS;

public class ModItems {
    // Tin
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings()));
    // Bronze
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new FabricItemSettings()));
    public static final Item BRONZE_SHEET = registerItem("bronze_sheet", new Item(new FabricItemSettings()));
    // Steel
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));

    public static Item registerItem(String id, Item item) { return Registry.register(Registries.ITEM, new Identifier(CreateTS.MODID, id), item);}
    public static Item registerItem(String id, Item item, RegistryKey<ItemGroup> itemGroup) {
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(CreateTS.MODID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));

        return returnItem;
    }
    public static void register() {
        CreateTS.LOGGER.debug("Registering items for " + CreateTS.MODID);
    }
}
