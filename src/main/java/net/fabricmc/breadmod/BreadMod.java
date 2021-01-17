package net.fabricmc.breadmod;

import java.util.List;

import com.mojang.datafixers.util.Pair;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.breadmod.items.SlicedBread;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BreadMod implements ModInitializer {
	public static final String MOD_ID = "breadmod";

	public static final FoodComponent foodSettings = new FoodComponent.Builder().hunger(1).saturationModifier(1.0f).snack().meat().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*3), .5f).build());
	public static final SlicedBread SLICED_BREAD = new SlicedBread(
		new FabricItemSettings()
		.group(ItemGroup.FOOD)
		.maxCount((16))
		.food(foodSettings));
	public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sliced_bread"), SLICED_BREAD);
	}
}
