package com.RS;

public class Car {
    //class car is just a template or a blue print
    // we need to create an object which will take the blue print that we have defined
    // and create an object that we can start using
    //by going to the main class,
    // main class is already created by intelliJ when we created this new project
    //when we create an method that is then attached to all the objects that you create for that particular class
    //in the past we have only created static classes and static classes arent really the same thing
//  another thing is below we have 3 strings which is considered classes so we have class Car and within 3 String classes

    private int doors; //state of the class car/field
    private int wheels; //s/f
    private String model; //s/f/class
    private String engine; //s/f/c
    private String colour; //s/f/c

//  C2 notes
//  create our method and allow the method to update the model
//  method = public void setModel, when we type set the created multiple states will be shown
//  param = string, bcuz we want the other class to send the string
//  that they want to be created & for it to be updated in here
//  next we want to update the model field with the contents of the param that was passed to us and update in here
//  this = when you are referring to the field of the class
//  now if we want to access the model field then we type "this" followed by "." and the field will show up
//  intelliJ will also indicate us that if it is an filed(f) or an param(p) on the left side
//  after we initialize the F we did = mo and a P will show up on th left side
//  basically "this" is doing is saying update the field model variable
//  with the contents of the parameter model that was passed to us.
//  this is way to access the private contents using a method vs trying to access it directly
//this method is also a setter

    public void setModel(String model) {
        //String validModel = model.toLowerCase();//converts to whatever was passed to us to lower case
//      test code - that is gonna accept for this method are gonna be a type Nissan & Toyota
//      the .equal is a way to test a particular value of String that is equal to another type
//      so when we type validX.equals and what we wanna search it against in brackets,
//      we can test that and that will return true or false if they are equal
//      what we are saying is if the model equals a Nissan OR validModel.equals a supra we can assign that value
//      only if what was passed to us equals a Nissan or a Supra
//      will we allow our internal state, our internal model field to be assigned the value thats been passed to us
//      The reason is that is bcuz we got a rule were creating our class to only define those two types
//      To over the error we have included a else statement with unknown
//      "this.model = model;" is saving what was passed to us
//      The actual test is we are testing for the model of the car brands which is 350z and supra
//      Validation code will only allow for 350z and supra models to be outputted or..
//      ..else "Model is Unknown" is printed and changes made in the main.java is pointless
        this.model = model;


//      test if code to validate if needed
//        if (validModel.equals("350z") || validModel.equals("Supra")) {
//            this.model = model; //saves what we passed
//        } else {
//            this.model = "Unknown";
//        }
    }

//this method is called a getter
//intelliJ will indicate us when we return String get.Mo-
// right here it will tell us the model field is a private by the closed red pad lock = private

    public String getModel() {

        return this.model;
    }

}

/*
 * private class is
 * adhering to encapsulation
 * which is a key fundamental rule of oop programming
 *
 * encapsulation in java is used to hide the fields and methods from access publicly
 *
 * private code contents are going to be hidden from view outside the objects definition
 *
 * the only way the private code can be accessed is by its parent class or by this object
 *
 * the state on the class is th field as well I think state and field is the same thing
 *
 * Also when you are creating a class, you can setup all the rules related to that class
 * like what is valid and what is not valid and have it all setup, all that functionality setup
 * within the car class itself and so that is inherited when we create the object
 * What the means is the code that is creating objects can't make invalid objects
 * In other words, it can't create in this case for example it can't assign a model number, that we haven't defined
 * as being valid in our car class.
 * The concept of encapsulation is not allowing people to access the field directly and by forcing to assign the model
 * using a method, we can make sure the data is within our objects are more valid and have been validated and are correct
 *
 *
 * */