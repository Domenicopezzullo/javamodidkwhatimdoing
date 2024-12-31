package com.domenico.mod.items;

import com.domenico.mod.Mod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUSPICIOUS_SUBSTANCE = registerItem("suspicious_substance", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Mod.MOD_ID, "suspicious_substance")))
            .maxCount(16)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Mod.MOD_ID, name), item);
    }

    public static void registerItems() {
        Mod.LOGGER.info("Registering Mod Items for " + Mod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SUSPICIOUS_SUBSTANCE);
        });
    }
}
