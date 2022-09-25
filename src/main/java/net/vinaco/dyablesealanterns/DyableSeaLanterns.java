package net.vinaco.dyablesealanterns;

import net.fabricmc.api.ModInitializer;
import net.vinaco.dyablesealanterns.item.ModItems;
import net.vinaco.dyablesealanterns.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyableSeaLanterns implements ModInitializer {


	public static final String MOD_ID = "dyablesealanterns";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
