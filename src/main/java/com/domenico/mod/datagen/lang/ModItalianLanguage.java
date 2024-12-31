package com.domenico.mod.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItalianLanguage extends FabricLanguageProvider {
    public ModItalianLanguage(FabricDataOutput dataOutput, String languageCode, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "it_it", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.mod.suspicious_substance", "Sostanza Misteriosa");
        translationBuilder.add("text.mod.got_suspicious_substance_desc", "Facci qualcosa!");
        translationBuilder.add("text.mod.got_suspicious_substance_tit", "Hai trovato la sostanza misteriosa, Che paura!");
    }
}
