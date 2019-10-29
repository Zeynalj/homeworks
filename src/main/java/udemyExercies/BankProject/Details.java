package udemyExercies.BankProject;

import java.util.Scanner;

public class Details {

    private int accountNumber;
    double balance;
    private String customerFullName;
    private String email;

    public Details(int accountNumber, double balance, String customerFullName, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerFullName = customerFullName;
        this.email = email;
    }

    public void fullMessage() {
        System.out.println(
                "Customer named " + this.customerFullName + " with the account number of " + this.accountNumber
                        + " has a balance of " + this.balance + " . A notification about operations will send to " + this.email);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. The current balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Withdrawal could not proceeded because only " + this.balance + " is available");
        }
        else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " proceeded. The current balance is " + this.balance);
        }
    }

    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getCustomerName() { return customerFullName; }
    public String getEmail() { return email; }

    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setCustomerName(String customerName) { this.customerFullName = customerName; }
    public void setEmail(String email) { this.email = email; }




}
