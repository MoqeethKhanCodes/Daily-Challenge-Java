public class Main {
    public static void main(String[] args) {

        // Using setter or default constructor
        Account userAccount = new Account();
        userAccount.setAccountNumber("1235564");
        userAccount.setAccountBalance(100);
        userAccount.setCustomerName("K");
        userAccount.setCustomerEmail("k@email.com");

        userAccount.withdrawFunds(10);
        userAccount.depositFunds(100);
        userAccount.withdrawFunds(12.1);

        System.out.println("--------------------------------");

        Account userAccount1 = new Account();
        userAccount1.setAccountNumber("8568564255");
        userAccount1.setAccountBalance(0);
        userAccount1.setCustomerName("M");
        userAccount1.setCustomerEmail("M@email.com");
        System.out.println(userAccount1.getAccountBalance());

        userAccount1.withdrawFunds(10);
        userAccount1.depositFunds(100);
        userAccount1.withdrawFunds(12.1);


        // Using Constructor
        Account userAccount2 = new Account("945564124",0.0,"userAccount2","jane@email.com");

        userAccount2.depositFunds(100000);
        userAccount2.withdrawFunds(100);

        System.out.println("-----------------------------\nConstructor Chaining : \n");
        // Constructor Chaining

        //Zero Args Constructor
        Account userAccount4 = new Account();
        System.out.println("Zero Args Constructor");
        printUserInfo(userAccount4);

        //One Arg Constructor
        Account userAccount5 = new Account("54648464254");
        printUserInfo(userAccount5);

        //Two Args Constructor
        Account userAccount6 = new Account("54648464254", 1000);
        printUserInfo(userAccount6);

        //Three Args Constructor
        Account userAccount7 = new Account("54648464254", 1000,"userAccount7");
        printUserInfo(userAccount7);

        //All Args Constructor
        Account userAccount8 = new Account("54648464254", 1000,"userAccount8", "userAccount8@email.com");
        System.out.println("All Args Constructor");
        printUserInfo(userAccount8);

    }

    public static void printUserInfo(Account userAccount) {

        System.out.println("AccountNumber : " + userAccount.getAccountNumber()
                + "\nAccountBalance : " + userAccount.getAccountBalance()
                + "\nCustomerName : " + userAccount.getCustomerName()
                + "\nCustomerEmail : " + userAccount.getCustomerEmail());
    }
}