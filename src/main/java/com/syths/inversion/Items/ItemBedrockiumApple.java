package com.syths.inversion.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.syths.inversion.Init.ModTabs;


public class ItemBedrockiumApple extends ItemFood {
	public ItemBedrockiumApple(int p_i45341_1_, float p_i455341_2_, boolean p_i45341_3_) {
		super(p_i45341_1_, p_i455341_2_, p_i45341_3_);
		this.setHasSubtypes(false);	
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
		this.setCreativeTab(ModTabs.tabInversion);
		this.setUnlocalizedName("inversion:bedrockiumapple");
		this.setTextureName("minecraft:apple");
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool){
		list.add("Eating this will negate all damage for a minute, but beware, bedrock is heavy.");
	}
	
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_){
		if (!p_77849_2_.isRemote)
        {
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1200, 5));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 11));
        }
	}
}
