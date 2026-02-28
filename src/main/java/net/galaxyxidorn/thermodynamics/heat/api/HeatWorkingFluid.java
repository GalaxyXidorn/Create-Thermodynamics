package net.galaxyxidorn.thermodynamics.heat.api;

public class HeatWorkingFluid {

    private final String id;
    private final int minTemp;
    private final int maxTemp;
    private final int conductivity;

    public HeatWorkingFluid(String id, int minTemp, int maxTemp, int conductivity) {
        this.id = id;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.conductivity = conductivity;
    }
    public String getId() {
        return id;
    }
    public int getMinTemp() {
        return minTemp;
    }
    public int getMaxTemp() {
        return maxTemp;
    }
    public boolean isValidTemperatur(int temp) {
        return temp >= minTemp && temp <= maxTemp;
    }
}
