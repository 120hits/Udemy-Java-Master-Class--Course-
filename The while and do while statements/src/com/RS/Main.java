package com.RS;

public class Main {

    public static void main(String[] args) { //added the closing } to make our challenge code work
//        int count = 1;
//        while(count != 6){
//            System.out.println("count value is " + count);
//            count ++;
//        }
//
//        System.out.println("****************************");
//
//        /* similar style of while loop stated above into a for loop
//        for(int  i = 1; i < 7; i++){
//            System.out.println("count value is " + i);
//        }*/
//
//
//        count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }
//
//        System.out.println("*****************************");
//        count = 1;
////      the do while will at least execute it once
//        do{
//            System.out.println("count value was " + count);
//            count++;
////          we can also incorporate a break statement
////          if we comment everything except this chuck of code here
////          we would get the output of count value was till the number 100
//            if(count >100){
//                break;
//            }
//        }while (count != 6);
//

        /*
         * create a method called isEvenNumber that takes a parameter of type int
         * its purpose is to determine if the argument passed to the method is
         * an even number or not
         * return true if an even number , otherwise return false;
         *
         * */
//        this is the main method section
//     tim initially put the number 4 to start off but that doesnt matter bcuz the
//     increment number++, gets incremented as the first statement and go and finish off
//     up to the var finishedNumber
//        int number = 4;
////      number++ now checks 5 and its false so next while loop checks 6, eyy now if and continue is overridden
////      and sout will print out the even number
//        int finishedNumber = 20;
////      stops the output until number has reached number 20
////      we are testing to see if it is an even number or not a even number
//        while (number <= finishedNumber) {
//            number++;
////          test code to see if thats a even number and not a odd number
//            if (!isEvenNumber(number)) {
////  the reason we used continue instead of the break is that both do disrupt the code and
////  what ever the code below is, it will by pass the print statement and if there is more
////  statements all code would be bypassed and continue will go back to the start of the loop instead
////  so the loop gets finished and goes back and starts on the next number again
////  Continue allows the loop to continue but it will not process anymore code any further down in the while loop
////  it just goes right straight to the end of the loop and then back on and start from the next number
////  if appropriate and if appropriate while condition is actually still valid and in our case if the value is 20 or less
//
//                continue;
//            }
//            System.out.println("even number " + number);

        /*
        modify the while code above
        make it also record the total number of even numbers it has found
        and break once 5 are found and at the end display the total number of even numbers found
        * */

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0; //added to the modified code

            while (number <= finishNumber) {

                number++;
                if (!isEvenNumber(number)) {
                    continue;
                }
                System.out.println("even number " + number);
//              modded code begins here + with the int evenNumbersFound = 0;
                evenNumbersFound++;
                if(evenNumbersFound >= 5){
                    break;
                }
            }
            System.out.println("total even numbers found = " + number);




        }//end for main method




    public static boolean isEvenNumber(int number) {
//            number % 2 == 0 means that there are no remainder
        if ((number % 2) == 0) {
            return true;
//           else if we do get an odd number then return false
        } else {
            return false;
        }
    }


}

/*RECAP---------------------------------------------------------------------------------
* DO WHILE LOOP vs WHILE LOOP
* do{//statement}
* while(condition);
*
* first the do statement code will loop once then the condition will get checked
* While loop checks the condition at the start before executing the block
* Do while loop the code block is executed at once and then the condition is checked
* Be careful with infinite loops
*
* CONTINUE
* the loop will bypass the part of code block that is below the continue keyword
* and continue with the next iteration
*
* BREAK
* with the break we can exit the loop depending on the condition that we are checking
*
* ---WHILE LOOP VS FOR LOOP---------------
* int count = 1;        //init
* while(count <= 5){    //condition
* system.out.println("count= " + count);
* count++;              //increment
* }
*
* for(int i = 0; i <= 5; i++){ //init //condition //increment
* system.out.println("i= " + i);
* }
*--------------WHILE LOOP WITH IF STATEMENTS------------------
* int number = 0; //init
* while(number < 15){
* //check condition 0 < 15 is true
* //number = 1
* //number is = 5 now
* number++; //code will run the loop and this will add +1 to the total as the loop loops
*
* if(number <= 5){ //this if loop will run until it has reached 5
* System.out.println("number= " + number);
* continue; //this makes sure that the if statement is done first
* //next first if has reached 5 then var number will see 6-7-8-9 and finally 10
*
* //when var number has reached 10 it will print out the output
* if(number >= 10){
* System.out.println("breaking at " + number);
* break; //when the second if statement has reached 10 it will break and stop the process
* }
* }
*
*
*
* */