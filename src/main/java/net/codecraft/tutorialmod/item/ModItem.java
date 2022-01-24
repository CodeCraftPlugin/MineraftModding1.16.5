package net.codecraft.tutorialmod.item;

import net.codecraft.tutorialmod.TutorialMod;
import net.codecraft.tutorialmod.item.advance.FireStone;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModItem {
    public  static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",()->new Item(
            new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP).maxStackSize(16)));
    public static final RegistryObject<Item> FIRE_STONE = ITEMS.register("firestone",()->new FireStone(
            new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP).maxDamage(12)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
