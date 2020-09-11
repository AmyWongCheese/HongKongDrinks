package com.neocosplayer.hongkongdrinks.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

import com.neocosplayer.hongkongdrinks.item.ItemYeungGwongLemonTea;
import com.neocosplayer.hongkongdrinks.item.ItemYGPineappleJuice;
import com.neocosplayer.hongkongdrinks.item.ItemYGMelonMilk;
import com.neocosplayer.hongkongdrinks.item.ItemYGMangoJuice;
import com.neocosplayer.hongkongdrinks.item.ItemYGAppleJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaSugarcaneJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaMangoJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaMaltSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaLemonTea;
import com.neocosplayer.hongkongdrinks.item.ItemVitaChrysanthemumTea;
import com.neocosplayer.hongkongdrinks.item.ItemVitaChocolateMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaBlackcurrantJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaAppleGreenTea;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiMandarinLemon;
import com.neocosplayer.hongkongdrinks.item.ItemHealthworksRockSugarWithPearDrink;
import com.neocosplayer.hongkongdrinks.item.ItemHealthworksHawhornAppleDrink;
import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureVendingMachineOnBlockRightClicked extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureVendingMachineOnBlockRightClicked(ElementsHongkongdrinksMod instance) {
		super(instance, 292);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VendingMachineOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure VendingMachineOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure VendingMachineOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure VendingMachineOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VendingMachineOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z))).equals(new ResourceLocation("forest")))) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaAppleGreenTea.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemYGAppleJuice.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemHealthworksHawhornAppleDrink.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemHealthworksRockSugarWithPearDrink.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (13))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (15))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (17))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else if ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("jungle")))) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemTaoTiMandarinLemon.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaMangoJuice.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemYGMangoJuice.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaSugarcaneJuice.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemYGPineappleJuice.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemYGMelonMilk.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (13))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (15))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.POTIONITEM, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (17))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaLemonTea.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaSoyaMilk.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaMaltSoyaMilk.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaChocolateMilk.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemYeungGwongLemonTea.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaChrysanthemumTea.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemTaoTiMandarinLemon.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (13))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaBlackcurrantJuice.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (15))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemVitaMangoJuice.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (17))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
