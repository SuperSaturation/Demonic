// Made with Blockbench 3.6.6

public static class Modelanimated_entity_model extends AnimatedEntityModel {

	private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer LLeg;
	private final AnimatedModelRenderer ULLeg;
	private final AnimatedModelRenderer LLLeg;
	private final AnimatedModelRenderer Torso;
	private final AnimatedModelRenderer RArm;
	private final AnimatedModelRenderer LRArm;
	private final AnimatedModelRenderer Trident;
	private final AnimatedModelRenderer URArm;
	private final AnimatedModelRenderer LArm;
	private final AnimatedModelRenderer ULArm;
	private final AnimatedModelRenderer LLArm;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer LowerHead;
	private final AnimatedModelRenderer RLeg;
	private final AnimatedModelRenderer URLeg;
	private final AnimatedModelRenderer LRLeg;

	public Modelanimated_entity_model() {
		textureWidth = 128;
		textureHeight = 128;
		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0625F, 24.5F, 1.0F);

		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		LLeg = new AnimatedModelRenderer(this);
		LLeg.setRotationPoint(2.9375F, -18.5F, 0.0F);
		bone.addChild(LLeg);

		LLeg.setModelRendererName("LLeg");
		this.registerModelRenderer(LLeg);

		ULLeg = new AnimatedModelRenderer(this);
		ULLeg.setRotationPoint(0.0625F, 0.5F, 0.0F);
		LLeg.addChild(ULLeg);
		ULLeg.setTextureOffset(61, 86).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		ULLeg.setModelRendererName("ULLeg");
		this.registerModelRenderer(ULLeg);

		LLLeg = new AnimatedModelRenderer(this);
		LLLeg.setRotationPoint(0.0625F, 8.5F, 0.0F);
		LLeg.addChild(LLLeg);
		LLLeg.setTextureOffset(14, 83).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		LLLeg.setModelRendererName("LLLeg");
		this.registerModelRenderer(LLLeg);

