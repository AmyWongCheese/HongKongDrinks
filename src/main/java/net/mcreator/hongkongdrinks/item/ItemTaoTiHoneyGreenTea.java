
package net.mcreator.hongkongdrinks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.hongkongdrinks.procedure.ProcedureVitaLemonTeaFoodEaten;
import net.mcreator.hongkongdrinks.creativetab.TabHongKongDrinks;
import net.mcreator.hongkongdrinks.ElementsHongKongDrinks;

@ElementsHongKongDrinks.ModElement.Tag
public class ItemTaoTiHoneyGreenTea extends ElementsHongKongDrinks.ModElement {
	@GameRegistry.ObjectHolder("hongkongdrinks:taotihoneygreentea")
	public static final Item block = null;
	public ItemTaoTiHoneyGreenTea(ElementsHongKongDrinks instance) {
		super(instance, 98);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("hongkongdrinks:taotihoneygreentea", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0.3f, false);
			setUnlocalizedName("taotihoneygreentea");
			setRegistryName("taotihoneygreentea");
			setCreativeTab(TabHongKongDrinks.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureVitaLemonTeaFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
