package com.landslide.justbacon.items;

import com.landslide.justbacon.Main;
import com.landslide.justbacon.init.ModItems;
import com.landslide.justbacon.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
//a class to represent the modded items
public class ItemBase extends Item implements IHasModel{
	
	//constructor that takes a name for the item and a creative tab
	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		//for rendering models
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
