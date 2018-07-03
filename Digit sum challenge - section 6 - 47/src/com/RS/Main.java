package com.RS;

public class Main {

    public static void main(String[] args) {

        System.out.println("the sum of the digits in the number 125 is " + sumDigits(125));


    }


//        private static int sumDigits(int number){
//            int sumOfAllDigits = 0;
//            if(number >= 10){
//                return sumOfAllDigits;
//            }else{
//                return -1;
//            }
//            if((number % 10 == 0) || (number <= 9)){
//                return -1;
//            }else{
//                return  sumOfAllDigits;
//            }
//        }


        public static int sumDigits(int number){
        if(number < 10){
            return  -1;
        }
        int sum = 0;
//      to get the least significant number from our value
        //125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
//          the reason number is > 0 is bcuz we have to divide the number by 10 to drop the digit
//          once we dropped all the digits the number will be 0
//          so we want to keep looping until the number is greater than 0
//          ex  125/10 = 12 >> 12/10 = 1 >> 1/10 = 0, when we get to 0 the while loop will exit
            while(number > 0){
                //extract the least significant digit
                int digit = number % 10;
//              add the digit to the sum
                sum += digit;

                //drop the least significant digit
                number /= 10; // same as number = number / 10;
            }
                return sum;

        }

}
