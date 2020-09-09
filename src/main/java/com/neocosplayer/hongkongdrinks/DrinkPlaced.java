package com.neocosplayer.hongkongdrinks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class DrinkPlaced extends ElementsHongkongdrinksMod.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public DrinkPlaced(ElementsHongkongdrinksMod instance) {
		super(instance, 226);
	}

		public static void place(Entity entity, World world, Entity entityToSpawn) {
			float x = (float) entity.posX;
			float y = (float) entity.posY;
			float z = (float) entity.posZ;
			float a = x - (int) x;
			float b = z - (int) z;

			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			
			if (((entity.getHorizontalFacing()) == EnumFacing.NORTH)) {
				if (!world.isRemote) {
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getX()) + a + 1),
								(y + 1),
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getZ()) - b),
								world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH) || ((entity.getHorizontalFacing()) == EnumFacing.WEST)) {
				if (!world.isRemote) {
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getX()) + a + 1),
								(y + 1),
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getZ()) + b + 1),
								world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.EAST)) {
				if (!world.isRemote) {
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getX()) - a),
								(y + 1),
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getZ()) + b + 1),
								world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} 
		}


}
