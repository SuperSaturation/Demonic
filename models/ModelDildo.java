// Made with Blockbench 3.6.6

public static class ModelDildo extends AnimatedEntityModel {

	private final AnimatedModelRenderer bone;

	public ModelDildo() {
		textureWidth = 16;
		textureHeight = 16;
		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0F, 22.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-8.0F, 0.0F, -2.0F, 16.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -13.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		this.rootBones.add(bone);
	}

	@Override
	public ResourceLocation getAnimationFileLocation() {
		return new ResourceLocation("MODID", "animations/ANIMATIONFILE.json");
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}