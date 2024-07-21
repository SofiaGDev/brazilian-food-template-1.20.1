package com.bv.brazilianfoods.item;

import com.bv.brazilianfoods.BrazilianFoods;
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
    public static final Item FRYING_PAN = registerItem("frying_pan", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(PAN);
        entries.add(FRYING_PAN);
    }

      private static Item registerItem(String name, Item item) {
          return Registry.register(Registries.ITEM, new Identifier(BrazilianFoods.MOD_ID, name), item);
      }

    public static void registerModItems() {
        BrazilianFoods.LOGGER.info("Registering Mod Items for " + BrazilianFoods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
