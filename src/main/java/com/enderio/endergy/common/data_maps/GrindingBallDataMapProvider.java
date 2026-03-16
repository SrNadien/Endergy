package com.enderio.endergy.datagen.common.data_maps;

import com.enderio.base.data.recipe.GrindingBallRecipeProvider;
import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.init.EndergyItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class GrindingBallDataMapProvider extends GrindingBallRecipeProvider {

    public GrindingBallDataMapProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        build(EndergyItems.CRUDE_STEEL_BALL.get(),       1.2F,  1.25F, 0.85F, 24000,  consumer);
        build(EndergyItems.CRYSTALLINE_ALLOY_BALL.get(), 1.8F,  1.4F,  1.45F, 80000,  consumer);
        build(EndergyItems.MELODIC_ALLOY_BALL.get(),     2.00F, 1.45F, 1.55F, 80000,  consumer);
        build(EndergyItems.STELLAR_ALLOY_BALL.get(),     2.30F, 2.25F, 2.2F,  160000, consumer);
        build(EndergyItems.VIVID_ALLOY_BALL.get(),       1.75F, 1.35F, 1.35F, 80000,  consumer);
    }

    @Override
    protected void build(Item item, float grinding, float chance, float power, int durability,
            Consumer<FinishedRecipe> recipeConsumer) {
        recipeConsumer.accept(new FinishedGrindingBall(
            new ResourceLocation(
                EnderIOEndergy.MOD_ID,
                "grindingball/" + ForgeRegistries.ITEMS.getKey(item).getPath()
            ),
            item, grinding, chance, power, durability
        ));
    }

   
}