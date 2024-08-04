package org.xuvel.createts.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.xuvel.createts.CreateTS;
import org.xuvel.createts.item.ModItems;

public class ModBlocks {
    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block TIN_ORE = registerBlock("tin_ore", new Block(FabricBlockSettings.create().requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", new Block(FabricBlockSettings.create().requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    private static Block registerBlock(String id, Block block, RegistryKey<ItemGroup> itemGroup) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()), itemGroup);

        return Registry.register(Registries.BLOCK, new Identifier(CreateTS.MODID, id), block);
    }
    private static Block registerBlock(String id, Block block) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()));

        return Registry.register(Registries.BLOCK, new Identifier(CreateTS.MODID, id), block);
    }
    public static  void register() {
        CreateTS.LOGGER.debug("Registering blocks for " + CreateTS.MODID);
    }
}
