// Define the Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Implement the SavingsAccount class
class SavingsAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Implement the CurrentAccount class
class CurrentAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Main class to test the implementation
public class InterfaceBank {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        Account savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Create a CurrentAccount object
        Account currentAccount = new CurrentAccount();
        currentAccount.deposit(2000);
        currentAccount.withdraw(1000);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
