package mypackage;

public class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " Successful. New Balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if(this.balance >= amount && amount > 2000) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance. Withdrawal of " + amount + " Unsuccessful.");
        }
    }
}
