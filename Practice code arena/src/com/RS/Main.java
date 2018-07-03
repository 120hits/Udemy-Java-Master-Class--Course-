package com.RS;

public class Main {

    public static void main(String[] args) {

        Account rohitsAccountt = new Account(0.0);


        System.out.println(rohitsAccountt.getBalance());


        rohitsAccountt.deposit(100.0);
        rohitsAccountt.withdrawal(50.0);

    }
}
