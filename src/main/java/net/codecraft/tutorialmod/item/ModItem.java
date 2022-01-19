package net.codecraft.tutorialmod.item;

import net.codecraft.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class ModItem {
    public  static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",()->new Item(
            new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
