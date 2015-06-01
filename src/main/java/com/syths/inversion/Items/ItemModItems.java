package com.syths.inversion.Items;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemModItems {	
	public static void fetchItems(){
		
	}	
	
	public static ItemStack fetchStack(String modId, String item){
		return GameRegistry.findItemStack(modId, item, 1);
	}
	
	public static ItemStack fetchStack(String modId, String name, int damage){
		ItemStack stack = GameRegistry.findItemStack(modId, name, 1);
		if(stack != null) stack.setItemDamage(damage);
		return stack;
	}
	
	public static ItemStack fetchOreDict(String dict){
		ArrayList<ItemStack> stacks = OreDictionary.getOres(dict);
		if (stacks.size() > 1){
			return stacks.get(0);
		}
		
		return null;
	}
	
	public static ItemStack pullStack(String className, String field){
		try{
			Class c = Class.forName(className);
			Object f = c.getField(field).get(null);
			
			if(f instanceof ItemStack)
				return (ItemStack) f;
			if(f instanceof Item)
				return new ItemStack(((Item)f), 1, 0);
			return null;
		}
		catch (Exception ex){
			return null;
		}
	}
}
