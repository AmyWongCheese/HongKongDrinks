package net.mcreator.hongkongdrinks.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;

import net.mcreator.hongkongdrinks.item.ItemYGOrangeJuice;
import net.mcreator.hongkongdrinks.ElementsHongKongDrinks;

@ElementsHongKongDrinks.ModElement.Tag
public class ProcedureYGOrangeJuiceEntityEntityIsHurt extends ElementsHongKongDrinks.ModElement {
	public ProcedureYGOrangeJuiceEntityEntityIsHurt(ElementsHongKongDrinks instance) {
		super(instance, 147);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure YGOrangeJuiceEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure YGOrangeJuiceEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure YGOrangeJuiceEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure YGOrangeJuiceEntityEntityIsHurt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure YGOrangeJuiceEntityEntityIsHurt!");
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
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemYGOrangeJuice.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
