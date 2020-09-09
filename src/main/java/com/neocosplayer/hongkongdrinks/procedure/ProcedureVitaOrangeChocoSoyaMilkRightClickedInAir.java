package com.neocosplayer.hongkongdrinks.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import com.neocosplayer.hongkongdrinks.item.ItemVitaOrangeChocoSoyaMilk;
import com.neocosplayer.hongkongdrinks.entity.EntityVitaOrangeChocoSoyaMilkEntity;
import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureVitaOrangeChocoSoyaMilkRightClickedInAir extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureVitaOrangeChocoSoyaMilkRightClickedInAir(ElementsHongkongdrinksMod instance) {
		super(instance, 253);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		Entity entityToSpawn = new EntityVitaOrangeChocoSoyaMilkEntity.EntityCustom(world);
		
		if ((((entity.isSneaking()) && (new ItemStack(ItemVitaOrangeChocoSoyaMilk.block, (int) (1))
				.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()))
				|| ((new ItemStack(ItemVitaOrangeChocoSoyaMilk.block, (int) (1))
						.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem())
						&& (new ItemStack(Blocks.AIR, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemVitaOrangeChocoSoyaMilk.block, (int) (1)).getItem(), -1,
						(int) 1, null);

			DrinkPlaced.place(entity, world, entityToSpawn);
		}
	}
}
