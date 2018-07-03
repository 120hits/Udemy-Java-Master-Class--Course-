package com.RS;

public class Practice_Car_class {
    private int wheels;
    private int doors;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }


}

/*What I learned from using the whiteboard | listening to Tim rather than just coping his notes
  What does this code all mean and the explanation inside the Practice_Car_class.java

Fields are created inside the new java class you created - Practice_Car_class.java
inside the public class when the new java shell is created
private int wheels;
private String model;
private String engine;

set and get are made inside the new java class that you created - Practice_Car_class
set | get also have their own Methods|Function of public or private that you have to code inside the PCc.java
Each field has 2 methods get and set

set has a void with setField and the pram of the field you want to set
public void setEngine(String engine);

inside the set there is a this component
this = the reference to the current object whose method or constructor is being invoked, this = Nissan = Object
this is followed by ' .(dot) ' field(engine) = param(engine)
this.engine = engine;

get starts with public or private with field var which is String for engine;
then get grabs the param from the set, so initially get is grabbing the param of set which is String engine
but getFiled is capitalized , get does not have a param but have empty ()'s
public String getEngine()(

inside of the get method we need to return with once again returning "this"  with .(dot) field
return this.engine;

we have made an total of 2 get | set methods with a total = 4, 2 set + 2 get = 4 methods
model and engine are the fields

setters and getters method Field names are always capital
private void setModel(String model){this.model = model;}
private String getEngine(){ return this.engine; }

how to call the set from the new java class you created?
Set is called by ex object.setfield("output you want to display");
*
*
* */
