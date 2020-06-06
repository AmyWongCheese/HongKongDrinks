public static class Modelhungfooktonge extends ModelBase {
	private final ModelRenderer bone;

	public Modelhungfooktonge() {
		textureWidth = 20;
		textureHeight = 20;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -11.0F, -2.0F, 4, 11, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 16, -1.0F, -13.0F, -1.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}