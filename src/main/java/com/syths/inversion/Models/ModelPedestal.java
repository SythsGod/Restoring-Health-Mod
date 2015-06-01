package com.syths.inversion.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPedestal extends ModelBase {
	//fields
    ModelRenderer base;
    ModelRenderer pillar;
    ModelRenderer table;
    ModelRenderer tabletablet;
  
  public ModelPedestal()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      base = new ModelRenderer(this, 0, 49);
      base.addBox(-6F, 0F, -6F, 12, 2, 12);
      base.setRotationPoint(0F, 0F, 0F);
      base.setTextureSize(64, 64);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      pillar = new ModelRenderer(this, 0, 35);
      pillar.addBox(-3F, -3.5F, -3F, 6, 7, 6);
      pillar.setRotationPoint(0F, -3.5F, 0F);
      pillar.setTextureSize(64, 64);
      pillar.mirror = true;
      setRotation(pillar, 0F, 0F, 0F);
      table = new ModelRenderer(this, 0, 22);
      table.addBox(-5F, 0F, -5F, 10, 2, 10);
      table.setRotationPoint(0F, -9F, 0F);
      table.setTextureSize(64, 64);
      table.mirror = true;
      setRotation(table, 0F, 0F, 0F);
      tabletablet = new ModelRenderer(this, 0, 11);
      tabletablet.addBox(-4.5F, 0F, -4.5F, 9, 1, 9);
      tabletablet.setRotationPoint(0F, -9.2F, 0F);
      tabletablet.setTextureSize(64, 64);
      tabletablet.mirror = true;
      setRotation(tabletablet, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    pillar.render(f5);
    table.render(f5);
    tabletablet.render(f5);
  }
  
  public void renderModel(float f){
	base.render(f);
	pillar.render(f);
	table.render(f);
	tabletablet.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}
