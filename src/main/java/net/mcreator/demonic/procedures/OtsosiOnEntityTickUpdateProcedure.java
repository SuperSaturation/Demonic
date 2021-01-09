package net.mcreator.demonic.procedures;

import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.animation.builder.AnimationBuilder;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.entity.Entity;

import net.mcreator.demonic.DemonicModElements;

import java.util.Map;

@DemonicModElements.ModElement.Tag
public class OtsosiOnEntityTickUpdateProcedure extends DemonicModElements.ModElement {
	public OtsosiOnEntityTickUpdateProcedure(DemonicModElements instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure OtsosiOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getMotion().getX()) <= 1) && ((entity.getMotion().getY()) <= 1)) && ((entity.getMotion().getZ()) <= 1))) {
			if (entity instanceof IAnimatedEntity) {
				new Object() {
					@OnlyIn(Dist.CLIENT)
					void playAnimation(Entity entity, String animationID) {
						IAnimatedEntity aniEntity = (IAnimatedEntity) entity;
						aniEntity.getAnimationManager().get("controller").setAnimation(new AnimationBuilder().addAnimation(animationID, (false)));
					}
				}.playAnimation(entity, "animation.model.idle");
			}
		}
	}
}
