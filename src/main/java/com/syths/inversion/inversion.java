package com.syths.inversion;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.syths.inversion.Blocks.BlockModBlocks;
import com.syths.inversion.Blocks.BlockPedestal;
import com.syths.inversion.Init.ModTabs;
import com.syths.inversion.Items.ItemBedrockiumApple;
import com.syths.inversion.Items.ItemWitherSoul;
import com.syths.inversion.Renderer.RendererPedestal;
import com.syths.inversion.TileEntity.TileEntityPedestal;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = inversion.MOD_ID, name = inversion.MOD_NAME, version = inversion.VERSION, dependencies = inversion.DEPENDS)
public class inversion {
	public static final String MOD_ID = "inversion";
	public static final String MOD_NAME = "Inversion";
	public static final String VERSION = "0.0.1";
	public static final String DEPENDS = "required-after:ExtraUtilities;";
	
	public static Item WitherSoul;
	public static Item BedrockiumApple;
	public static Block blockPedestal;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModTabs.load();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		WitherSoul = new ItemWitherSoul();
		BedrockiumApple = new ItemBedrockiumApple(10, 10, false);
		RegisterBot.registerItem(WitherSoul);
		RegisterBot.registerItem(BedrockiumApple);
		
		blockPedestal = new BlockPedestal().setBlockName("Pedestal");
		RegisterBot.registerBlock(blockPedestal);		
		
        GameRegistry.registerTileEntity(TileEntityPedestal.class, "Pedestal");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPedestal.class, new RendererPedestal());
		
		MinecraftForge.EVENT_BUS.register(new EventHandlerServer());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		if(Loader.isModLoaded("ExtraUtilities")){
			// ItemModItems.fetchItems();
			BlockModBlocks.fetchBlocks();
			Recipes.registerModRecipes();
		}else{
			// Do something about this being empty  ?! !IMPORTANT
		}
	}
}
