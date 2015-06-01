package com.syths.inversion;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterBot {
	public static void registerBlock(Block block){
		GameRegistry.registerBlock(block, "inversion:" + block.getUnlocalizedName());
	}
	
	public static void registerItem(Item item){
		GameRegistry.registerItem(item, "inversion:" + item.getUnlocalizedName());
	}
}
