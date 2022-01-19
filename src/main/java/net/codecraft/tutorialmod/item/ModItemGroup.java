package net.codecraft.tutorialmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup TUTORIAL_GROUP = new ItemGroup("tutorialModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItem.STEEL_INGOT.get());
        }
    };
}
