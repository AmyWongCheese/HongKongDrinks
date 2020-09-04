public static class ModelVitaLemonTea extends ModelBase {
	private final ModelRenderer vitalemon;

	public ModelVitaLemonTea() {
		textureWidth = 16;
		textureHeight = 16;

		vitalemon = new ModelRenderer(this);
		vitalemon.setRotationPoint(-8.0F, 16.0F, 8.0F);
		vitalemon.cubeList.add(new ModelBox(vitalemon, 0, 0, 6.0F, 2.0F, -9.0F, 4, 6, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vitalemon.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}