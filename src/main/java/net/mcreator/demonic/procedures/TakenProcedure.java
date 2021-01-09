package net.mcreator.demonic.procedures;

import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonic.DemonicModElements;

import java.util.function.Supplier;
import java.util.Map;

@DemonicModElements.ModElement.Tag
public class TakenProcedure extends DemonicModElements.ModElement {
	public TakenProcedure(DemonicModElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Taken!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (64));
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
