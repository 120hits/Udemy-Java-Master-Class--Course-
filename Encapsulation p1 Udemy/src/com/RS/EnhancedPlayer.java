package com.RS;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100; //for this example we have hard coded the hitPoints to 100
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;

        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage; //this.hitPoints = this.hitPoints - damage
        if (this.hitPoints <= 0) {
            System.out.println("player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}

/*
 * this is the proper way of using encapsulation
 *
 * We have hard coded out field hitPoints to 100
 *
 * Inside the constructor
 *  input if statements of hitPoints being greater than zero and hitPoints is less than and equal to 100
 *  transferred our this.hitPoints = hitPoints inside the if statement
 *  then and only then are we going to assign the value to our field
 *
 * Added the same lose hitPoints method from the player class
 *
 * Getter = getter is the only way the main can access the fields of Enhanced player
 *
 * Inside intelliJ we can use a tool called
 *  REFACTOR = renaming one of the field name x then all x is changed with it automatically through out the code
 *   for ex - highlight the hitPoints field name
 *   right click and click refactor >> rename
 *   a window will pop up
 *   click refactor button
 *
 * Even though our new internal field name is changed
 *  our getter still works fine because
 *  it is calling the getHealth() method
 *  and returning the new field name
 *  and doing the rest for us
 *
 *
 * */