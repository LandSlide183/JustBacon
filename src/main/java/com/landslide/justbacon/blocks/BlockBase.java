package com.landslide.justbacon.blocks;

import com.landslide.justbacon.Main;
import com.landslide.justbacon.init.ModBlocks;
import com.landslide.justbacon.init.ModItems;
import com.landslide.justbacon.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
//unused framework
public class BlockBase extends Block implements IHasModel {
	//constructor that takes a name, material that determines what the block will be broken with, and creative tab
	public BlockBase(String name, Material material, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		//adds the block to the block and item lists
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		//for registering models
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}
