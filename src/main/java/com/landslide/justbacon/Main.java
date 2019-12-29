package com.landslide.justbacon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.landslide.justbacon.init.ModRecipes;
import com.landslide.justbacon.proxy.CommonProxy;
import com.landslide.justbacon.util.Reference;


//This is the class that kicks off the whole thing
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	//I don't know what the majority of these things do
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {

	}
	
	//but I know this one initializes the recipes defined in ModRecipes
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}
}
