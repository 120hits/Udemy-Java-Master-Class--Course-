package com.RS;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("this is value one");
                break;
            case 2:
                System.out.println("this is value two");
                break;
//      we grouped all the cases in one line so it is much easier when we have multiple values
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("its actually was a " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
//switch exercise 1
        char charValue = 'a';

        switch (charValue) {
            case 'a':
                System.out.println("a was found");
                break;
            case 'b':
                System.out.println("b was found");
                break;
            case 'c':
            case 'd':
            case 'e':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("could not find A, b, c, d, or e");
                break;

        }
//using stings in a switch statement
        String month = "jAnuary";
//      .toLowerCase() is a method that is part of the string class
//      it helps us pinpoint on what are we looking for and perform some functionality
//      this method makes our string month value convert into a lower case so that our case values can be chosen

        switch (month.toLowerCase()) {
//          inorder for the .toLowerCase to work the case "january" has to be lower case or else it wont work
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("june");
                break;
            default:
                System.out.println("not sure");
                break;
        }


    }
}

//switch is good to use when you are testing the same variables and you want to test different values for that variable
//break is required inorder for the switch statement to work properly



