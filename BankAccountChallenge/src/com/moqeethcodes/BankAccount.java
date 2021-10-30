package com.moqeethcodes;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailId;
    private String phoneNumber;

    //Constructor
    public BankAccount(){
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String emailId, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String emailId, String phoneNumber) {
        this("99999",100.55, customerName, emailId, phoneNumber);
        // acc no. and balance not getting updated
        /*this.customerName = customerName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;*/
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Balance = " + this.balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("Only " + this.balance + " Withdrwal Not Processed");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Balance = " + this.balance);
        }
    }

}
