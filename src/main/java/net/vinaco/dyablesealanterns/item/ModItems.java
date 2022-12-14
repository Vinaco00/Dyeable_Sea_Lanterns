package net.vinaco.dyablesealanterns.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vinaco.dyablesealanterns.DyableSeaLanterns;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(DyableSeaLanterns.MOD_ID, name), item);
    }

    public static void registerModItems(){
        DyableSeaLanterns.LOGGER.debug("Registering Mod Items for " + DyableSeaLanterns.MOD_ID);
    }

}
