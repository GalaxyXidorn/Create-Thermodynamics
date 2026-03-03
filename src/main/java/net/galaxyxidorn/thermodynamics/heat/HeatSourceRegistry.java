package net.galaxyxidorn.thermodynamics.heat;

import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class HeatSourceRegistry {

    private static final Map<Block, HeatSource> SOURCES = new HashMap<>();

    public static void register(Block block, HeatSource source) {
        SOURCES.put(block, source);
    }

    public static HeatSource get(Block block) {
        return SOURCES.get(block);
    }

    public static boolean isHeatSource(Block block) {
        return SOURCES.containsKey(block);
    }
}
