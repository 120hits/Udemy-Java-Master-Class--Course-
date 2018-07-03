package com.RS;

public class Main {

    public static void main(String[] args) {

	byte byteVvalue = -127;
	byte byteNewValue = (byte)(byteVvalue/2);
	System.out.println("the value of the new value will be " + byteNewValue);

	byte byteValue = 2;
	short shortValue = 3;
	int intValue = 4;
	long total = 5000L + 10L * (byteValue+shortValue+intValue);
	System.out.println(total);

	float floatValue1 = 5.0f;
	System.out.println(floatValue1);

	float f = 1.000001F;
        System.out.println(f);

    double d = 1.00000000000000001D;
        System.out.println(d);

    double numpounds  = 150;
    double pToK = numpounds * 0.45359237D;
        System.out.println("my weight to kilograms is " + pToK);

    double kilo = 0.45359237;
    double numKilos = 50;
    double kToP = numKilos / kilo;
        System.out.println(kToP);
    }
}

