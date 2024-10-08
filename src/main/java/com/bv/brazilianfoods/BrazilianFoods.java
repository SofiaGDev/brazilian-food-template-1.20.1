package com.bv.brazilianfoods;

import com.bv.brazilianfoods.block.ModBlocks;
import com.bv.brazilianfoods.item.ModItemGroups;
import com.bv.brazilianfoods.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrazilianFoods implements ModInitializer {

	public static final String MOD_ID = "brazilianfoods";
    public static final Logger LOGGER = LoggerFactory.getLogger("brazilianfoods");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}