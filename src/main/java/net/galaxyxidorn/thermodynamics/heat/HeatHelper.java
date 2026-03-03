package net.galaxyxidorn.thermodynamics.heat;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class HeatHelper {

    public static Integer getTemperatureFromBelow(Level level, BlockPos pos) {

        Block block = level.getBlockState(pos.below()).getBlock();
        HeatSource source = HeatSourceRegistry.get(block);

        if (source == null) return null;

        return source.getTemperature();
    }
}
