public class Main {
    public static void main(String[] args) {
        Account userAccount = new Account();
        userAccount.setAccountNumber("1235564");
        userAccount.setAccountBalance(100);
        userAccount.setCustomerName("K");
        userAccount.setEmail("k@email.com");

        userAccount.withdrawFunds(10);
        userAccount.depositFunds(100);
        userAccount.withdrawFunds(12.1);

        System.out.println("--------------------------------");

        Account userAccount1 = new Account();
        userAccount1.setAccountNumber("8568564255");
        userAccount1.setAccountBalance(0);
        userAccount1.setCustomerName("M");
        userAccount1.setEmail("M@email.com");
        System.out.println(userAccount1.getAccountBalance());

        userAccount1.withdrawFunds(10);
        userAccount1.depositFunds(100);
        userAccount1.withdrawFunds(12.1);
    }
}