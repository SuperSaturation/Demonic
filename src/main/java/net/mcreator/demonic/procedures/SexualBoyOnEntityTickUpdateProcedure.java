package net.mcreator.demonic.procedures;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.entity.Entity;

import net.mcreator.demonic.DemonicModElements;

import java.util.Map;

@DemonicModElements.ModElement.Tag
public class SexualBoyOnEntityTickUpdateProcedure extends DemonicModElements.ModElement {
	public SexualBoyOnEntityTickUpdateProcedure(DemonicModElements instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SexualBoyOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		while (((((entity.getMotion().getX()) < 0.3) && ((entity.getMotion().getY()) < 0.3)) && ((entity.getMotion().getZ()) < 0.3))) {
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
