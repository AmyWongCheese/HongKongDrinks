
package net.mcreator.hongkongdrinks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hongkongdrinks.item.ItemVitaLemonTea;
import net.mcreator.hongkongdrinks.ElementsHongKongDrinks;

@ElementsHongKongDrinks.ModElement.Tag
public class TabHongKongDrinks extends ElementsHongKongDrinks.ModElement {
	public TabHongKongDrinks(ElementsHongKongDrinks instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabhongkongdrinks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemVitaLemonTea.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
