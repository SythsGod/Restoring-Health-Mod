package com.syths.inversion.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.syths.inversion.inversion;
import com.syths.inversion.Init.ModTabs;
import com.syths.inversion.TileEntity.TileEntityPedestal;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPedestal extends BlockContainer {

	public BlockPedestal() {
		super(Material.rock);

		this.setBlockBounds(1 / 16F * 2, 0F, 1 / 16F * 2, 1F - 1 / 16F * 2,
				1F - 1 / 16F * 5, 1F - 1 / 16F * 2);
		this.setCreativeTab(ModTabs.tabInversion);
		this.setBlockTextureName(inversion.MOD_ID + ":" + "BlockPedestal");
	}

	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityPedestal();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

//	@SideOnly(Side.CLIENT)
//	public void registerIcons(IIconRegister icon) {
//		this.blockIcon = icon.registerIcon("BlockTrashcan.png");
//	}
}
