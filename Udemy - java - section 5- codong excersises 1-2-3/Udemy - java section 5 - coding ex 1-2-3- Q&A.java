/*
MegaBytes Converter 

write a method called printMagaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaning kilobytes from the kilobytes parameter

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents the original value kiloBytes. YY represents the calculated 
megabytes. ZZ represents the calculated remaining kilobytes.

if the parameter kiloBytes is < 0 then print instead the text "Invalid Value".

ex: printMegaBytesAndKiloBytes(2050) should print "2050 KB = 2 MB and 2 KB"
TIP be careful about spaces in the printed message 
TIP use the remainder operator
TIP 1 MB = 1024 KB

NOTE the printMegaBytesAndKiloBytes method needs to be defined as public static like we have been doing so far in the course 

NOTE do not add a main method to solution code

NOTE the udemy code area is already auto class so when you do it in the itelliJ create a new class file and put your code in it.

*/

public class MegaBytesConverter {
  public static void printMegaBytesAndKiloBytes(int kiloBytes){
      int XX, YY, ZZ;
      XX = kiloBytes;
      YY = XX/1024;
      ZZ = XX%1024;
          
      if(kiloBytes < 0){
          System.out.println("Invalid Value");
      }else{
         
          System.out.println(XX+" KB = "+YY+ " MB "+"and "+ZZ+" KB");
      }
  }
}

//----------------------------------------------------------------------------Q2------------------------------
/*
BARKING DOG
we have a dog that likes to bark. we need to wake up if the dog is brking at nightQ
write a method bark that has 2 parameters 

1st parameter should be type boolean and be named barking it represents if our dog is currently barking

2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has valid range of 0-23

we have to wake up if the dog is braking before 8:00am or after 2:00 hours so in that case return true

In all other cases return false. if the hourOfDay parameter is less than 0 or greater than 23 return false

ex of input/output
-bark(true,1); should return true
-bark(false,2); should return false since the dog is not barking
-bark(true,8); should return false, since its not before 8:00am
-bark(true,-1); should return false because the hourOfDay parameter needs to be in range 0-23

TIP use an if else statement with multiple conditions 

NOTE the bark method needs to be defined as public static like we have been doing so far in the course

NOTE do not add a main method to solution code


*/




