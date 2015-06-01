package com.syths.inversion.Blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockModBlocks {
	public static Block BlockBedrockium;
	
	public static void fetchBlocks(){
		BlockBedrockium = fetchBlock("ExtraUtilities", "block_bedrockium");
	}
	
	public static Block fetchBlock(String modId, String block){		
		return GameRegistry.findBlock(modId, block);
	}
}
