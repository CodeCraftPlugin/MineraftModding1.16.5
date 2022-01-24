package net.codecraft.tutorialmod.blocks;

import net.codecraft.tutorialmod.TutorialMod;
import net.codecraft.tutorialmod.blocks.advance.FirestoneBlock;
import net.codecraft.tutorialmod.item.ModItem;
import net.codecraft.tutorialmod.item.ModItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> STEEL_ORE = registerBlock("steel_ore",()->new
            Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f,10f)),ModItemGroup.TUTORIAL_GROUP);
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",()->new Block(AbstractBlock.Properties
            .create(Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)),ModItemGroup.TUTORIAL_GROUP);
    public static final RegistryObject<Block> FIRESTONEBLOCK = registerBlock("firestoneblock",()->
            new FirestoneBlock(AbstractBlock.Properties.create(Material.IRON).harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)),ModItemGroup.TUTORIAL_GROUP);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T>block,ItemGroup itemgroup){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,itemgroup);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, ItemGroup itemgroup) {
        ModItem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(itemgroup)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
