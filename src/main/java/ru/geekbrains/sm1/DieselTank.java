package ru.geekbrains.sm1;

public class DieselTank extends Fuel {
    private Double fullTank;

    public Double getFullTank() {
        return fullTank;
    }

    @Override
    protected void percentOfFuel() {
        Double percent = (super.getFuelLevel() / fullTank) * 100.00;
        if (percent > 10) {
            System.out.printf("Percentage of filling of the diesel tank = %.2f%n", percent);
        }
        else {
            System.out.printf("!!!! Percentage of filling of the diesel tank = %.2f%n", percent);
        }
    }
}
