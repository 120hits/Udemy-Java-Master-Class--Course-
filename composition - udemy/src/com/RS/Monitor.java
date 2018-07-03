package com.RS;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; //before the creation of the resolution class, this class was highlighted red = composition

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}


/*
 * Monitor class
 * <p>
 * 4 fields , 2 strings , 1 int , 1 Resolution
 * <p>
 * Constructor with all the fields
 * Create a public method called drawPixelAt
 *  param is int x and y and String color
 *  sout "drawing pixel at" + x + y + "in color" + color
 * <p>
 * Create a getters with all the fields
 * Create the resolution class
 * Composition - So the Resolution class is part of the monitor
 * Composition = the resolution is a component of a monitor , the monitor has a resolution, which is the native resolution.
 * Next create a new class called Case.
 */