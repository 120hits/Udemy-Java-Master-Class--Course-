package com.RS;

public class Main {

    public static void main(String[] args) {
       Outlander outlander = new Outlander(36);
       outlander.steer(45);
       outlander.accelerate(30);
       outlander.accelerate(20);
       outlander.accelerate(-9);
    }
}


/*
 * all classes in java inherit automatically, even if don't type an extend keyword
 * the class is auto inheriting from java supplied class called the object class
 * you can see it by opening up your generate command alt + ins(0)
 * you will see multiple methods that are inherited from java.lang.object,
 * a class/es that you create are automatically extend, this is equivalent to typing extends
 *
 * creating and calling the outlander object
 * first calls/accelerates to 30
 * second call/accelerates to 110
 * The sum of first and second call is added to get the sum of total velocity  = 140
 *
 * As you can see inheritance can model real life objects
 * it is very powerful and saves you a lot of coding by
 * creating classes and extending from it and all this base functionality built in
 * */

//challenge
/*
 start with a base class of a vehicle, then create a car class that inherits from this base class
finally, create another class, a specific type of car that inherits from the car class
you should be able to handle steering, change gears, and moving(speed in other words)
you will want to decide where to put the appropriate state and behaviours(fields and methods)
as mentioned above, changing gears, increasing/decreasing speed should be included
for you specific type of vehicle you will want to add something specific for that type of car
*
*
* */