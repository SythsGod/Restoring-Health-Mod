package com.syths.inversion;

import com.syths.inversion.Blocks.BlockModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scala.Char;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void registerModRecipes(){
		GameRegistry.addRecipe(new ItemStack(inversion.BedrockiumApple, 1), "XXX", "XYX", "XXX", 'X', BlockModBlocks.BlockBedrockium, 'Y', new ItemStack(Items.golden_apple, 1, 1));
	}
}
