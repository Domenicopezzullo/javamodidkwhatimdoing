package com.domenico.mod.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLanguage extends FabricLanguageProvider {
    public ModEnglishLanguage(FabricDataOutput dataOutput, String languageCode, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.mod.suspicious_substance", "Suspicious Substance");
        translationBuilder.add("text.mod.got_suspicious_substance_tit", "You got suspicious substance!");
        translationBuilder.add("text.mod.got_suspicious_substance_desc", "Do something with it!");
    }
}
