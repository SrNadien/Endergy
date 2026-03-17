package com.enderio.endergy.datagen.client;

import com.enderio.api.conduit.ConduitType;
import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.EndergyConduits;
import com.enderio.endergy.common.init.EndergyBlocks;
import com.enderio.endergy.common.init.EndergyItems;
import com.enderio.endergy.common.lang.EndergyCommonComponents;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.common.data.LanguageProvider;

public class EndergyLanguageProvider extends LanguageProvider {
    public EndergyLanguageProvider(PackOutput output) {
        super(output, EnderIOEndergy.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addConduitDescriptions();
        addItems();
        addBlocks();
        addCommonLang();
        addTooltips();
    }

    private void addConduitDescriptions() {
        add("item.enderio_endergy.crude_energy",       "Crude Energy Conduit");
        add("item.enderio_endergy.copper_energy",      "Copper Energy Conduit");
        add("item.enderio_endergy.iron_energy",        "Iron Energy Conduit");
        add("item.enderio_endergy.gold_energy",        "Gold Energy Conduit");
        add("item.enderio_endergy.crystalline_energy", "Crystalline Energy Conduit");
        add("item.enderio_endergy.melodic_energy",     "Melodic Energy Conduit");
        add("item.enderio_endergy.stellar_energy",     "Stellar Energy Conduit");

        
        add(EndergyConduits.CRUDE_ENERGY,       "Crude Energy Conduit");
        add(EndergyConduits.COPPER_ENERGY,      "Copper Energy Conduit");
        add(EndergyConduits.IRON_ENERGY,        "Iron Energy Conduit");
        add(EndergyConduits.GOLD_ENERGY,        "Gold Energy Conduit");
        add(EndergyConduits.CRYSTALLINE_ENERGY, "Crystalline Energy Conduit");
        add(EndergyConduits.MELODIC_ENERGY,     "Melodic Energy Conduit");
        add(EndergyConduits.STELLAR_ENERGY,     "Stellar Energy Conduit");
    }

    private void addTooltips() {
        add("tooltip.enderio_endergy.transfer_rate", "Transfer Rate: %s FE/t");
        add("conduit.enderio_endergy.crude_energy.description",       "A basic energy conduit made from crude steel.");
        add("conduit.enderio_endergy.copper_energy.description",      "A copper energy conduit with improved throughput.");
        add("conduit.enderio_endergy.iron_energy.description",        "An iron energy conduit with solid throughput.");
        add("conduit.enderio_endergy.gold_energy.description",        "A gold energy conduit for high-speed transfer.");
        add("conduit.enderio_endergy.crystalline_energy.description", "A crystalline alloy conduit for advanced energy transfer.");
        add("conduit.enderio_endergy.melodic_energy.description",     "A melodic alloy conduit for massive energy transfer.");
        add("conduit.enderio_endergy.stellar_energy.description",     "A stellar alloy conduit capable of extreme energy transfer.");
    }

    private void addItems() {
        add(EndergyItems.CRUDE_STEEL_INGOT.get(),        "Crude Steel Ingot");
        add(EndergyItems.CRYSTALLINE_ALLOY_INGOT.get(),  "Crystalline Alloy Ingot");
        add(EndergyItems.MELODIC_ALLOY_INGOT.get(),      "Melodic Alloy Ingot");
        add(EndergyItems.STELLAR_ALLOY_INGOT.get(),      "Stellar Alloy Ingot");
        add(EndergyItems.VIVID_ALLOY_INGOT.get(),        "Vivid Alloy Ingot");

        add(EndergyItems.CRUDE_STEEL_NUGGET.get(),       "Crude Steel Nugget");
        add(EndergyItems.CRYSTALLINE_ALLOY_NUGGET.get(), "Crystalline Alloy Nugget");
        add(EndergyItems.MELODIC_ALLOY_NUGGET.get(),     "Melodic Alloy Nugget");
        add(EndergyItems.STELLAR_ALLOY_NUGGET.get(),     "Stellar Alloy Nugget");
        add(EndergyItems.VIVID_ALLOY_NUGGET.get(),       "Vivid Alloy Nugget");

        add(EndergyItems.CRUDE_STEEL_BALL.get(),         "Crude Steel Grinding Ball");
        add(EndergyItems.CRYSTALLINE_ALLOY_BALL.get(),   "Crystalline Alloy Grinding Ball");
        add(EndergyItems.MELODIC_ALLOY_BALL.get(),       "Melodic Alloy Grinding Ball");
        add(EndergyItems.STELLAR_ALLOY_BALL.get(),       "Stellar Alloy Grinding Ball");
        add(EndergyItems.VIVID_ALLOY_BALL.get(),         "Vivid Alloy Grinding Ball");

        add(EndergyItems.GRAINY_CAPACITOR.get(),         "Grainy Capacitor");
        add(EndergyItems.VIVID_CAPACITOR.get(),          "Vivid Capacitor");
        add(EndergyItems.CRYSTALLINE_CAPACITOR.get(),    "Crystalline Capacitor");
        add(EndergyItems.MELODIC_CAPACITOR.get(),        "Melodic Capacitor");
        add(EndergyItems.STELLAR_CAPACITOR.get(),        "Stellar Capacitor");
        add(EndergyItems.TOTEMIC_CAPACITOR.get(),        "Totemic Capacitor");
    }

    private void addBlocks() {
        add(EndergyBlocks.CRUDE_STEEL_BLOCK.get(),       "Crude Steel Block");
        add(EndergyBlocks.CRYSTALLINE_ALLOY_BLOCK.get(), "Crystalline Alloy Block");
        add(EndergyBlocks.MELODIC_ALLOY_BLOCK.get(),     "Melodic Alloy Block");
        add(EndergyBlocks.STELLAR_ALLOY_BLOCK.get(),     "Stellar Alloy Block");
        add(EndergyBlocks.VIVID_ALLOY_BLOCK.get(),       "Vivid Alloy Block");
    }

    private void addCommonLang() {
        add(EndergyCommonComponents.CREATIVE_TAB_TITLE, "Endergy");
        add(EndergyCommonComponents.TOTEMIC_CAPACITOR_TOOLTIP, "Can be enchanted with Efficiency to increase the modifier.");
    }

    private void add(ResourceKey<ConduitType<?>> key, String translation) {
        add("block." + key.location().getNamespace() + "." + key.location().getPath(), translation);
    }

    private void add(Component component, String translation) {
        if (component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), translation);
        } else {
            throw new IllegalArgumentException("Component " + component + " is not translatable");
        }
    }
}