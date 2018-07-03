package com.RS;

public class Car extends Vehicle {
    private int doors;
    private int engineCapcity;

    public Car(String name, int doors, int engineCapcity) {
        super(name);
        this.doors = doors;
        this.engineCapcity = engineCapcity;
    }
}

/**
 * simple inheritance example
 * the car extends from the Vehicle class
 * there are 2 fields in this car class
 * the Vehicle class is called with a super called name
 * field is equal to params
 * this car class got a is a relationship with vehicle
 * meaning that a Car is a vehicle. that the relationship between the two
 * this is what essentially what inheritance is
 * <p>
 * Composition has a different relationship that deals with a has relationship
 * for example a computer has parts like motherboard, CPU GPU
 * so it is actually a modeling parts if you will, parts of the greater whole
 * in this case we are gonna model this computer
 * we are gonna model the has a relationship
 */