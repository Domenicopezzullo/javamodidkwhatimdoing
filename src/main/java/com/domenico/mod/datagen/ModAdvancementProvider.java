package com.domenico.mod.datagen;

import com.domenico.mod.Mod;
import com.domenico.mod.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    protected ModAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup wrapperLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry getSuspiciousSubstance = Advancement.Builder.create()
                .display(
                        ModItems.SUSPICIOUS_SUBSTANCE,
                        Text.translatable("text.mod.got_suspicious_substance_tit"),
                        Text.translatable("text.mod.got_suspicious_substance_desc"),
                        Identifier.ofVanilla("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        true
                )
                .criterion("got_suspicious_substance", InventoryChangedCriterion.Conditions.items(ModItems.SUSPICIOUS_SUBSTANCE))
                .build(consumer, Mod.MOD_ID + "/get_suspicious_substance");
    }
}
