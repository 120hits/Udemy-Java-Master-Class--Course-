package com.RS;

public class Main {

    public static void main(String[] args) {
//      the 4 sots are for the first for loop example
        System.out.println("$10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        System.out.println("$10.000 at 3% interest = " + calculateInterest(10000.0, 3.0));

        System.out.println("$10.000 at 4% interest = " + calculateInterest(10000.0, 4.0));

        System.out.println("$10.000 at 5% interest = " + calculateInterest(10000.0, 5.0));

//      init = code that is going to be initialized once at the start of the loop
//      termination = at what point we exit the loop
//      increment = an expression thats invoke after each iteration of the loops, each time the loop goes around
        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " hello!"); //loop 0 hello! //loop 1 hello! //loop 4 hello!
        }


//   Ex 1  use the for loop to call the calculateInterest method with the amount of 10000 with the rate of 2-8 and print it

//      if you want your output to have consistent results then add
//      sout("abc" + i + "def" + String.format("%.2f", method(#, i))); //don't forget the dot next to % and 2f
//      in java we don't have to add the (double) next to the output of method call but its good to follow good coding habit
//      "%.2f" will override the output of i to only have 2 ending digits for all the results
        for (int i = 2; i < 9; i++) {
            System.out.println("$10.000 at " + i + "% interest = " +
                    String.format("%.2f", (double) calculateInterest(10000.0, i)));

        }
//      boarder line for the next result answer
        System.out.println("******************************************8");

//  Ex 2    create a for loop that starts form 8 and decreases till 2 for the rate
        for (int j = 8; j >= 2; j--) {
            System.out.println("10k at " + j + "% rate = " + String.format("%.2f", calculateInterest(10000, j)));
        }


//  Ex 3 create a for loop using any range of numbers, determine if the nmber is a prime number using the isPrime method
//       if it is a prime number, print it out and increment a oount of the numebr of prime numerbs found
//       if that count is 3 exit the for loop and use break; statement to exit

//      numbers of prime numbers we have found
        int count = 0;
//      checking the range from 10 to 50 if there are any prime numbers, the answer is yes there are prime numbers inside 10-50
        for (int i = 10; i < 50; i++) {
//          if the for loop i finds a prime number which is true then add it to count variable
//          print out i and indicate that i is a prime number
            if (isPrime(i)) {
                count++;
                System.out.println("number " + i + " is a prime number");
//              creating a test and a break code to stop i till 3 to looking for further prime numbers
                if (count == 3) {
//                  when count has reached 3 output an statement saying the looped have stopped and exit
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }

    } //ex 3 is inside the main method


    //  this code below is going to determine if a pass integer is a prime number
    //  prime numbers can be divided evenly only by 1 or by it self,
    //  another thing is that it has to be a whole number greater than 1

    public static boolean isPrime(int n) {
//      if prime is 1 then return false because prime number can only be divided evenly only by one itself
//      and has to be a whole number greater then 1
        if (n == 1) {
            return false;
        }
//      for loop is starting at 2 because prime numbers has to be greater than one
//      n/2 is short cut because the process we are trying to achieve is
//      numbers that divide into in n so this for loop is only gonna go through and really calculate what it needs to do
//      so no number that is greater than n divided by two is going to divide into n
//      by dividing by 2 we are optimizing this to make sure that we're not actually processing numbers
//      we don't to process when we are checking

//      There is another way to process n/2 by replacing n/2 to
//      i <= (long) Math.sqrt(n);
//      This code actually processes faster than n/2 with with less loops the computer has to run
//      We used long because here it is not required but when the Math.sqrt is used usually there is big numbers
//      To test that Math.sqrt in fact is using less loops we can do sout("looping " + i);
        for (int i = 2; i <= Math.sqrt(n); i++) {
//          n is checking whether n the remainder between n  and i dividing i into n
//          if that is zero then there is no remainder and that means that we found another number that divides evenly
//          into the number that was passed and therefor it can't be a prime number and once we go through the whole loop
//          we can return true because at that point we have determined that it is an prime number
//          Testing to check how many loops does Math.sqrt and n/2 loops fyi n/2 loops 3x more loops than Math.sqrt(n)
            System.out.println("looping " +i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
