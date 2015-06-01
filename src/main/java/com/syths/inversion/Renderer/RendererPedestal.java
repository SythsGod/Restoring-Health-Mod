package com.syths.inversion.Renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.syths.inversion.inversion;
import com.syths.inversion.Models.ModelPedestal;

public class RendererPedestal extends TileEntitySpecialRenderer {

	private static final ResourceLocation texture = new ResourceLocation(inversion.MOD_ID, "textures/model/pedestal.png");
	private ModelPedestal model;
	
	public RendererPedestal(){
		this.model = new ModelPedestal();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 0.5F - 1/16F*6, (float)z + 0.5F);
		GL11.glRotatef(180, 0, 0, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		model.renderModel(0.0625F);
		GL11.glPopMatrix();		
		GL11.glPopMatrix();
	}	
}
