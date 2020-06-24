package com.neocosplayer.hongkongdrinks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import com.neocosplayer.hongkongdrinks.item.ItemVitaChocolateMilk;
import com.neocosplayer.hongkongdrinks.entity.EntityVitaChocoMilkEntity;
import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;
import com.neocosplayer.hongkongdrinks.procedure.DrinkPlaced;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureVitaChocolateMilkOnFoodRightClicked extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureVitaChocolateMilkOnFoodRightClicked(ElementsHongkongdrinksMod instance) {
		super(instance, 54);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VitaChocolateMilkOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure VitaChocolateMilkOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure VitaChocolateMilkOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure VitaChocolateMilkOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VitaChocolateMilkOnFoodRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		Entity entityToSpawn = new EntityVitaChocoMilkEntity.EntityCustom(world);
		
		if ((((entity.isSneaking()) && (new ItemStack(ItemVitaChocolateMilk.block, (int) (1))
				.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()))
				|| ((new ItemStack(ItemVitaChocolateMilk.block, (int) (1))
						.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem())
						&& (new ItemStack(Blocks.AIR, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemVitaChocolateMilk.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);

		DrinkPlaced.placed(entity, world, entityToSpawn);
					
		}
	}
}
