package net.yide.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.yide.tutorialmod.item.ModBlocks;
import net.yide.tutorialmod.item.ModItemGroups;
import net.yide.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	// Important Comment
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemsGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}