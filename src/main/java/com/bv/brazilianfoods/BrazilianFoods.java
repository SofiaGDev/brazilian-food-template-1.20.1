package com.bv.brazilianfoods;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrazilianFoods implements ModInitializer {

	public static final String MOD_ID = "brazilianfoods";
    public static final Logger LOGGER = LoggerFactory.getLogger("brazilianfoods");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}