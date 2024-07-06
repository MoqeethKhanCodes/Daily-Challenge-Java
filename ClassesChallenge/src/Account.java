public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
