package com.syths.inversion.Init;

import com.syths.inversion.inversion;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTabs {
public static CreativeTabs tabInversion;
	
	public static void load(){
		tabInversion = new CreativeTabs("tabInversion"){
			@Override
			public Item getTabIconItem(){
				return inversion.WitherSoul;
			}
		};
	}
}
