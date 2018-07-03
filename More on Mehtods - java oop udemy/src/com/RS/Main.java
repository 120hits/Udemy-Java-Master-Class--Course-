package com.RS;

public class Main {

    public static void main(String[] args) {

//      the int var having the same name as the param of the function is really annoying but the content creator says its fine
//      this is one of those coding rule, some people say that its fine others say its bad coding practice
//      for the c++ aspect people say that this rule is ok because something about local and member variable scope
//        when you apply for a job ask them what best works for them, it could be to apply or !apply this rule.
        int highScorePosition = calculateHighScorePosition(1500);

        displayHighScorePosition("Rohit", highScorePosition);

        highScorePosition =

                calculateHighScorePosition(900);

        displayHighScorePosition("Shrestha", highScorePosition);

        highScorePosition =

                calculateHighScorePosition(400);

        displayHighScorePosition("Oi", highScorePosition);

        highScorePosition =

                calculateHighScorePosition(50);

        displayHighScorePosition("io", highScorePosition);


        public static void displayHighScorePosition (String playerName,int highScorePosition){
            System.out.println(playerName + " managed to get into position "
                    + highScorePosition + " on the high score table");


        }

        private static int calculateHighScorePosition ( int playerScore){
            if (playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500) {
                return 2;
            } else if (playerScore >= 100) {
                return 3;}

                return 4;


        }
    }
