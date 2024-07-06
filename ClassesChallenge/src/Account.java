public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;

    //constructor chaining with constructor overloading and default constructor
    public Account() {
        System.out.println("Empty Constructor have been invoked");
    }

    public Account(String accountNumber) {
        this(accountNumber, 0.0, null, null);
    }

    public Account(String accountNumber, double accountBalance) {
        this(accountNumber, accountBalance, null, null);
    }

    public Account(String accountNumber, double accountBalance, String customerName) {
        this(accountNumber, accountBalance, customerName, null);
    }

    public Account(String accountNumber, double accountBalance, String name, String email) {
        System.out.println("Account Constructor with parameter is called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        customerName = name; // Valid only if local variable doesn't match with instance field.
        customerEmail = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void depositFunds (double amountToAdd) {
        this.accountBalance += amountToAdd;
        System.out.println("Deposit of $" + amountToAdd + " made. New Balance is $" + accountBalance);
    }
    public void withdrawFunds (double amountToDeduct) {
        if(this.accountBalance > 0
                && this.accountBalance - amountToDeduct >= 0){
            this.accountBalance -= amountToDeduct;
            System.out.println("Withdrawal of $" + amountToDeduct + " made. New Balance is $" + accountBalance);
        }else {
            System.out.println("Insufficient Funds! \nYour balance is " + accountBalance);
        }
    }

}
