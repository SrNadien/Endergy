package com.enderio.endergy.common.conduit;

import com.enderio.conduits.common.conduit.type.energy.EnergyConduitData;
import com.enderio.conduits.common.conduit.type.energy.EnergyConduitType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class EndergyEnergyConduitType extends EnergyConduitType {

    private final int transferRate;
    private final String descriptionKey;

    public EndergyEnergyConduitType(String descriptionKey, int transferRate) {
        super();
        this.transferRate = transferRate;
        this.descriptionKey = descriptionKey + ".description";
    }

    @Override
    public EnergyConduitData createConduitData(Level level, BlockPos pos) {
        EnergyConduitData data = new EnergyConduitData();
        data.setCapacity(transferRate);
        return data;
    }

    @Override
    public void addToTooltip(@Nullable Level level, Consumer<Component> tooltipAdder, TooltipFlag tooltipFlag) {
        tooltipAdder.accept(Component.translatable(descriptionKey));
        tooltipAdder.accept(Component.translatable("tooltip.enderio_endergy.transfer_rate", transferRate));
    }
}