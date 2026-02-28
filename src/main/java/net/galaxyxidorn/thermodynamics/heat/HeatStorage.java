package net.galaxyxidorn.thermodynamics.heat;

import net.galaxyxidorn.thermodynamics.heat.api.HeatWorkingFluid;

public class HeatStorage {

    private int heat;
    private HeatWorkingFluid fluid;

    public HeatStorage(HeatWorkingFluid fluid) {
        this.fluid = fluid;
        this.heat = 0;
        clampToFluid();
    }

    public int getHeat() {
        return heat;
    }

    public HeatWorkingFluid getFluid() {
        return fluid;
    }

    public void setFluid(HeatWorkingFluid newFluid) {
        this.fluid = newFluid;
        clampToFluid();
    }
    public void setHeat(int value) {
        this.heat = value;
        clampToFluid();
    }
    public void addHeat(int amount) {
        this.heat += amount;
        clampToFluid();
    }

    public void removeHeat(int amount) {
        this.heat -= amount;
        clampToFluid();
    }
    public boolean isValidTemperature() {
        return fluid.isValidTemperature(heat);
    }

    public boolean isAtMin() {
        return heat <= fluid.getMinTemp();
    }

    public boolean isAtMax() {
        return heat >= fluid.getMaxTemp();
    }

    /* ---------------------------
       Internal Helper
     ---------------------------- */

    private void clampToFluid() {
        if (heat < fluid.getMinTemp()) {
            heat = fluid.getMinTemp();
        }

        if (heat > fluid.getMaxTemp()) {
            heat = fluid.getMaxTemp();
        }
    }
}
