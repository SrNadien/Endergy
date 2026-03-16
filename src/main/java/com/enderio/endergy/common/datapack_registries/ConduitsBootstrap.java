package com.enderio.endergy.common.datapack_registries;

import com.enderio.api.conduit.ConduitType;
import com.enderio.api.registry.EnderIORegistries;
import com.enderio.conduits.common.conduit.type.energy.EnergyConduitType;
import com.enderio.endergy.common.EnderIOEndergy; 
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ConduitsBootstrap {
    public static final DeferredRegister<ConduitType<?>> CONDUIT_TYPES =
        DeferredRegister.create(EnderIORegistries.Keys.CONDUIT_TYPES, EnderIOEndergy.MOD_ID);

    public static final RegistryObject<EnergyConduitType> CRUDE_ENERGY =
        CONDUIT_TYPES.register("crude_energy", () -> new EnergyConduitType());

    public static final RegistryObject<EnergyConduitType> COPPER_ENERGY =
        CONDUIT_TYPES.register("copper_energy", () -> new EnergyConduitType());

    public static final RegistryObject<EnergyConduitType> IRON_ENERGY =
        CONDUIT_TYPES.register("iron_energy", () -> new EnergyConduitType());

    public static final RegistryObject<EnergyConduitType> GOLD_ENERGY =
        CONDUIT_TYPES.register("gold_energy", () -> new EnergyConduitType());

    public static final RegistryObject<EnergyConduitType> CRYSTALLINE_ENERGY =
        CONDUIT_TYPES.register("crystalline_energy", () -> new EnergyConduitType());

    public static final RegistryObject<EnergyConduitType> MELODIC_ENERGY =
        CONDUIT_TYPES.register("melodic_energy", () -> new EnergyConduitType());

    public static final RegistryObject<EnergyConduitType> STELLAR_ENERGY =
        CONDUIT_TYPES.register("stellar_energy", () -> new EnergyConduitType());

    public static void register(IEventBus bus) {
        CONDUIT_TYPES.register(bus);
    }
}