package com.landslide.justbacon.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.RAW_BACON, new ItemStack(ModItems.COOKED_BACON, 1), 0.1f);
	}
}
