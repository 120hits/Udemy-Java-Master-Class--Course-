package com.RS;

public class Vehicle {
    private String name;
    private String size;


    private int currentVelocity; //using velocity to determine the speed, how fast the vehicle is going
    private int currentDirection; //where is it pointed to at the moment

    //  auto generating the const by using the short cut alt + ins and choosing both the name and size fields
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

//      auto gen const does not auto generate the 2 code lines below we manually add in the this F = 0..feature
//      when creating a new object or in other words a class we are just going to initialize velocity and direction to 0
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    //adding in the steer method with a parameter int direction
//  with the steer method are are allowing it to change relative to the current position
//  so were storing the current direction, enabling you to move relative to that
    public void steer(int direction) {
        this.currentDirection += direction; //adding int direction to currentDirection
        System.out.println("Vehicle.steer(): steering at " + currentDirection + " degrees");
    }

    //  adding in the move method with 2 params int V and int D
//  unlike the steer method, we are setting up the velocity and direction to the specific number
//  in the move method we're actually allowing you to just effectively change the velocity and the direction
//  inside the Car.java class we have created an method : changeVelocity which will call this move method
    public void move(int velocity, int direction) {
        currentVelocity = velocity; //field = param
        currentDirection = direction; //field = param
        System.out.println("vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }

}


//add in the 2 string fields name and size
//create the const for them using the short cut of alt + ins and apply it for both the string fields
//next setup another 2 additional fields this time for velocity and direction
//add in the this feature for the Velocity and Direction and set them = to zero(0)
//we are not including the gears code here because not all cars have moving gears
//but we can include the move code = the speed code inside this vehicle class
//first create a public method called steer = its gonna take a parameter for the direction(int direction)
//..and add to whatever been sent to that method, to the current direction ..
// (int direction ++>> currentDirection) .. its a mechanism for steering
// this steering method applies to all vehicles
//second create another method called move that accepts 2 params = velocity and direction
// set currentVelocity = velocity(param), direction(param)
// we also want to set getter and setters for all of the fields, for speed choose getter for all the fields
//Carried from the Car.java class we have moved to this class to
//Create the stop method and put the current velocity set that to  = 0;
//  stop method is simple and it doesn't try and reposition or anything of that nature, it just purely stops the vehicle

