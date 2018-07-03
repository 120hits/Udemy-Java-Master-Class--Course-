package com.RS;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");

    }

    //after you created the 2 methods for dog class called walk
//     and run add in the param here called speed
    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}


/*
Inside the Animal feature we can add additional features like all animals has to eat
so we can create a const methods for that and

 these methods are unique to the animal class
By making our method const a public class here,

 in the dog class these methods are functional
to the dog class and is available to the dog class.

The eat/move method is auto inherited to the
Dog class.

*
*
*
* */