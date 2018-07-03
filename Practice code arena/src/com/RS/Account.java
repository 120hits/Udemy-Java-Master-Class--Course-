package com.RS;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount +
                " has been successfully been added into your account. Your new balance is $" + this.balance);
    }


    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Your withdrawal amount of $" + withdrawalAmount + "could't be processed ");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Successfully withdrawal amount of $" + withdrawalAmount + " has been completed" +
                    " Your new balance is $" + this.balance
            );
        }
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
