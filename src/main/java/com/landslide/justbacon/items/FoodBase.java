package com.landslide.justbacon.items;

import com.landslide.justbacon.Main;
import com.landslide.justbacon.init.ModItems;
import com.landslide.justbacon.util.IHasModel;

import net.minecraft.item.ItemFood;
//framework for the foods added in justbacon and extends the vanilla food class for functionality
public class FoodBase extends ItemFood implements IHasModel {
	//similar constructor to ItemBase, just includes the food specific values
	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		//for registering models
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
