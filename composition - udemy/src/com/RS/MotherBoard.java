package com.RS;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading..");
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}

/**
Mother board class

4 fields - model, manufacturer, remSlots and bios

Constructor with all the fields

All the getters

*
*
*
*
* */