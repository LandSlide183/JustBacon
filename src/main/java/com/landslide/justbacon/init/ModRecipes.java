package com.landslide.justbacon.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
//contains code to add recipes to the game's registry
public class ModRecipes {
	
	public static void init() {
		//Adds the recipe for cooking bacon
		GameRegistry.addSmelting(ModItems.RAW_BACON, new ItemStack(ModItems.COOKED_BACON, 1), 0.1f);
	}
}
