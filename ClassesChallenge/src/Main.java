public class Main {
    public static void main(String[] args) {
        Account userAccount = new Account();
        userAccount.setAccountNumber("1235564");
        userAccount.setAccountBalance(100);
        userAccount.setCustomerName("K");


        userAccount.withdrawFunds(10);
        userAccount.depositFunds(100);
        userAccount.withdrawFunds(12.1);

        System.out.println(userAccount.getAccountBalance());
    }
}