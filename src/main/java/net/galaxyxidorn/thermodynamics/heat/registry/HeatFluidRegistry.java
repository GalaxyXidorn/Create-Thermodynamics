package net.galaxyxidorn.thermodynamics.heat.registry;

import net.galaxyxidorn.thermodynamics.heat.api.HeatWorkingFluid;

import java.util.HashMap;
import java.util.Map;



public class HeatFluidRegistry {

    private static final Map<String, HeatWorkingFluid> FLUIDS = new HashMap<>();

    public static HeatWorkingFluid register(HeatWorkingFluid fluid) {
        FLUIDS.put(fluid.getId(), fluid);
        return fluid;
    }

    public static HeatWorkingFluid get(String id) {
        return FLUIDS.get(id);
    }
}
