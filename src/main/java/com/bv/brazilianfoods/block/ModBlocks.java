package com.bv.brazilianfoods.block;

import com.bv.brazilianfoods.BrazilianFoods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block OVEN = registerBlock("oven",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, new Identifier(BrazilianFoods.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BrazilianFoods.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

     public static void registerModBlocks() {

         BrazilianFoods.LOGGER.info("Registering Modblocks for " + BrazilianFoods.MOD_ID);

     }
}
