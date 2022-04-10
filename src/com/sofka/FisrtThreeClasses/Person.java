package com.sofka.FisrtThreeClasses;

import java.time.LocalDate;

/**
 * Represents the definition of a person based on some of their basic attributes
 * @author Alex Lopez
 */
public class Person {
    public String name;
    public String LastName1;
    public String LastName2;
    public LocalDate dateBirth;
    public float height;

    /**
     * Creates a person object
     * @param name Person's first name
     * @param lastName1 Person's first surname
     * @param lastName2 Person's second surname
     * @param dateBirth Person's birthdate
     * @param height Person's height
     */
    public Person(String name, String lastName1, String lastName2, LocalDate dateBirth, float height) {
        this.name = name;
        this.LastName1 = lastName1;
        this.LastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Gets the person's first name
     * @return A string representing the person's first name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the person's first surname
     * @return A string representing the person's first surname
     */
    public String getLastName1() {
        return this.LastName1;
    }

    /**
     * Gets the person's second surname
     * @return A string representing the person's second surname
     */
    public String getLastName2() {
        return this.LastName2;
    }

    /**
     * Gets the person's date of birth
     * @return A LocalDate object containing the person's date of birth
     */
    public LocalDate getDateBirth() {
        return this.dateBirth;
    }

    /**
     * Gets the person's height
     * @return A float representing the person's height
     */
    public float getHeight() {
        return this.height;
    }

    /**
     * Sets the person's first name
     * @param name A String containing the person's first name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the person's first surname
     * @param lastName1 A String containing the person's first surname.
     */
    public void setLastName1(String lastName1) {
        this.LastName1 = lastName1;
    }

    /**
     * Sets the person's second surname
     * @param lastName2 A String containing the person's second surname.
     */
    public void setLastName2(String lastName2) {
        this.LastName2 = lastName2;
    }

    /**
     * Sets the person's date of birth
     * @param year An int containing the person's year of birth
     * @param month An int containing the person's month of birth
     * @param day An int containing the person's day of birth
     */
    public void setDateBirth(int year, int month, int day) {
        this.dateBirth = LocalDate.of(year, month, day);
    }

    /**
     * Sets the person's height
     * @param height A float containing the person's height
     * */
    public void setHeight(float height) {
        this.height = height;
    }
}
