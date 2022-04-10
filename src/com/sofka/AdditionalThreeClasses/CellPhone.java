package com.sofka.AdditionalThreeClasses;

/**
 * Represents the definition of a cellphone
 */
public class CellPhone {
    private String make;
    private String model;
    public String os;
    protected long imei;
    public float screenSize;

    /**
     * Creates a cellphone object
     * @param make Manufacturer of the cellphone
     * @param model Model of the cellphone
     * @param os Name of the operating system of the cellphone
     * @param imei 15 digit unique number of the cellphone
     * @param screenSize size of the screen of the cellphone
     */
    public CellPhone(String make, String model, String os, long imei, float screenSize) {
        this.make = make;
        this.model = model;
        this.os = os;
        this.imei = imei;
        this.screenSize = screenSize;
    }

    /**
     * Gets the name of the manufacturer of the cellphone
     * @return A string representing the name of the manufacturer of the cellphone
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the name of the manufacturer of the cellphone
     * @param make A string containing the name of the manufacturer of the cellphone
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets the name of the model given to the cellphone
     * @return A string representing the name of the model given to the cellphone
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the name of the model of the cellphone
     * @param model A string containing the name of the model of the cellphone
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the stock version of the operative system installed in the cellphone
     * @return A string representing the version of the operative system installed in the cellphone
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the name of the stock version of the operative system installed in the cellphone
     * @param os A string containing the name of the operative system installed in the cellphone
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * Gets the unique number that identifies the cellphone
     * @return A long number representing the unique number that identifies the cellphone
     */
    public long getImei() {
        return imei;
    }

    /**
     * Sets the number that identifies the cellphone
     * @param imei A long number containing the unique number that identifies the cellphone
     */
    private void setImei(long imei) {
        this.imei = imei;
    }

    /**
     * Gets the size of the screen of the cellphone
     * @return A float number representing the size of the screen of the cellphone
     */
    public float getScreenSize() {
        return screenSize;
    }

    /**
     * Sets the size of the screen of the cellphone
     * @param screenSize A float number containing the size of the screen of the cellphone
     */
    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }
}
