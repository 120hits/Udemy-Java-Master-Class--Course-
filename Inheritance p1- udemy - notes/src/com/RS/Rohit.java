package com.RS;

public class Rohit extends Human{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Rohit(String name, int size, int weight,
                 int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private  void chew(){
        System.out.println("Human.chew() called");
    }

    @Override
    public void eat(){
        System.out.println("Human.eat()");
        chew();
        super.eat();
    }
}
