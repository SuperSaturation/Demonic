package net.mcreator.demonic.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonic.item.BookItem;
import net.mcreator.demonic.item.Book1Item;
import net.mcreator.demonic.DemonicModElements;

import java.util.Map;

@DemonicModElements.ModElement.Tag
public class BookRightClickedInAirProcedure extends DemonicModElements.ModElement {
	public BookRightClickedInAirProcedure(DemonicModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BookRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(BookItem.block, (int) (1)).getItem()) && (entity.isSneaking()))) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(Book1Item.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
