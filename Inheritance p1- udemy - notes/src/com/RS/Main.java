package com.RS;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Pomeranian", 8, 14, 2, 4, 1, 20, "soft white hair");
        dog.eat();
        //dog.walk();
        dog.run();

        Fish fish = new Fish("Nemo", 5, 5, 1, 2, 1);
        fish.swim(15);

//        Human man = new Human("Man", 1, 1, 7, 160);
//
//        Rohit rohit = new Rohit("Rohit", 7, 147, 2, 2, 0, 22, "Skin");
//        Rohit.eat();


    }


}


//in java terminology if you want to inherit from another class ,
//in other words if you want to access the state of behavior that's in that other class,
//you use the extends keyword

//Like usual we have created a new animal object class and added in the random param features of an animal
//Next we created the dog object class with an example of Daisy and her dimensions

// dog.eat(), even though the code of eat method is not inside the dog class rather
//it is inside the Animal class because we have inherited our Animal class into the Dog class by using extends..
//we can use the eat and move function from calling it from the dog class because it is an public class

//java.lang.Object
//alt + ins and you have a thing called java.lang.Object = every single class you create
//even though it doesn't come up and show you by the use of the extends keyword,
//it does actually get extended. You are extending the java.lang.Object object class, which is a special class created by java


//main calls
//Dog.eat()
//Dog.walk()
//Dog.run()

//whats printed in the console

//Dog.eat()
//Dog.chew called

//Animal.eat() called

//Dog.walk() called
//Animal is moving at 5

//Dog.run() called

//dog.move called
//dog.moveLegs called

//Animal is moving 10
//----------------------------------------------
//prints without the call of dog.walk()
/*
Dog.eat()
Dog.chew() called
Animal.eat() called
Dog.run() called
dog.move called
Dog.moveLegs called
Animal is moving at 10
*
* */
