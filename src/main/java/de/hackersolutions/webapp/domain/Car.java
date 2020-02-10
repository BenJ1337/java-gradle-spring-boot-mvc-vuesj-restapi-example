package de.hackersolutions.webapp.domain;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    // Hibernate
    public Car() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private int wheels = 4;

    @Column(name = "color", length = 255, nullable = false)
    private String color;

    @Column(name = "modelName", length = 255, nullable = false)
    private String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public Car(int wheels, String color, String modelName) {
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
