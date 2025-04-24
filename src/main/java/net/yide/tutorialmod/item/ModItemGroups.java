package net.yide.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.yide.tutorialmod.TutorialMod;

public class ModItemGroups {
	public static final ItemGroup CUSTOM_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(TutorialMod.MOD_ID, "custom_group"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.CUSTOM_KATANA))
					.displayName(Text.translatable("itemgroup.tutorialmod.custom_items"))
					.entries((displayContext, entries) -> {
		entries.add(ModItems.CUSTOM_CROWN);
		entries.add(ModItems.CUSTOM_KATANA);
	}).build());

	public static final ItemGroup CUSTOM_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(TutorialMod.MOD_ID, "custom_block_group"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModBlocks.CUSTOM_ORE))
					.displayName(Text.translatable("itemgroup.tutorialmod.custom_blocks"))
					.entries((displayContext, entries) -> {
						entries.add(ModBlocks.CUSTOM_ORE);
						entries.add(ModBlocks.CUSTOM_BLOCKDROP);
						entries.add(ModBlocks.CUSTOM_BLOCKDROP_TWO);
					}).build());

	public static void registerItemsGroup() {
		TutorialMod.LOGGER.info("Registering Item Groups for" + TutorialMod.MOD_ID);
	}
}