public static boolean bark(boolean barking, int hourOfDay) {

    if ((hourOfDay < 8 || hourOfDay > 22) &&
     (hourOfDay >= 0 && hourOfDay <= 23 && barking)
        return true;
    else
        return false;
}

//----------------------------------------------------------------------Q3-----------------------------------------
/*
Leap Year Calculator 

write a method isLeapYear with a parameter of type int name year

the parameter needs to be greater than or equal to 1 and less than or equal to 9999

if the parameter is not in that range return false

otherwise, if it is in the valid range, calculate if the year is leap year is a leap year and return true if it is, otherwise return false

a year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400

ex of input/output
isLeaoYear(-1600); should return false since parameter is not in the range (1-9999)
isLeapYear(1600); should return true since 1600 is leap year
isLeapYear(2017); should return false since 2017 is not a leap year 
isLeapYear(2000); should return true because 2000 is a leap year 

NOTE this isLeapYear method needs to be defined as public static like we have been doing so far in the course 

NOTE do not add a main method to solution code
*/

public static boolean isLeapYear(int year) {
    if (year <= 1 || year >= 9999) {
        return false;
    } else if ((year % 4 == 0) &&
     (year % 100 != 0) ||
      (year % 400 == 0)) {
        return true;
    } else {
        return false;
    }
}

//------------------------------------------------------------S5 - coding exercise 4 : Area Caculator-------------------------------------------------------

/*write a method named area with one double parameter named radius

the method needs to return a double value that represents the area of a circle 

if the parameter radius is negative then return -1.0 to represent an Invalid value 

write another overloaded method with 2 parameters x and y (both doubles) where x and y represent the sides of a rectangle 

the method needs to return an area of a rectangle 

if either or both parameters if/are negative return -1.0 to indicate an invalid value

  for the formulas and PI value please check the tips below

Examples of input/output 

area(5.0); should return 78.53975
area(-1); should return -1 since the parameter is negative
area(5.0,4.0); should return 20.0(5*4=20)
area(-1.0,4.0); should return -1 since first the parameter is negative

TIP formula for calculating a circle area is radius * radius * PI. PI = 3.14159
TIP formula for calculating a rectangle area is x*y
Note : the radius methods needs to be defined as public static like we have been doing so far in the course 

Note : do not add a main method to your solution code

*/

public class AreaCalculator {
  
     public static double area(double radius){
         if(radius < 0){
             return -1;
         }
        
         double circleArea = radius * radius * 3.14159;
         return circleArea;
         
     }
     public static double area(double x, double y){
         if(x < 0 || y < 0){
             return -1;
         }
         double recArea = x * y;
         return recArea;
         
     }
}

//-----------------------------------------------S6 - coding exercise 5 - number in word -------------------------

Number in word

write a method called printNumberInWord

this method should have one parameter called number which a whole number (type int)

the method needs to print "zero" if the number parameter is passed with the value of 0
the methods needs to print "one" if the number parameter is passed with the value of 1 and up to 9
if the nmber parameter has any other value than 0-9 then the method shoud print "other"

you can use an if else statement or a the switch statement to solve this challenge the choice is yours

Note the printNumberInWord method needs to be defined as public static like we have been doing so far in the course 

NOTE do not add a main method to soulution code, only in udemy, it is already intereyted 

public class NumberInWord {
    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            
            case 1:
                System.out.println("ONE");
                break;
            
            case 2:
                System.out.println("TWO");
                break;
            
            case 3:
                System.out.println("THREE");
                break;
            
            case 4:
                System.out.println("FOUR");
                break;
            
            case 5:
                System.out.println("FIVE");
                break;
            
            case 6:
                System.out.println("SIX");
                break;
            
            case 7:
                System.out.println("SEVEN");
                break;
            
            case 8:
                System.out.println("EIGHT");
                break;
            
            case 9:
                System.out.println("NINE");
                break;
            
            default:
                System.out.println("OTHER");
                break;
        }
            
    }
}


//------------------------------------------s6 coding exercise 7 - sum odd ---------------------------------------

/*
write a method called isOdd with an int parameter and call it number . the method needs to return a boolean.

check that number is > 0 if it is not return false
if number is odd return true otherwise return false
write a second method called sumOdd that has 2 int parameters start and end , which represent a range of numbers 

the method should use a for loop to sum all odd numbers in that range including the end and return the sum
it should call the method isOdd to check if each numbers is odd

the parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0

if those conditions are not satisfied return -1 from the method to indicate invalid input 

Example input/output
sout(1,100)); //should print 2500
sout(-1,100)); //should print -1
sout(100,100)); //should print 0
sout(100,-100)); //should print -1

TIP use the remainder operator to check if the number is odd
NOTE both methods needs to be defined as public static like we have been doing so fat in the course 
NOTE do not add a main method to solution code


*/

public class SumOddRange {
public static boolean isOdd(int number){
    if((number <=0) || (number % 2 ==0)){
        return false;
    }
    return true;
}


public static int sumOdd(int start, int end){
    if((end < start) || (start <= 0) || (end <= 0)){
        return -1;
    }
    int count = 0;
    for(int i = start; i<= end; i++){
        if((isOdd(i) == true)){
            count += i;
        }
    }
    return count;
}
}


//------------------------------s6 - coding exercise 8 - number palindrome------------

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

public static void main(String[] args) {
        System.out.println("yes this is an palindrome " + isPalindrome(1221));
    }


    public static boolean isPalindrome(int number){
        int num = number;
        int reverse = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        return number == reverse;
    }

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