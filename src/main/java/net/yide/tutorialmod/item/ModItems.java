package net.yide.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yide.tutorialmod.TutorialMod;
import net.yide.tutorialmod.item.custom.ChiselItem;

public class ModItems {
	public static final	Item CUSTOM_KATANA = registerItem("custom_katana", new Item(new Item.Settings()));
	public static final Item CUSTOM_CROWN = registerItem("custom_crown", new Item(new Item.Settings()));

	public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(CUSTOM_KATANA);
			entries.add(CUSTOM_CROWN);
		});
	}
}
