package com.landslide.justbacon.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
//proxy class for the handling of the connection of textures to items
public class ClientProxy extends CommonProxy {
	//this static method is called by instances of ItemBase when their registerModels method is called (by RegistryHandler)
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
