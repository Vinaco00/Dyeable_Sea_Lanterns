package net.vinaco.dyablesealanterns.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vinaco.dyablesealanterns.DyableSeaLanterns;
import net.vinaco.dyablesealanterns.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup DYEDSEALANTERNS = FabricItemGroupBuilder.build(
            new Identifier(DyableSeaLanterns.MOD_ID, "dyablesealanterns"), ()-> new ItemStack(ModBlocks.RED_SEA_LANTERN));

}
