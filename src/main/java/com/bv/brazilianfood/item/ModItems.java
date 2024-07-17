package com.bv.brazilianfood.item;

import com.bv.brazilianfood.BrazilianFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PAN = registerItem("pan", new Item(new FabricItemSettings()));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(PAN);
    }

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(BrazilianFood.MOD_ID, name), item);
    }

    public static void registerModItems() {

        BrazilianFood.LOGGER.info("Regestering Mod Items for " + BrazilianFood.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToIngredientItemGroup);
    }
}