		Torso = new AnimatedModelRenderer(this);
		Torso.setRotationPoint(-0.0048F, -29.9808F, 0.0962F);
		bone.addChild(Torso);
		Torso.setTextureOffset(0, 0).addBox(-5.9952F, 8.4808F, -3.0962F, 12.0F, 3.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-1.4952F, -7.5192F, 0.9038F, 3.0F, 16.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.4952F, 1.9808F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-6.4952F, 1.9808F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.4952F, -1.0192F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-6.4952F, -1.0192F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.4952F, -1.0192F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.4952F, 1.9808F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(2.5048F, 1.9808F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(4.5048F, 1.9808F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(1.5048F, 1.9808F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(4.5048F, -1.0192F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(2.5048F, -1.0192F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(1.5048F, -1.0192F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(2.4423F, -4.0192F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(4.4423F, -4.0192F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(1.5048F, -4.0192F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.4952F, -4.0192F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.5577F, -4.0192F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-6.4952F, -4.0192F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-6.4952F, -7.0192F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.4952F, -7.0192F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(-4.4952F, -7.0192F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(2.5673F, -7.0192F, -3.5337F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(4.5048F, -7.0192F, -3.0962F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Torso.setTextureOffset(15, 50).addBox(1.5048F, -7.0192F, 1.4038F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Torso.setModelRendererName("Torso");
		this.registerModelRenderer(Torso);

		RArm = new AnimatedModelRenderer(this);
		RArm.setRotationPoint(-6.0577F, -5.5192F, -0.0962F);
		Torso.addChild(RArm);

		RArm.setModelRendererName("RArm");
		this.registerModelRenderer(RArm);

		LRArm = new AnimatedModelRenderer(this);
		LRArm.setRotationPoint(-1.4375F, 7.5F, 0.0F);
		RArm.addChild(LRArm);
		LRArm.setTextureOffset(0, 116).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		LRArm.setModelRendererName("LRArm");
		this.registerModelRenderer(LRArm);

		Trident = new AnimatedModelRenderer(this);
		Trident.setRotationPoint(0.0234F, 8.0F, 0.1F);
		LRArm.addChild(Trident);
		setRotationAngle(Trident, 0.0F, 0.0F, 1.5708F);
		Trident.setTextureOffset(114, 86).addBox(2.5156F, -0.5F, -14.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Trident.setTextureOffset(114, 97).addBox(-0.4844F, -0.5F, -14.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Trident.setTextureOffset(114, 105).addBox(-3.4844F, -0.5F, -14.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Trident.setTextureOffset(116, 74).addBox(-2.5234F, -0.5F, -8.6F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Trident.setTextureOffset(84, 106).addBox(-0.5234F, -0.5F, -7.6F, 1.0F, 1.0F, 21.0F, 0.0F, false);
		Trident.setModelRendererName("Trident");
		this.registerModelRenderer(Trident);

		URArm = new AnimatedModelRenderer(this);
		URArm.setRotationPoint(-0.4375F, -0.5F, 0.0F);
		RArm.addChild(URArm);
		URArm.setTextureOffset(24, 116).addBox(-2.5F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		URArm.setModelRendererName("URArm");
		this.registerModelRenderer(URArm);

		LArm = new AnimatedModelRenderer(this);
		LArm.setRotationPoint(5.9423F, -5.5192F, -0.0962F);
		Torso.addChild(LArm);

		LArm.setModelRendererName("LArm");
		this.registerModelRenderer(LArm);

		ULArm = new AnimatedModelRenderer(this);
		ULArm.setRotationPoint(0.5625F, -0.5F, 0.0F);
		LArm.addChild(ULArm);
		ULArm.setTextureOffset(55, 116).addBox(-0.5F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		ULArm.setModelRendererName("ULArm");
		this.registerModelRenderer(ULArm);

		LLArm = new AnimatedModelRenderer(this);
		LLArm.setRotationPoint(1.5625F, 7.5F, 0.0F);
		LArm.addChild(LLArm);
		LLArm.setTextureOffset(70, 116).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		LLArm.setModelRendererName("LLArm");
		this.registerModelRenderer(LLArm);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(-0.0041F, -7.1621F, 0.0467F);
		Torso.addChild(Head);
		Head.setTextureOffset(56, 21).addBox(-3.9911F, -7.8571F, -4.1429F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(43, 35).addBox(-3.9911F, -1.8571F, -0.1429F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(0, 26).addBox(4.0089F, -10.8571F, -1.1429F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 26).addBox(3.0089F, -11.8571F, -1.1429F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 26).addBox(-3.9911F, -11.8571F, -1.1429F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 26).addBox(-4.9911F, -10.8571F, -1.1429F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		LowerHead = new AnimatedModelRenderer(this);
		LowerHead.setRotationPoint(-0.0379F, -1.2143F, 1.8571F);
		Head.addChild(LowerHead);
		LowerHead.setTextureOffset(0, 12).addBox(-3.9531F, 0.3571F, -6.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		LowerHead.setTextureOffset(124, 43).addBox(-3.5078F, -0.6429F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LowerHead.setTextureOffset(124, 43).addBox(-1.5078F, -0.6429F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LowerHead.setTextureOffset(124, 43).addBox(0.4922F, -0.6429F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LowerHead.setTextureOffset(124, 43).addBox(2.4922F, -0.6429F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LowerHead.setTextureOffset(124, 43).addBox(2.4922F, -0.6429F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LowerHead.setTextureOffset(124, 43).addBox(-3.5078F, -0.6429F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LowerHead.setModelRendererName("LowerHead");
		this.registerModelRenderer(LowerHead);

		RLeg = new AnimatedModelRenderer(this);
		RLeg.setRotationPoint(-3.0625F, -18.5F, 0.0F);
		bone.addChild(RLeg);

		RLeg.setModelRendererName("RLeg");
		this.registerModelRenderer(RLeg);

		URLeg = new AnimatedModelRenderer(this);
		URLeg.setRotationPoint(0.0625F, -0.5F, 0.0F);
		RLeg.addChild(URLeg);
		URLeg.setTextureOffset(41, 89).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		URLeg.setModelRendererName("URLeg");
		this.registerModelRenderer(URLeg);

		LRLeg = new AnimatedModelRenderer(this);
		LRLeg.setRotationPoint(0.0625F, 8.5F, 0.0F);
		RLeg.addChild(LRLeg);
		LRLeg.setTextureOffset(98, 88).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		LRLeg.setModelRendererName("LRLeg");
		this.registerModelRenderer(LRLeg);

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