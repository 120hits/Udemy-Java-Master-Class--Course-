package com.RS;

public class Bank_account {
    private int accountNumber;
    private int balance;
    private int phoneNumber;
    private String customerName;
    private String email;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public static int balace(int balance) {
        int deposit = balance;
        deposit += balance;
        return deposit;
    }

    public static int balance(int balance) {
        if (balance < 0) {
            System.out.println("invalid");
        }
        int withDraw = balance;
        withDraw -= balance;
        return withDraw;

    }

}
