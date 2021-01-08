package net.mcreator.demonic.procedures;

import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonic.item.IronKnifeItem;
import net.mcreator.demonic.item.BloodBottleItem;
import net.mcreator.demonic.item.BloodBottle5Item;
import net.mcreator.demonic.item.BloodBottle4Item;
import net.mcreator.demonic.item.BloodBottle3Item;
import net.mcreator.demonic.item.BloodBottle2Item;
import net.mcreator.demonic.item.BloodBottle1Item;
import net.mcreator.demonic.DemonicModElements;

import java.util.Map;
import java.util.Collection;

@DemonicModElements.ModElement.Tag
public class IronKnifeRightClickedInAirProcedure extends DemonicModElements.ModElement {
	public IronKnifeRightClickedInAirProcedure(DemonicModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure IronKnifeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(BloodBottleItem.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(BloodBottleItem.block, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(BloodBottle1Item.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(BloodBottle1Item.block, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(BloodBottle2Item.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(BloodBottle2Item.block, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(BloodBottle3Item.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(BloodBottle3Item.block, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(BloodBottle4Item.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(BloodBottle4Item.block, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(BloodBottle5Item.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(BloodBottle5Item.block, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(IronKnifeItem.block, (int) (1)).getItem()) && (!((new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.MINING_FATIGUE)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) && (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == Effects.WEAKNESS)
									return true;
							}
						}
						return false;
					}
				}.check(entity)))))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("Bloody", ((entity.getPersistentData().getDouble("Bloody")) + 1));
		}
		if (((entity.getPersistentData().getDouble("Bloody")) > 12)) {
			if ((Math.random() < 0.5)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 600, (int) 1, (false), (true)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 600, (int) 1, (false), (true)));
			}
		}
		if (((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.MINING_FATIGUE)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) && (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.WEAKNESS)
							return true;
					}
				}
				return false;
			}
		}.check(entity)))) {
			entity.getPersistentData().putDouble("Bloody", 0);
		}
	}
}
