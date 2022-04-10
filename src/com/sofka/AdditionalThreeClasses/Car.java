package com.sofka.AdditionalThreeClasses;

/**
 * Represent the definition of a car
 * @author Alex Lopez
 */
public class Car {
    protected String make;
    private String model;
    private int year;
    public String color;
    private int doors;

    /**
     * Creates a car object
     * @param make Manufacturer of the car
     * @param model Model of the car
     * @param year Year of manufacturing of the car
     * @param color Color of the car
     * @param doors Amount of doors of the car
     */
    public Car(String make, String model, int year, String color, int doors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.doors = doors;
    }

    /**
     * Gets the name of the manufacturer of the car
     * @return A string representing the name of the manufacturer of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the name of the manufacturer of the car
     * @param make A string containing the name of the manufacturer of the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets the year when the car was made
     * @return An integer representing the year of manufacturing of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car
     * @param model A string containing model of the car
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the year of manufacturing of the car
     * @return An integer representing the year of manufacturing of the car
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of manufacturing of the car
     * @param year An integer containing the year of manufacturing of the car
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets the color of the car
     * @return A string containing the color of the car
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the car
     * @param color A string containing the color of the car
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the amount of doors in the car
     * @return An integer representing the amount of doors in the car
     */
    public int getDoors() {
        return doors;
    }

    /**
     * Sets the amount of doors in the car
     * @param doors An integer containing the amount of doors in the car
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }
}
