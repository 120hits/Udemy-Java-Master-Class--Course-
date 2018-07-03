package com.RS;

public class Main {
    //in this [main class ]we can [build an object] based on the [class car] we have created
    //in this [main class] we will [crate an object]
    //we can [treat our car class] as a [data type]
    // inside the [main method] we can [type car] and [intelliJ] will recognize car as a local variable
    //when creating a new class we need to initialize it. //car Nissan = new Car;
    //we have created a new data type called Nissan which is a type of car
    //in other words we created an object called Nissan based on the template Car
    // we can also create another object inside the little main ex Car Toyota = new Car();
    //now how do we access the state variables or in other words our fields in our class Car
    //next now the object have been created
    // but there is also extra functionality that java has added to these class/ object automatically
    //to see that in action.
    //next when we type Nissan. //it shows multiple things we can do with it
    //This means that Car class has inherited these from the base java class aka sub classes
    //we cant access the components(state/field) of the car because they are in private unless we change them to public
    //if you change the car components(state/field) to public it shows up when you type Nissan.model inside our main class
    //model is the state in other words the field of the car
    //that's one way to access the data but that validates the rules of encapsulation
    //what should we doing is making sure that functionality should be restricted and placed in the car java class


    public static void main(String[] args) {
//  ex Car Nissan; //we have to initialize the "new Car()" bcuz unlike data types there isn't default values with classes
//  intelliJ will say variable 'Nissan' located in Nissan.setModel("350z"); might not have been initialized
        Practice_Car_class Nissan = new Practice_Car_class();
        Car Toyota = new Car();
        Practice_Car_class Geo = new Practice_Car_class(); //practice


        //Nissan.model = "350z"; //model string is back to private and we cant access it anymore, if it was public we can

//      this is the way to call the set model method for our object and updating it with the value 350z

//      ex error - System.out.println("Model is " + Nissan.getModel()); on top of nissan.setModel..
//      ..we get a null, which is the eternal default state for class & String
//      If we changed the name from 350z to something else, we will get the output of "model is unknown"
//      The reason for this is bcuz if you jump into the Car.java
//      We have made a validation model for only 350z and supra and result will yield model is unknown for anything else

        Nissan.setModel("350z"); //this is the standard way to access a field when it is private
        Toyota.setModel("Supra");
        Geo.setModel("Prizm"); //practice

        Nissan.setEngine("3.7L VR38DETT");

//      when you output you do Method.get
        System.out.println("Model is " + Nissan.getModel());
        System.out.println("Model is " + Toyota.getModel());
        System.out.println("Model is " + Geo.getModel()); //practice

        System.out.println("Engine is " + Nissan.getEngine());
    }
}

/*review on what you learned | what does all this code mean

* Objects are made inside the Main.java class
*
* first when we create an new object we need to attach our Practice_Car_class by..
* linking the java class you created and put object = the car brand you want, in this case it is Nissan(object)
*
* Followed by the = new, and again the java class you created
 * new is a java object that allocates memory for it on the heap,
* new is also used for array creation, as arrays are also objects
* Practice_Car_class Nissan = new Practice_Car_class();
*
* You can create multiple objects inside the Main.java class
*
Java class name(Practice_Car_class)-car brand name(nissan) = new Java class name(Practice_Car_class();
Practice_Car_class Nissan = new Practice_Car_class();

the sets and gets we have created inside the PCc.java is utilized here

set
Object.setField("output you want to display");
Nissan.setModel("350z");
Nissan.setEngine("3.7L VRDETT");

get
Sout("words " + Object.getField());
System.out.println("Engine is " + Nissan.getEngine());

SET | GET
when you are calling setter and getters their Field name is always capitalized
*
* */