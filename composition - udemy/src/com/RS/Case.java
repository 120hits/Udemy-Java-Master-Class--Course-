package com.RS;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String munufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = munufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getMunufacture() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}


/**
 * Create the fields of model, manufactures, power supply and Dimensions with name dimensions;
 * Create the constructor that will accept the params with all the fields
 * Note that the Dimensions field is highlighted red at the moment
 * Create a method called pressPowerButton with no params
 * add and sout = "Power button pressed"
 * Add the getters for all the fields
 * Next create the Dimensions class.
 * Now we have created the Dimensions class the field called Dimensions red highlighted goes away
 */
