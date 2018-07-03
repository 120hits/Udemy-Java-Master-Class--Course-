package com.RS;

public class Main {

    public static void main(String[] args) {
//      I have included all the boolean and int data types
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


//      We have included an int called highScore that holds all of the value of the calculateScore function
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        //      now we don't have to sys.out finalScore we can do sys.out highScore
        System.out.println("you final score was " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("you final score was " + highScore);

    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

/*

there is one class called main, inside the class..
there are 2 functions : main function & calculateScore function
main function is calling the calculateScore function,
main function holds the 2 calling method and also holds the answer key to the question creation rule function
main function cant create the rules, main function can only call at the moment
calculateScore function creates the rules and holds 4 parameters that
param 1 = boolean gameOver
param 2 = int score
param 3 = int levelCompleted
param 4 = int bonus
main function calls calculateScore function looks at the first param which is boolean
boolean gameOver looks at the gameOver var and see if it is true or false
the main function does the same thing for all of the other params and outputs an answer
calculateScore function can also apply complex rules    or
additional rules into the mix for more complex output
the complex rule here is that of the if data type
In "if(gameOver)" we don't have to make gameOver to gameOver == true,
inside the if, if the given variable is set to true,
java will auto assume that what ever is inside the if(x) is true
thus there is no reason for us to write in gameOver== true
inside the if statement there is a new integer named finalScore
int finalScore calculates all of the param values into a simple math equation
inside the finalScore var, first levelCompleted is multiplied by bonus, then added with the score
next finalScore also gets additional bonus points of 2k with it in the end and that will include in the final score
All the values of int score, levelCompleted, and bonus are inside the finalScore variable
Now the only thing is to do is call the system and println function
BONUS - the main function is calling the calculateScore function twice

BONUS2 void = no data is being returned
But we have changed from void to int in our calculateScore function
Now because we now have a return type of integer we have to add additional code of "return finalScore" and
also we have to include "return -1"
In programming terms Negative 1 is conventionally used to indicate an error
In searching algorithms negative 1 indicates an invalid value or a value not found
so that is the reason we are using negative 1 here
also another reason we are using return -1 is because if gameOver is false
it would ignore the if statement and cycle down to the else and output an error
we can also put the return -1 code outside of the if statement and take out the else and just write return -1;



*/

//-------------------------------------------------


    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Rohit", highScorePosition);

    highScorePosition =calculateHighScorePosition(900);
    displayHighScorePosition("Shrestha", highScorePosition);

    highScorePosition =calculateHighScorePosition(400);
    displayHighScorePosition("Oi", highScorePosition);

    highScorePosition =calculateHighScorePosition(50);
    displayHighScorePosition("io", highScorePosition);


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");


    }

    private static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


}

psvm

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int XX,YY,ZZ;
        XX=kiloBytes;
        if(kiloBytes<0)
            System.out.println("Invalid Value");
        else{
            YY= XX/1024;
            ZZ=XX%1024;
            System.out.println(XX+" KB ="+YY+ " MB "+"and "+ZZ+" KB");
        }

    }
}


































