package net.galaxyxidorn.thermodynamics.heat;

public class TemperatureStorage {

    private int temperature = 0;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void clear() {
        this.temperature = 0;
    }
}
