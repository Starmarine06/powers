package net.starmarine06.powers.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.starmarine06.powers.Powers;

public class ModItems {
    public static final Item CLOUD = register("cloud_item",new Item.Settings());

    private static Item register(String name, Item.Settings itemSettings) {
        Identifier id = Identifier.of(Powers.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(CLOUD);
        });
    }
}
