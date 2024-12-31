package com.domenico.mod.datagen;

import com.domenico.mod.datagen.lang.ModEnglishLanguage;
import com.domenico.mod.datagen.lang.ModItalianLanguage;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryKeys;

public class Datagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider((output, future) -> new ModItemTagProvider(output, RegistryKeys.ITEM, future));
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider((output, future) -> new ModEnglishLanguage(output, "en", future));
        pack.addProvider((output, future) -> new ModItalianLanguage(output, "it", future));
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModAdvancementProvider::new);

    }
}