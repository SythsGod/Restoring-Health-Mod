package com.syths.inversion.Items;

import com.syths.inversion.Init.ModTabs;

import net.minecraft.item.Item;

public class ItemWitherSoul extends Item {
	public ItemWitherSoul() {
		setMaxStackSize(1);
		setCreativeTab(ModTabs.tabInversion);
		setUnlocalizedName("inversion:withersoul");
		setTextureName("minecraft:diamond");
	}
}
