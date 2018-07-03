package com.RS;

public class Main {

    public static void main(String[] args) {
        System.out.println("answer = " + sumFirstAndLastDigit(121));
    }

    public static int sumFirstAndLastDigit(int number){
        int num = number;
        int lastDigit = num % 10;
        while(num >= 10){
            num /= 10;
        }
        if(num < 0){
            return -1;
        }
        return num + lastDigit;
    }
}


/*
* write a method named sumFirstAndLastDigit with one param of type int called number
*
* the method needs to find the first and last digit of the param number passed to the method,
* using a loop and return the sum of the first and last digit of that number
*
* if the number is negative then the methods needs to retirn -1 to indicate an invalid value
*
* ex in/out put
* sumFistAndLastDigit(252); should return 4 first digit is 2 and last is 2 which gives us 2+2 and the sum is 4
*sumFistAndLastDigit(0); should return 0, first and last is 0 since we only have 1 digit which gives us 0+0=0
* sumFistAndLastDigit(257); should return 9 , 2 + 7 = 9
* sumFistAndLastDigit(-1); should return -1 because the param is negative
*
*
* */

/*my thought process

1 - find first digit of the param # passed to the method
2- find the last digit of the parm # passed to the method
3- use the loop and return the sum
4- the sum of the first and last digit of the number
5- if # = negative, return -1, indicates invalid value
* */

/*my thought process
* 1- int num = number;
* 2- int lastDigit = num % 10; //getting the remainder
* 3- while(num >= 10){
* num /= 10;
* }
* 4- return num + lastDigit;
* 5- if(num < 0){return -1;}
* }//end
* */