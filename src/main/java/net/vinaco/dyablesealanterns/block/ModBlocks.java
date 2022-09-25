package net.vinaco.dyablesealanterns.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vinaco.dyablesealanterns.DyableSeaLanterns;
import net.vinaco.dyablesealanterns.item.ModItemGroup;

public class ModBlocks {

    public static final Block WHITE_SEA_LANTERN = registerBlock("white_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block ORANGE_SEA_LANTERN = registerBlock("orange_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block MAGENTA_SEA_LANTERN = registerBlock("magenta_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block LIGHT_BLUE_SEA_LANTERN = registerBlock("light_blue_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block YELLOW_SEA_LANTERN = registerBlock("yellow_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block LIME_SEA_LANTERN = registerBlock("lime_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block PINK_SEA_LANTERN = registerBlock("pink_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block GRAY_SEA_LANTERN = registerBlock("gray_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block LIGHT_GRAY_SEA_LANTERN = registerBlock("light_gray_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block CYAN_SEA_LANTERN = registerBlock("cyan_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block PURPLE_SEA_LANTERN = registerBlock("purple_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block BLUE_SEA_LANTERN = registerBlock("blue_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block BROWN_SEA_LANTERN = registerBlock("brown_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block GREEN_SEA_LANTERN = registerBlock("green_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block RED_SEA_LANTERN = registerBlock("red_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);
    public static final Block BLACK_SEA_LANTERN = registerBlock("black_sea_lantern",
            new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).luminance(15).sounds(BlockSoundGroup.GLASS)), ModItemGroup.DYEDSEALANTERNS);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK, new Identifier(DyableSeaLanterns.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(DyableSeaLanterns.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        DyableSeaLanterns.LOGGER.debug("Registering ModBlocks for " + DyableSeaLanterns.MOD_ID);
    }

}
