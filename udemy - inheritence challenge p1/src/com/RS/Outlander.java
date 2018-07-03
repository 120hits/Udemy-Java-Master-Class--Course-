package com.RS;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 30) {
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity <= 50) {
            changeGear(3);
        } else if (newVelocity > 50 && newVelocity <= 80) {
            changeGear(4);
        } else if (newVelocity > 80 && newVelocity <= 110) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}

/*
 * Begin with extending the Outlander class with the car class
 * Next create a field for roadService
 * Next create an public constructor,
 *   when you do create it all of the other fields from other classes initializes for our Outlander const
 * Next for some of the super params we can replace them with values ex
 *   for String name >> "Outlander" , size >> "4WD"
 * Next in this class we are defining the actual car so we can hard code all the params inside the super class and const setting
 *   and remove the const params , wheels = 5 including the spare and doors = 5 , gears = 6, isManual = false
 * We can have multiple models for this Outlander class but to make it simple we will think there is only one type for now
 * Now we just need to pass one param which is roadServiceMonths = the number of months this vehicle has got for road service
 * Next create a new method called accelerate, and pass a param of the speed and based on that,
 *   depending of the speed of the car is traveling at, were automatically going to change the gear
 *   Also set the velocity and direction as well
 *   Pass in the rate = rate is the difference in speed from the current speed
 *   Looking at the new velocity of the vehicle or the car in this case
 *       declare int newVelocity =
 *       get.CurrentVelocity() + ..get current velocity from the vehicle class
 *       rate ...add the param rate,
 *       rate can be a positive #(accelerating) or a negative(decelerating) #
 * Next create a if loop inside the accelerate method
 *   inside the if loop parens set newVelocity == 0
 *   inside the if loop call the stop() method
 *   Create a else if and set it first with newVelocity > 0 && newVelocity <= 10,
 *       inside the first else if call the change gear and set the int value of 1
 *       Create other else ifs and increment and increase the speed of the velocity and the gears
 *       Don't forget the default else for the last gear
 *   Next create another if loop test outside the previous if loop as newVelocity > 0
 *       inside have call changeVelocity with params of newVelocity and getCurrentDirection()
 *       We are still going in the same direction, all we are doing is increasing and decreasing the speed
 *   Next we have declared that this outlander vehicle is a automatic
 *      thus if the vehicle stops completely the gear should auto decrease to 1
 *      this is inside the first if loop when newVelocity == 0, the stop() method is called
 *      then call the change gear method and set the gear to 1
 *
 *
 *In the accelerate method we have effectively implemented a method to change gears automatically depending the base on the speed
 *We could of created another class and put the accelerate method functionality in there so other automatic car classes can use this code
 * */