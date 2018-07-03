package com.RS;

public class Main {

    public static void main(String[] args) {

//	objects are a way of storing multiple pieces of data and methods who act on a single data type

//        Array - String - Scanner - ArrayList

//        these are all already objects

//        ------------------------EX an Array of ints-----------------------------------

//        ----------------------int[] x = new int[3];----------------------------------


//        the [computer separates] out a [box and memory]

//        for the [reference] to where that code is [actually gonna store that data]

//        then when you [PASS] this around as a [PARAMETER]

//        your [passing] the [reference] [not] the [actual data]

//        this is called the [REFERENCE SEMANTICS]

//        reason is [objects] are [big in memory] and it [doesn't] want to [keep copying them around]

//        [Key point] is you always need to be paying attention to when you're

//        [actually copying] the [reference] to [an object] or [the objects data itself]


//-------------------------Objects use methods to function----.length()---.nextInt()--------
//        "hello".length();
//        input.nextInt();


//-------------------------NULL in an object---------------------------------

//        null means no object and essentially its the 0 value for an object
//        just like 0 is the 0 value for int or 0.0 is the 0 value for double
//        NULL is the 0 value for all different types of objects
//        if we were making a new array of chars, we know that it would store the 0 value for care


//        ------------------EX--lets make an String array, where would null fit in?--

//        --------------String[] strArray = new String[5];--------------------

//      well null automatically filled into the array, meaning there is an object but its an empty object
//      ex - an object can be here but there is none here and now
//      this is an important point because chances are you are gonna run into an exception called
//        ***Null pointer exception***
//        a Null Pointer Exception is when you try to perform a method calling on a object that is null

/*
*
primitive	example	                        description
int	        int a = 1;	                    32-bit signed whole number
double	    double b = 1.0;	                64-bit real number
boolean	    boolean c = true;	            logical data type can only be true or false
char	    char d = 'x';	                stores a single unicode character
byte	    byte e = 2;	                    8-bit signed whole number
short	    short f = 3;	                16-bit signed whole number
long	    long g = 3000000000;	        64-bit signed whole number
float	    float h = 2.0;	                32-bit real number
*
*
*
* */

// Java stores all of the primitive data types directly in memory
// when you copy a primitive data type only the data is copied thus creating a separate variable
//        that holds the same value
//        there are short cuts to update the primitive value like ++; +=
// OBJECTS  are larger amount of data than primitives thus java stores them in a different memory location
//        for the data in the actual variable as a "reference"
// OBJECTS CANT USE BASIC MATH OPERATIONS OR SHORT CUTS
// OBJECTS RELY ON METHODS PROVIDED BY THE OBJECT - ex - "string".equals("string") or scanner.nextInt()
//
//


/*
* each primitive has its own zero value - int x;
* java uses the zero value as a stand in when creating  a place in memory for a primitive before you actually give it a value to store
*
* all objects types share a single zero value called null
*
* null means no object vs empty object
*
*Null means literally "no object", which is different from an empty object.
 *  For example, if you try to use the String's length method on a null string you get an error.
 *  However, calling length on an empty string is perfectly valid.
*
String temp; // if you don't initialize a String it defaults to null
temp.length(); // causes a "Null Pointer Exception"
String empty = "";
empty.length(); // returns 0;
*
*
*

*
*
*
*
*
*
*
* */
































    }
}
