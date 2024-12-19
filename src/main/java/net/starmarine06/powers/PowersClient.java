package net.starmarine06.powers;

import net.fabricmc.api.ClientModInitializer;
import net.starmarine06.powers.item.ModItems;

public class PowersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
