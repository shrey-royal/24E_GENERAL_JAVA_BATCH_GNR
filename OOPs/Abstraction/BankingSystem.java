/*
Scenario 3: Banking System
Develop an abstract class called "Account" with abstract methods like "deposit" and "withdraw." Implement derived classes like "SavingsAccount" and "CurrentAccount" that provide specific implementations for these abstract methods.
*/

abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        if(balance < 0) {
            System.out.println("Funds Overdrawn");
        }
        return balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.balance += amount;
        System.out.println(amount + " deposited into savings account.");
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount >= 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn from savings account.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.balance += amount;
        System.out.println(amount + " deposited into current account.");
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount >= -10000) {
            balance -= amount;
            System.out.println(amount + " withdrawn from current account.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(10000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(2000);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount(20000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(4000);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}

//Tasks: 1, 5, 8, 10