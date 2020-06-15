package net.mcreator.hongkongdrinks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.hongkongdrinks.item.ItemVitaAppleGreenTea;
import net.mcreator.hongkongdrinks.entity.EntityVitaAppleGreenTeaEntity;
import net.mcreator.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureVitaAppleGreenTeaOnFoodRightClicked extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureVitaAppleGreenTeaOnFoodRightClicked(ElementsHongkongdrinksMod instance) {
		super(instance, 116);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VitaAppleGreenTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure VitaAppleGreenTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure VitaAppleGreenTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure VitaAppleGreenTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VitaAppleGreenTeaOnFoodRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity.isSneaking()) && (new ItemStack(ItemVitaAppleGreenTea.block, (int) (1))
				.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()))
				|| ((new ItemStack(ItemVitaAppleGreenTea.block, (int) (1))
						.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem())
						&& (new ItemStack(Blocks.AIR, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemVitaAppleGreenTea.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			if (((entity.getHorizontalFacing()) == EnumFacing.NORTH)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityVitaAppleGreenTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles((x + 0.5), (y + 1), (z - 0.5), world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityVitaAppleGreenTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles((x + 0.5), (y + 1), (z + 1.5), world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.EAST)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityVitaAppleGreenTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles((x + 1.5), (y + 1), (z + 0.5), world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.WEST)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityVitaAppleGreenTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles((x - 0.5), (y + 1), (z + 0.5), world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
