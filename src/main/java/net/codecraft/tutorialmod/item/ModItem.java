package net.codecraft.tutorialmod.item;

import net.codecraft.tutorialmod.TutorialMod;
import net.codecraft.tutorialmod.item.advance.FireStone;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {
    public  static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",()->new Item(
            new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));
    public static final RegistryObject<Item> FIRE_STONE = ITEMS.register("firestone",()->new FireStone(
            new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP).maxDamage(12)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",()->new SwordItem(
            ModItemTier.STEEL,3,6f,new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));
    
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModItemTier.STEEL, 0, 1f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModItemTier.STEEL, 0, 3f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModItemTier.STEEL, 4, 4f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModItemTier.STEEL, 0, 0f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
