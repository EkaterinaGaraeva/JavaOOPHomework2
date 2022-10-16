package ru.geekbrains.sm1;

public class Conditioner implements Stoppable {

    private Boolean on;
    private int temperature;

    public void start() {
        this.on = true;
        System.out.println("Air conditioning is turned on");
    }

    public void stop() {
        this.on = false;
        System.out.println("Air conditioning is turned off");
    }

    public int getTemperature() {
        if (this.getOn()) {
            return temperature;
        } else {
            return -1;
        }

    }

    public void setTemperature(int temperature) {
        if (this.getOn()) {
            this.temperature = temperature;
        }
    }

    public Boolean getOn() {
        return on;
    }
}
