package com.RS;

public class Main {
//  we are using a constant here to display the message if the user inputs invalid values into our calling method
//  ex of invalid user input system.out.println(getDurationString(65, 99999))
//  constant function name is always all UPPER_CASE
//  constant includes also a final
//  constants are helpful for
//  repeated output strings like the return for the invalid user output &
//  one constant can be used by both the 2 methods
    private static  final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 34)); //first answer
        System.out.println(getDurationString(3945L)); //second answer


    }

    //private and use long
    private static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0 || seconds < 0) || seconds > 59) {
//          gonna redirect the return from output  return "invalid value" to
//          a constant string called INVALID_VALUE_MESSAGE
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";


    }
//    write a overloaded method and make it a private function with one param called seconds
//    even though we are repeating the same String in both methods which is an invalid string
//    for the time being that is ok
//    later in the course we will learn how to deal situations like this and use constants
//    right now just focus on the functionality of the code and optimize it


    private static String getDurationString(long seconds) {
        if (seconds < 0) {
//          like the top return we have changed it to the const string return called INVALID_VALUES_MESSAGE
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
//        now all we need to do is call the first method instead of repeating the process by
//     like before we are using the return feature and call method in one line
        return getDurationString(minutes, remainingSeconds);


//      if you done this with the two line then you need to
//       save the value of the call to getDurationString into a string
//      ex
//      string x = getDurationString; //in one line
//      return x;
//       and printed it out and returned that variable on another line that's fine

    }

//
}


