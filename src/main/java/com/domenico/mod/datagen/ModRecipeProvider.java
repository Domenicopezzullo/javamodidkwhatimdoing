package com.domenico.mod.datagen;

import com.domenico.mod.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                offerSmelting(List.of(Items.COAL, Items.CHARCOAL), RecipeCategory.MISC, ModItems.SUSPICIOUS_SUBSTANCE, 1395, 200, "group");
                createShaped(RecipeCategory.MISC, ModItems.SUSPICIOUS_SUBSTANCE, 4)
                        .pattern("ll")
                        .pattern("ll")
                        .input('l', Items.COAL)
                        .group("multi-bench")
                        .criterion(hasItem(ModItems.SUSPICIOUS_SUBSTANCE), conditionsFromItem(ModItems.SUSPICIOUS_SUBSTANCE))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}