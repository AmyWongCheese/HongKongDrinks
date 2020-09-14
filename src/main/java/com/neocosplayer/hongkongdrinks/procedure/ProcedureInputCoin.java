package com.neocosplayer.hongkongdrinks.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

import com.neocosplayer.hongkongdrinks.item.ItemYeungGwongLemonTea;
import com.neocosplayer.hongkongdrinks.item.ItemYGSugarcaneJuice;
import com.neocosplayer.hongkongdrinks.item.ItemYGPineappleJuice;
import com.neocosplayer.hongkongdrinks.item.ItemYGPeachTea;
import com.neocosplayer.hongkongdrinks.item.ItemYGMelonMilk;
import com.neocosplayer.hongkongdrinks.item.ItemYGMangoJuice;
import com.neocosplayer.hongkongdrinks.item.ItemYGMandarinTea;
import com.neocosplayer.hongkongdrinks.item.ItemYGCoconutMilk;
import com.neocosplayer.hongkongdrinks.item.ItemYGChrysanthemumTea;
import com.neocosplayer.hongkongdrinks.item.ItemYGAppleJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitasoyGOBananaPancakeDrink;
import com.neocosplayer.hongkongdrinks.item.ItemVitaVanillaSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaTiramisuDrinkGirl;
import com.neocosplayer.hongkongdrinks.item.ItemVitaTiramisuDrinkBoy;
import com.neocosplayer.hongkongdrinks.item.ItemVitaSweetPotatoSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaSugarcaneJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaStrawberrySoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaRedBeanSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaOrangeChocoSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaMintChocoSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaMangoJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaMaltSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaLycheeLoveTea;
import com.neocosplayer.hongkongdrinks.item.ItemVitaLemonTea;
import com.neocosplayer.hongkongdrinks.item.ItemVitaImperataeCaneDrink;
import com.neocosplayer.hongkongdrinks.item.ItemVitaIcyGrapefruit;
import com.neocosplayer.hongkongdrinks.item.ItemVitaHoneyLimeDrink;
import com.neocosplayer.hongkongdrinks.item.ItemVitaGuavaJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaGingerSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaCookiesCreamSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaCoconutSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaChrysanthemumTea;
import com.neocosplayer.hongkongdrinks.item.ItemVitaChocolateMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaChocoSoyaMilk;
import com.neocosplayer.hongkongdrinks.item.ItemVitaChinesePearTea;
import com.neocosplayer.hongkongdrinks.item.ItemVitaBlackcurrantJuice;
import com.neocosplayer.hongkongdrinks.item.ItemVitaAppleMangoTea;
import com.neocosplayer.hongkongdrinks.item.ItemVitaAppleGreenTea;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiWhiteTea;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiOolongTea;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiMetaTea;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiMetaGreenTea;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiMandarinLemon;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiHoneyGreenTea;
import com.neocosplayer.hongkongdrinks.item.ItemTaoTiGrapeJuice;
import com.neocosplayer.hongkongdrinks.item.ItemHealthworksRockSugarWithPearDrink;
import com.neocosplayer.hongkongdrinks.item.ItemHealthworksHawhornAppleDrink;
import com.neocosplayer.hongkongdrinks.item.ItemHFTSaltedMandarin;
import com.neocosplayer.hongkongdrinks.item.ItemHFTPassionFruit;
import com.neocosplayer.hongkongdrinks.item.ItemHFTMandarinAloe;
import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureInputCoin extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureInputCoin(ElementsHongkongdrinksMod instance) {
		super(instance, 290);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure InputCoin!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure InputCoin!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure InputCoin!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure InputCoin!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure InputCoin!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0))) == 1) && (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (2))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (4))) == 0))) && ((((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (6))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (8))) == 0)) && (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (10))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (12))) == 0)))) && ((((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (14))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (16))) == 0)) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (18))) == 0)))) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
						_current.detectAndSendChanges();
					}
				}
			}
			if ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z))).equals(new ResourceLocation("beaches")))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGCoconutMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGCoconutMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGCoconutMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGCoconutMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGCoconutMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaCoconutSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaCoconutSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaCoconutSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaCoconutSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("ice_flats")))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("ice_mountains"))))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
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
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaIcyGrapefruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if ((((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("forest")))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("forest_hills"))))
					|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("birch_forest")))
							|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("birch_forest_hills")))))
					|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("roofed_forest")))
							|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("mutated_roofed_forest"))))
							|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("mutated_birch_forest_hills")))
									|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
											.equals(new ResourceLocation("mutated_birch_forest"))))))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("mutated_forest"))))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaAppleGreenTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaAppleMangoTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaChinesePearTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaLycheeLoveTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaLycheeLoveTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("swampland")))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("mutated_swampland"))))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaMintChocoSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaTiramisuDrinkBoy.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaTiramisuDrinkBoy.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaTiramisuDrinkBoy.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaTiramisuDrinkGirl.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaTiramisuDrinkGirl.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaTiramisuDrinkGirl.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemTaoTiGrapeJuice.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemTaoTiGrapeJuice.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("plains")))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("mutated_plains"))))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaCookiesCreamSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitasoyGOBananaPancakeDrink.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaStrawberrySoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemTaoTiHoneyGreenTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaHoneyLimeDrink.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGChrysanthemumTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("jungle")))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("mutated_jungle"))))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaMangoJuice.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaGuavaJuice.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaRedBeanSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGMandarinTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGPeachTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("jungle_hills")))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaLemonTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaImperataeCaneDrink.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemYGSugarcaneJuice.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemTaoTiOolongTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemTaoTiMetaTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemTaoTiMetaGreenTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemTaoTiWhiteTea.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("jungle_edge")))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("mutated_jungle_edge"))))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTPassionFruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTPassionFruit.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTSaltedMandarin.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTSaltedMandarin.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaChocoSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaVanillaSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaSweetPotatoSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaOrangeChocoSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemVitaGingerSoyaMilk.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("desert")))
					|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("desert_hills"))))
					|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("savanna")))
							|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("savanna_rock")))))
					|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("mutated_desert")))
							|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("mutated_savanna"))))
							|| (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("mutated_savanna_rock")))))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHFTMandarinAloe.block, (int) (1));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
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
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
