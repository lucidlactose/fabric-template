package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BreadMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		public static final Item EXAMPLE_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
		public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

		System.out.println("Hello SUPER MAN IM HERE WITH SASUKE SO GET DOWN HERE world!");
	}
}
