package com.RS;

public class Main {

    public static void main(String[] args) {
        System.out.println("yes this is an palindrome " + isPalindrome(1221));
    }


    public static boolean isPalindrome(int number){
        //int palindrome is changed to int num
        int num = number;
        int reverse = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        return number == reverse;
        /*
        * you have to return boolean since your num variable is modified and is not original value that would always return false,
         * you have to compare original value with reversed value.
        * */
    }

}

/*
write a method called isPalindrome with one int parameter called number

the method needs to return a boolean

it should return true if the number is a palindrome number otherwise it should return false

check the tips below for more info about palindromes

ex in/out put
isPalindorme(-1221); should return true
isPalindorme(707); should return true
isPalindorme(1122122); should return false

tip what is a palindrome number? a palindrome number is a number which when reversed is equal to the original number
for ex 121 1221 1001

logic to check a palindrome number

declare and initialize another variable to store the reverse of a number for ex reverse = 0;

extract the last digit given number for performing modulo division
store the last digit to some variable say lastDgit = num % 10;
increase the place value of reverse by one
to increase place value multiply reverse variable by 10 ex reverse *= 10;
add lastDigit to reverse
since last digit of num is processed, remove last digit of num, to remove last digit divide num by 10
repeat steps until num is not equal to( greater than) zero

a while loop would be good for this coding exercise

tip - be careful with reversing a number you will need a parameter for comparing a reversed number with the starting number(parameter)

note- the isPalindrome method needs to be defined as public static like always

*/

/*
* my thought process in the white board
*
* isPalindrome(int number)
* -returns a boolean
* -return true if its is an palindrome number, else false
*
* int reverse = 0;
* int lastDigit = number % 10;
*
* reverse++;
* reverse *= 10;
* reverse += lastDigit;
*
* ---now trying to fit it together-------
* public main(){
*   System,out.println("yes this number result = " + isPalindrome(1221));
* }
* public static boolean isPalindrome(int number){
*   int reverse = 0;
*   int palindrome = number;
*   while(palindrome != 0){
*       int lastDigit = palindrome % 10;
*       reverse *= 10;
*       reverse += lastDigit;
*       palindrome /= 10;
*   }
*       return number == reverse;
*
* */