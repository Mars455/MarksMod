package mars455.marksmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Marksmod implements ModInitializer {
	public static final String MOD_ID = "marksmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}


	public class MarksMod implements ModInitializer {
		@Override
		public void onInitialize() {
			ModItems.initialize();
		}
	}

	public class ModItems {
		public static Item register(Item item, String id){
			Identifier itemID = Identifier.of("mars455.marksmod:" + id);

			Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

			return registeredItem;
		}
		public static void initialize() {

		}
		public static final Item CHARGED_STEEL = register(
				new Item(new Item.Settings()),
				"charged_steel"
		);
	}



}