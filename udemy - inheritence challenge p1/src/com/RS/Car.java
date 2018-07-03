package com.RS;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    //removed currentGear from the param
    public Car(String name, String size,
               int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;//changing currentGear to 1
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGears(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }


}


/*
 * first extend the car class to the vehicle class
 * next create fields that relate to the car class
 * next add in boolean for if the car is manual or not
 * next also add a int for what gear it is in
 * next auto gen the const for all the fields and it will initialize all of our fields,..
 * ..when doing that intelliJ will also auto add in the param..
 * ..String name and String size from the Vehicle class
 * next remove the param from the car const called  = int current Gear >> ..
 * ..assume that when we create a new object, we can set that to one, to be in first gear
 * next we need other methods like we need the ability to change the gear,
 * change the velocity of the vehicle, method to stop, and method to steer
 * First we need to create a setter for current Gear with param of currentGear and sout output =
 * .."Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
 *   >> so that's just a standard setter to change to the current gear whenever, in the industry setCurrentGears
 *   >> works just fine but Tim is suggesting that we change "setCurrentGear" >> "changeGear"
 *   >> the reason is it reads better and makes more sense
 * Next we want the ability to change the velocity of the vehicle by calling the move method
 *   by creating another method called changeVelocity with 2 params speed and direction
 *   then we will call the move method : move(speed,direction)
 *   then sout "Car.change() : Velocity " + speed + " direction " + direction;
 *   Reason = some point in the future we might wanna have some other mechanisms in here with the velocity
 *   For example to test the maximum speed of the vehicle or some other conditions that are unique to a car, as opposed to a vehicle
 *Next method we are implementing here is the stop method,
 *   this is the ability to stop, you could argue that all vehicles need to have tp have a mechanism to stop
 *   we need to jump to the Vehicle.java class inorder to do that..
 * */