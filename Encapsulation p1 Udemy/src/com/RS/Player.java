package com.RS;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage; //this.health = this.health - damage
        if (this.health <= 0) {
            System.out.println("player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}

/*
 * create 3 public fields
 *  pubic right now because of scope, we will learn about scope later on the course
 *
 * create a method called loseHealth and a param of int damage
 *  inside the method
 *   make this.health minus with the integer damage
 *   create a if loop
 *    if this.health is less than or equal to 0
 *     print out "player is knocked out"
 *
 * Create another method of health that is available that is remaining
 *
 * The changes made in here affect the output of the main class
 *  ex say you changed the field name = fullName
 *  this change now will affect the main class >> go to main class
 *
 *
 * Because the fields inside this player class is public this is a bad form of encapsulation
 *  thus creates an security for hard coding inside the main class
 *
 *
 * */