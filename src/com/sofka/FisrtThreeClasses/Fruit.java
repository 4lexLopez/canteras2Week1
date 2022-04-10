package com.sofka.FisrtThreeClasses;

import java.util.ArrayList;

/**
 * Represents the definition of a fruit based on some of their basic attributes
 * @author Alex Lopez
 */
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList colors;

    /**
     * Creates a fruit object
     * @param name Name of the fruit
     * @param averageWeight Average weight of the list of the fruit
     * @param colors List with the different colors of the fruit
     */
    public Fruit(String name, float averageWeight, ArrayList colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Gets the name of the fruit
     * @return A string representing the name of the fruit
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the average weight of the fruit
     * @return A float with the average weight of the fruit
     */
    public float getAverageWeight() {
        return this.averageWeight;
    }

    /**
     * Gets the arraylist that contains the different colors of the fruit
     * @return An arraylist with the different colors of the fruit
     */
    public ArrayList getColors() {
        return this.colors;
    }

    /**
     * Sets the name of the fruit
     * @param name A string containing the name of the fruit
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the average weight of the fruit
     * @param averageWeight A float containing the weight of the fruit
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Sets the colors of the fruit
     * @param colors An arraylist with the different colors of the fruit
     */
    public void setColors(ArrayList colors) {
        this.colors = colors;
    }
}
