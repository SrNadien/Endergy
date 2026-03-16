package com.enderio.endergy.common.recipes;

import com.enderio.base.common.init.EIOItems;
import com.enderio.base.common.tag.EIOTags;
import com.enderio.conduits.common.conduit.ConduitBlockItem;
import com.enderio.conduits.common.init.EIOConduitTypes;
import com.enderio.core.data.recipes.EnderRecipeProvider;
import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.datapack_registries.ConduitsBootstrap;
import com.enderio.endergy.common.init.EndergyItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ConduitRecipeProvider extends EnderRecipeProvider {

    public ConduitRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.CRUDE_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('I', EndergyItems.CRUDE_STEEL_INGOT.get())
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("crude_energy_conduit"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.COPPER_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("IGI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('G', EIOTags.Items.DUSTS_GRAINS_OF_INFINITY)
            .define('I', Tags.Items.INGOTS_COPPER)
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("copper_energy_conduit"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.IRON_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("IGI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('G', EIOTags.Items.DUSTS_GRAINS_OF_INFINITY)
            .define('I', Tags.Items.INGOTS_IRON)
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("iron_energy_conduit"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.GOLD_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("IGI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('G', EIOTags.Items.DUSTS_GRAINS_OF_INFINITY)
            .define('I', Tags.Items.INGOTS_GOLD)
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("gold_energy_conduit"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.CRYSTALLINE_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('I', EndergyItems.CRYSTALLINE_ALLOY_INGOT.get())
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("crystalline_energy_conduit"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.CRYSTALLINE_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("ICI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('I', EndergyItems.CRYSTALLINE_ALLOY_INGOT.get())
            .define('C', EIOConduitTypes.ENERGY.get().getConduitItem())
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("crystalline_energy_conduit_upgrade"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.MELODIC_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('I', EndergyItems.MELODIC_ALLOY_INGOT.get())
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("melodic_energy_conduit"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.MELODIC_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("ICI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('I', EndergyItems.MELODIC_ALLOY_INGOT.get())
            .define('C', ConduitsBootstrap.CRYSTALLINE_ENERGY.get().getConduitItem())
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("melodic_energy_conduit_upgrade"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.STELLAR_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('I', EndergyItems.STELLAR_ALLOY_INGOT.get())
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("stellar_energy_conduit"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,
                ConduitsBootstrap.STELLAR_ENERGY.get().getConduitItem(), 8)
            .pattern("BBB")
            .pattern("ICI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER.get())
            .define('I', EndergyItems.STELLAR_ALLOY_INGOT.get())
            .define('C', ConduitsBootstrap.MELODIC_ENERGY.get().getConduitItem())
            .unlockedBy("has_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER.get()))
            .save(consumer, EnderIOEndergy.rl("stellar_energy_conduit_upgrade"));
    }
}