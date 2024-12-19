package net.starmarine06.powers.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starmarine06.powers.Powers;

public class ModItems {
    public static final Item FLY = registerItem("fly",new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Powers.MOD_ID, name), item);
    }
    public static void registerModItems(){

    }
}
