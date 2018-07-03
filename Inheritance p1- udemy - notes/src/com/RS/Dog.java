package com.RS;

//in java terminology if you want to inherit from another class ,
//in other words if you want to access the state of behavior thats in that other class,
//you use the extends keyword
// After you input your extends Animal..intelliJ will indicate that there is no default constructor available in Animal class
// This error is telling us that Im trying to use the animal class and to do that I need to call the const for that class
// We need to create and call the const class when applying the extends keyword
public class Dog extends Animal {

    //  to call the const use ALT + INS and click constructor and it will automatically fill in all the Animal fields as params
//  ..and also the super keyword is auto created by intelliJ..ok what is super
//  ..super is to call the const that is for the class that were extending from
//  the super class which is Animal class is extending from or in better words inheriting
//  super allows us to do is to initialize the Animal class ..Dog is part of an animal class. just because dog is also an
//   ..animal doesn't mean they all have the same feature
//  ..Inside the dog class we can assign extra state(field) and extra behavior(methods) are unique for a dog

    //  extra fields
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//  now that the auto const has been created
//  we will now remove param int brain and int body bcuz these 2 are redundant
//  bcuz all dogs have got a brain and a body and inside the super we will replace the brain and body with 1
//  This means that we are not forcing the programmer who's creating the Dog class to have to define those 2 obvious things
//  Next we will add the extra dog features inside the Dog const and add in the params and the this.field = param
//  We now have initialized all of the fields relating to this dog
//  Some of the fields were part of the Animal class and some were part of the Dog class

    public Dog(String name, int size, int weight, int eyes,
               int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

//    even though a dog will eat, the dog will chew its food, so we will create a
//    chew method for the dog class

    private void chew() {
        System.out.println("Dog.chew() called");
    }

//    next we will override a method = overriding a methods means that the same eat method that exists
//    in the Animal class but make it unique for the Dog class thus overriding the eat() method
//      super = we are overriding a method that is in the superclass(Animal class)
//    Again we can auto generate by ALT + INS and clicking the override method, shortcut = CTRL + O

    @Override
    public void eat() {
//        to indicate something is called we can print out Dog.eat() called,
//          we will also call the chew method
        System.out.println("Dog.eat()");
        chew();
        super.eat();
        //super means is to call the super equivalent of that class, a super. in the name of the function
//        java will automatically come up to the top of which sees that Dog extends Animal and go okay the super class
//        for this current class is Animal, now super will go to the Animal class and find the eat method and call that.
    }

    public void walk() {
        System.out.println("Dog.walk() called");
//      we can also use super.move but this is more better and safer //move(5);
//      adding a super in front of move will check if there is a additional move method inside
//        the dog class other wise the super will execute the move method from the Animal class
//        If there is one like the override method then those will be printed first
//        then our move(10) will be printed, that's why the console printed out
//        Animal is moving at 10 in the end because it didn't have the super keyword in the front
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    //    creating unique class for moving by using the override the move method on the top
//    followed by creating a method called moveLegs
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs called");
    }

    @Override
    public void move(int speed) {
//        indicating that something is called
        System.out.println("dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}

/*
 * in this dog class we have the basic animal features like brain body which is stored in the const of dog
 * but the extra states are what makes a dog so special
 *
 *override method
 * when creating a new override method it is used from another method created in a different class like Animal class
    The override method is created inside the Dog.java class
    Also the override method will always execute first even though the moveLegs is written first

    method x
    override method y

    //printed y
    //printed x

 *
 *
 * */