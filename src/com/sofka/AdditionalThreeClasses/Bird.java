package com.sofka.AdditionalThreeClasses;

/**
 * Represents the definition of a bird
 * @author Alex Lopez
 */
public class Bird {
    private String name;
    private boolean fly;
    public float avgWingSpan;
    public float avgWeight;

    /**
     * Creates a bird object
     * @param name Name of the bird
     * @param fly flag that indicates whether an adult bird can fly or not
     * @param avgWingSpan average wing span of an adult bird
     * @param avgWeight average weight of an adult bird
     */
    public Bird(String name, boolean fly, float avgWingSpan, float avgWeight) {
        this.name = name;
        this.fly = fly;
        this.avgWingSpan = avgWingSpan;
        this.avgWeight = avgWeight;
    }

    /**
     * Gets the bird name
     * @return A string representing the name of the bird
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the bird name
     * @param name A string containing the name of the bird
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets if the bird wheter can fly or not
     * @return A boolean representing if the bird can fly
     */
    public boolean isFly() {
        return fly;
    }

    /**
     * Sets if the bird is able to fly or not
     * @param fly A boolean flag that indicates if the bird can fly
     */
    public void setFly(boolean fly) {
        this.fly = fly;
    }

    /**
     * Gets the average wing span of the bird
     * @return A float representing the average wing span
     */
    public float getAvgWingSpan() {
        return avgWingSpan;
    }

    /**
     * Sets the average wing span of the bird
     * @param avgWingSpan A float containing the average wing span
     */
    public void setAvgWingSpan(float avgWingSpan) {
        this.avgWingSpan = avgWingSpan;
    }

    /**
     Gets the average weight of the bird
     * @return A float representing the average weight
     */
    public float getAvgWeight() {
        return avgWeight;
    }

    /**
     * Sets the average weight of the bird
     * @param avgWeight A float containing the average weight
     */
    public void setAvgWeight(float avgWeight) {
        this.avgWeight = avgWeight;
    }
}
