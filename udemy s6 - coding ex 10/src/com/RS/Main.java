package com.RS;

public class Main {

    public static void main(String[] args) {
//        System.out.println(numberToWords(121));
    }

//    public static String numberToWords(int number) {
//        int reversedNumber = reverse(number);
//        int count = getDigitCount(number);
//        int countReversed = getDigitCount(reversedNumber);
//
//        if (number < 0) {
//            System.out.println("invalid value1");
//        }
//        while (reversedNumber !=0)
//            int lastDigit = reversedNumber % 10;
//        reversedNumber /= 10;
//        switch (number) {
//            case 0:
//                System.out.println("zero");
//                break;
//            case 1:
//                System.out.println("zero");
//                break;
//            case 2:
//                System.out.println("zero");
//                break;
//            case 3:
//                System.out.println("zero");
//                break;
//            case 4:
//                System.out.println("zero");
//                break;
//            case 5:
//                System.out.println("zero");
//                break;
//            case 6:
//                System.out.println("zero");
//                break;
//            case 7:
//                System.out.println("zero");
//                break;
//            case 8:
//                System.out.println("zero");
//                ;
//                break;
//            case 9:
//                System.out.println("zero");
//                break;
//        }
//        for(int difference = count - countReversed; difference > 0; difference--){
//            System.out.println("zero");
//        }
//        reversedNumber /=10;
//    }
//
//    public static int reverse(int number){
//        int reverse = 0;
//        while (number != 0){
//            int lastDigit = number % 10;
//            reverse = (reverse * 10) + lastDigit;
//            number /=10;
//        }
//        return reverse;
//    }
//
//    public  static int getDigitCount(int number){
//        int digitCount = 0;
//        if(number < 1){
//            return  -1;
//        }
//        while (number != 0_) {
//
//            number /=10;
//            digitCount++;
//        }
//        return digitCount;
//    }
public class NumberToWords {
    public static void numberToWords(int number)
    {
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        Hashtable tabIndex = new Hashtable();
        String[] tabWords = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i=0; i<tabWords.length; i++){
            tabIndex.putIfAbsent(i, tabWords[i]);
        }
        String strNumber = String.valueOf(number);
        char[] numTab = strNumber.toCharArray();
        for(int i=0; i < numTab.length; i++){
            Integer key = Integer.valueOf(String.valueOf(numTab[i])).intValue();
             /*if(tabIndex.containsKey(key)){
             System.out.println(tabIndex.get(numTab[i]));
             }*/

            System.out.println(tabIndex.get(key).toString());

        }
    }
}
}
