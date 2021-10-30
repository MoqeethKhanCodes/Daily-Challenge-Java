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
        // Using setters
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
        BankAccount moqeeths1Account = new BankAccount("1548942",15154214.82,"John Doe", "acs@xyz.com", "9425415421");
        System.out.println(moqeeths1Account.getAccountNumber());
        System.out.println(moqeeths1Account.getCustomerName());
        System.out.println(moqeeths1Account.getBalance());
        System.out.println(moqeeths1Account.getEmailId());
        System.out.println(moqeeths1Account.getPhoneNumber());

        System.out.println("----------------------------------------");

        //Ls 80
        BankAccount ahmedscount = new BankAccount("Ahmed", "ahmed@gmail.com", "12354");
        System.out.println(ahmedscount.getPhoneNumber() + " name " + ahmedscount.getCustomerName());

        System.out.println("-----------VIP------------");

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Ahmed", 25000.00);
        System.out.println(customer2.getName());


        VipCustomer customer3 = new VipCustomer("Moqeeth ", 248000, "moqeeth@email.com");
        System.out.println(customer3.getName());





    }
}
