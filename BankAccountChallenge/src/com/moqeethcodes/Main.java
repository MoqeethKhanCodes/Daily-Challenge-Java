package com.moqeethcodes;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
	// Create a new class for a bank account
//        Create fields for the account number,balance, customer name, email and phone number.
//        Create Getters and Setters for each fields.
//        Create two additional methods
//                1. To allow the customer to deposit funds(this should increment balance field)
//                2. To allow the customer to withdraw funds. This should deduct from the balance field,
//                   but not allow the withdrawal to complete if their are insufficient funds.

        //Replaced by Constructor
        /*moqeethsAccount.setAccountNumber(123456);
        moqeethsAccount.setBalance(0.00);
        moqeethsAccount.setCustomerName("Moqeeth Khan");
        moqeethsAccount.setEmailId("acb@xyz.com");
        moqeethsAccount.setPhoneNumber("91154841215");*/

        //OR
        //Using Default Constructor
        BankAccount moqeethsAccount = new BankAccount();
        moqeethsAccount.withdrawFunds(100.0);

        moqeethsAccount.depositFunds(50.0);
        moqeethsAccount.withdrawFunds(100.0);

        moqeethsAccount.depositFunds(51.0);
        moqeethsAccount.withdrawFunds(100);
        System.out.println(moqeethsAccount.getCustomerName());

        System.out.println("-----------------------------------------");

        //OR

        //Using Overloaded Constructor
        BankAccount moqeeths1Account = new BankAccount(1548942L,15154214.82,"John Doe", "acs@xyz.com", "9425415421");
        System.out.println(moqeeths1Account.getAccountNumber());
        System.out.println(moqeeths1Account.getCustomerName());
        System.out.println(moqeeths1Account.getBalance());
        System.out.println(moqeeths1Account.getEmailId());
        System.out.println(moqeeths1Account.getPhoneNumber());
    }
}
