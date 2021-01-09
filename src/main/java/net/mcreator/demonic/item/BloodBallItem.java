
package net.mcreator.demonic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.demonic.itemgroup.DemonicBlocksItemGroup;
import net.mcreator.demonic.DemonicModElements;

@DemonicModElements.ModElement.Tag
public class BloodBallItem extends DemonicModElements.ModElement {
	@ObjectHolder("demonic:blood_ball")
	public static final Item block = null;
	public BloodBallItem(DemonicModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(DemonicBlocksItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("blood_ball");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
