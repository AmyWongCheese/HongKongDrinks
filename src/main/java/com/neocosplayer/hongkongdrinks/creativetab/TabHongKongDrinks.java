
package com.neocosplayer.hongkongdrinks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import com.neocosplayer.hongkongdrinks.item.ItemVitaLemonTea;
import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class TabHongKongDrinks extends ElementsHongkongdrinksMod.ModElement {
	public TabHongKongDrinks(ElementsHongkongdrinksMod instance) {
		super(instance, 57);
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
