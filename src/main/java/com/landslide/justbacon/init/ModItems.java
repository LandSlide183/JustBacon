package com.landslide.justbacon.init;

import java.util.ArrayList;
import java.util.List;

import com.landslide.justbacon.items.FoodBase;
import com.landslide.justbacon.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
//class to declare and initialize items for the mod
public class ModItems {
	//arraylist to track the added items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//foods
	public static final Item RAW_BACON = new FoodBase("raw_bacon", 1, 0.5F, true);
	public static final Item COOKED_BACON = new FoodBase("cooked_bacon", 2, 2.4F, false);
	
	
}
