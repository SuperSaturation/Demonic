
package net.mcreator.demonic.item;

@DemonicModElements.ModElement.Tag
public class BloodBottle2Item extends DemonicModElements.ModElement {

	@ObjectHolder("demonic:blood_bottle_2")
	public static final Item block = null;

	public BloodBottle2Item(DemonicModElements instance) {
		super(instance, 14);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("blood_bottle_2");
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
