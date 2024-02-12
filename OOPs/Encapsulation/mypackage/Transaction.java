package mypackage;

public class Transaction {
    public void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        if(fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer of " + amount + " from " + fromAccount.getAccountHolderName() + " to " + toAccount.getAccountHolderName() + " Successful.");
        } else {
            System.out.println("Transfer Failed. Insufficient funds in the sender's account.");
        }
    }
}
