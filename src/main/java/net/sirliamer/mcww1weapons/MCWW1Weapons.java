package net.sirliamer.mcww1weapons;

import net.fabricmc.api.ModInitializer;

import net.sirliamer.mcww1weapons.registry.ModEntity;
import net.sirliamer.mcww1weapons.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCWW1Weapons implements ModInitializer {
	public static final String MOD_ID = "mcww1weapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModEntity.registerModEntities();
	}
}