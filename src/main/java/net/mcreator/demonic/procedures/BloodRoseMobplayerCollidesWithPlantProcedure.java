package net.mcreator.demonic.procedures;

@DemonicModElements.ModElement.Tag
public class BloodRoseMobplayerCollidesWithPlantProcedure extends DemonicModElements.ModElement {

	public BloodRoseMobplayerCollidesWithPlantProcedure(DemonicModElements instance) {
		super(instance, 32);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BloodRoseMobplayerCollidesWithPlant!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);

	}

}
