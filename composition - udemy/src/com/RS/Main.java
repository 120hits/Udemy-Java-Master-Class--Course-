package com.RS;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20 , 5);
        Case theCase = new Case("1337R", "Dell", "500", dimensions);
        Monitor theMonitor = new Monitor("VN248", "Asus" , 27, new Resolution(1920,1080));
        MotherBoard theMotherboard = new MotherBoard("RX9", "Asus", 8,"v2.0");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
        //result for thePC.powerUp =
        // Power button pressed
        // Drawing pixel at 1200, 50  in color blue

//        only works with public methods and getters inside the PC class, which was in Composition p1
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherBoard().loadProgram("Windows 10");
//        thePC.getTheCase().pressPowerButton();



    }

}


/*
* creating a class on the fly technique
*   if you don't need to create a variable, you'r not going to use it for anything else
*   you only want to pass it to a method
*
*   rather than setting the param for the monitor from nativeResolution, type
*       new Resolution (1920, 1080)
*       that's created a instance of a class without using a variable
*
*   Now lets assemble our PC by crating the PC class by passing those three other objects to it
*
*   Next how to access the code inside the other classes like how
*       class extends and using the super to access the fields and methods
*       one method is by typing
*       thePC.getClass().methodInsideTheMonitorClass
*       thePC.getMonitor().drawPixelAt()
*       this is using the getter function from the PC class,
 *       which has been created in this class
*       and returning that to the calling process
*       and calling the method drawPixelAt
*       which is from that object that's stored within the PC class itself.
*       in the PC object, the instance that we've actually created
*           and that's invoking that method for us.
*
*
*
* COMPOSITION PART 2
* not allowing the calling program to access those objects directly
* go to the PC class and make the getters from public to private
*
* Composition = creating objects within objects
*   example the master object is the PC is managing and looking after and
*   this is using composition to achieve that as opposed to inheritance that we looked at in the previous video
*
*
* The general rule for java program when using inheritance or composition is
*   you wanna look at composition first before inheritance
*   has more flexibility and it does depend on the solution what you're trying to achieve
*
* */
