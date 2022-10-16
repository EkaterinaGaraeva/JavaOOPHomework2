package ru.geekbrains.sm1;

public abstract class Fuel {
    private Double fuelLevel = 5.00;

    public Double getFuelLevel() {
        return fuelLevel;
    }

    protected abstract void percentOfFuel();
}
