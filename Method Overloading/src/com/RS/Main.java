package com.RS;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Rohit", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        //if we didn't add the double in the calling code, the user input could input 13 for inches
        // and that is a invalid number for inches
        double centimeters = calcFeetAndInchesToCentimeters(6,4);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
            System.out.println("Input correct number of inches");
        }

        calcFeetAndInchesToCentimeters(100);
    }





    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + score + " scored");
        return  score * 1000;
    }


    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    //-------------------------------------------------------------------------
    //first method
    public static  double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //this if is like a backup net if the user inputs an invalid number
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        //6ft * 12 inch * 2.54cm = #cm
        double centimeters = (feet * 12) * 2.54;  //feet > centimeters
        //4inches * 2.54cm = #cm
        centimeters += inches * 2.54; //inches > centimeters
        System.out.println(feet + " feet , " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    //second method
    public static  double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            return -1;
        }
        // first inches is converted to feet and (int) makes it a whole number
        double feet = (int) inches / 12;
        // the remaining bits are then stored in the integer of remainingInches by using the %
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        //tim returns and calls the methods at the same time 2KillsWithOneStone
        //return will call the calcFeetAndInchesToCentimeters method and get  what ever that calculation is and
        //actually passing the feet and inches to it so you can calculate and ultimately
        //return the calculation value up to the double centimeter
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }



/*
* Definition of METHOD OVERLOADING
*
* method overloading is a feature that allows us to have more than one method with the same name,
* so long as we use different parameters
* SO it is the ability to create multiple methods of the same name with different implementations
* Calls to an overloaded method that will run a specific implementation of that method.
*
*
* Ending up with the following methods is not good practice and it is not actually method overloading
* ------------Never ever write code like below, it is bad practice----------------------------
*----three different names to remember----------------
*
* public static int sumTwoNumbers(int a, int b){
* return a + b;
* }
*
* public static int sumThreeNumbers(it a , int b, int c){
* return a + b + c;
* }
*
* public static int sumFourNumbers(int a, int b, int c , int d0{
* return a + b + c + d;
* }
*
* to overcome this issue we can use the same name for our functions(methods)
* so its easier to remember when we have multiple things going on in the future and easier to keep track off
*
* public static int sum(int a, int b){
 * return a + b;
 * }
 *
 * public static int sum(it a , int b, int c){
 * return a + b + c;
 * }
 *
 * public static int sum(int a, int b, int c , int d0{
 * return a + b + c + d;
 * }
 *
 * Another example is
 *
 * The println method is a great example of method overloading in the java language
 * There are actually 10 methods with the name println
 * we can print an integer, double, string and so on..
 * --
 * public static void main(String[] args){
 * System.out.println("Hello");
 * System.out.println(5);
 * System.out.println(10.75);
 * --
 *
 * Method Overloading Recap-------------------------
 *
 * it improves code readability and re-usability
 * it is easier to remember one method name instead of remembering multiple names
 * Achieves consistency in naming.One name for methods that are commonly used for ex println
 * Overloaded methods give programmers the flexibility to call a similar method with different types of data
 * based on the arguments and parameters
* */




















}
