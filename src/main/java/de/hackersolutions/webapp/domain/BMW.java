package de.hackersolutions.webapp.domain;

public class BMW implements ICar {
    private int wheels = 4;
    private String color = "Blue";
    private String modelName;

    public BMW(String modelName) {
        this.modelName = modelName;
    }

    public BMW(int wheels, String color, String modelName) {
        this.wheels = wheels;
        this.color = color;
        this.modelName = modelName;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
