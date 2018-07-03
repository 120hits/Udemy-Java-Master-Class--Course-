package com.RS;

public class Main {

    public static void main(String[] args) {

//        Bad way of coding because, this allows hard coding in the main class and outside of the player class thus poor security
//        Player player = new Player();
//
//        //manually setting up the fields
//        //even though we are not in the player class we can directly access the fields
//        player.name = "Rohit";
//        player.health = 23;
//        player.weapon = "khunai";
//
//        //the code for is you take away damage 10 from out health which is 23 at the moment
//        int damage = 10;
//        //possible code inout here to override the player class
//        //player.health = 100;
//        // output = 100 - 13 , 23 - 10 = 13.
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("rohit", 23, "Khunai");
        System.out.println("initial health is " + player.getHealth());
        //output = initial health is 23
        // the reason is because of the if statement logic inside Enhanced player

    }
}

/*
 * encapsulation =
 *  allows you to restrict access to certain components in the objects that you are creating
 *  you're able to protect the members of a class from external access
 *  in order to guard against unauthorized access
 *  this is not security but we're stopping outsiders,
 *  like from things like classes or code outside of the class that you're working on
 *  from accessing the inner workings of a class
 *  useful for hiding the inner working from another class
 *  to give you more control and
 *  enable you to change things without breaking code elsewhere
 *
 *  example -
 *  Create a class that doesn't use encapsulation // the code that doesn't use encapsulation is now commented fully
 *
 *  Then create a enhanced class that does use it
 *
 *  Create a new Player object
 *   we have not created a constructor like before
 *   if you recall even though there is no const
 *   an default const with no params is always created
 *
 * Now we need to manually set those fields,
 *  set the values for those fields
 *  even though we are not in the player class we can directly access the fields
 *  because we made the fields public inside the player class
 *
 * Player class fields being public lets access like for example
 *  inside the main class , the code where we we included the damage
 *  we can add additional health to our health, this form of access is no bueno
 *  good way of controlling the health in this case is using the constructor
 *
 * The changes made in player class from field name >> fullName field
 *  now the direct hard code of field name will not work inside this main class
 *
 * The small error here for the field name is a simple fix
 *  but when you're talking about big applications it does become a problem
 *
 * With a constructor we can validate that the data is valid
 *  and that you actually got a valid class
 *
 * Now we are working with Enhanced player and inorder to access the fields
 *  we need to call the getter ex player.getHealth()
 *  Our main input data is 23
 *  23 works inside the if statement logic 23 > 0 && 23 <= 100
 *  if we input the # to 200 in our main
 *  then the output would be the default value
 *  which is 100
 *
 *
 *
 */