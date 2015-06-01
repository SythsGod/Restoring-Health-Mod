package com.syths.inversion;

import java.util.Random;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerServer {
	@SubscribeEvent
	public void witherDrop(LivingDropsEvent event)
	{
		if (((event.entityLiving instanceof EntityWither)) && ((event.source.getSourceOfDamage() instanceof EntityPlayer)) && (event.entity.worldObj != null) && (event.entity.worldObj.getGameRules().getGameRuleBooleanValue("doMobLoot")) && (Math.random() < .05))
		{
			ItemStack d = new ItemStack(inversion.WitherSoul, 1);
			EntityItem f = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, d);
			f.delayBeforeCanPickup = 10;
			event.drops.add(f);	
		}
	}
}
