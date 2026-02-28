package net.galaxyxidorn.thermodynamics.heat.registry;

import net.galaxyxidorn.thermodynamics.heat.api.HeatWorkingFluid;

public class ModHeatFluids {
    public static HeatWorkingFluid CRYOFLUID;
    public static HeatWorkingFluid WATER;
    public static HeatWorkingFluid MOLTEN_NAPHTHALENE;
    public static HeatWorkingFluid MOLTEN_SULFUR;
    public static HeatWorkingFluid MOLTEN_SODIUM;

    public static void register() {
        CRYOFLUID = HeatFluidRegistry.register(
                new HeatWorkingFluid(
                        "cryofluid",
                        -250,
                        0,
                        5
                )
        );
        WATER = HeatFluidRegistry.register(
                new HeatWorkingFluid(
                        "molten_naphthalene",
                        0,
                        250,
                        5
                )
        );
        MOLTEN_NAPHTHALENE = HeatFluidRegistry.register(
                new HeatWorkingFluid(
                        "molten_naphthalene",
                        200,
                        425,
                        5
                )
        );
        MOLTEN_SULFUR = HeatFluidRegistry.register(
                new HeatWorkingFluid(
                        "molten_sulfur",
                        225,
                        500,
                        5
                )
        );

        MOLTEN_SODIUM = HeatFluidRegistry.register(
                new HeatWorkingFluid(
                        "molten_sodium",
                        400,
                        1000,
                        5
                )
        );
    }
}
