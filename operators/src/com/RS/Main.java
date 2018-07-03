package com.RS;

public class Main {

    public static void main(String[] args) {


        boolean isAlien = false;
        if(isAlien){
            System.out.println("it is not an alien");
        }

        int topScore = 80;
        if(topScore < 100)
            System.out.println("almost there dont give up");

        int secondTopScore = 81;
        if((topScore > secondTopScore ) && (secondTopScore <= 90))
            System.out.println("this will not print out");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("this will not print out");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar is true?");
//
        double v1 = 20;
        double v2 = 80;
        double totV1V2 = (v1 + v2) * 25;
        System.out.println(totV1V2);
        double remainder = totV1V2 % 40;
        System.out.println(remainder);
        if(remainder <= 20)
            System.out.println("Total was over the limit");
//        yes my first quiz that i answered correctly!!!
    }
}
