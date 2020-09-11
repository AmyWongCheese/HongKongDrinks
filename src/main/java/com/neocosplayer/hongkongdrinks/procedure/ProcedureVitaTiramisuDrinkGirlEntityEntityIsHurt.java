package com.neocosplayer.hongkongdrinks.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;

import com.neocosplayer.hongkongdrinks.item.ItemVitaTiramisuDrinkGirl;
import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureVitaTiramisuDrinkGirlEntityEntityIsHurt extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureVitaTiramisuDrinkGirlEntityEntityIsHurt(ElementsHongkongdrinksMod instance) {
		super(instance, 284);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VitaTiramisuDrinkGirlEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure VitaTiramisuDrinkGirlEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure VitaTiramisuDrinkGirlEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure VitaTiramisuDrinkGirlEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VitaTiramisuDrinkGirlEntityEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.world.removeEntity(entity);
		if ((!((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemVitaTiramisuDrinkGirl.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
