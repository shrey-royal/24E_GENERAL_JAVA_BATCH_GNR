class BankAccount {
    private int accountNo;
    private String accountHolderName;
    private String accountType;
    private double balance;

    {
        accountNo = 123456789;
        balance = 10000000;
    }

    //Getter and Setter Methods
    public int getAccountNo() { //Accessor method
        return this.accountNo;
    }

    // public void setAccountNo(int accountNo) {    //Mutator method
    //     this.accountNo = accountNo;
    // }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return this.balance;
    }

    // public void setBalance(double balance) {
    //     this.balance = balance;
    // }

}

public class Getter_Setter {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountHolderName("Dhyey");
        b.setAccountType("Savings");
        System.out.println("Account No.: " + b.getAccountNo());
        System.out.println("Account Holder Name: " + b.getAccountHolderName());
        System.out.println("Account Type: " + b.getAccountType());
        System.out.println("Balance: " + (int) b.getBalance());
    }
}

/*
Getter and Setter Methods: used to access and update the private data members of any class, anywhere.

Tasks: 

Scenario 1: Vehicle Manufacturing
In a vehicle manufacturing system, encapsulate the internal details of a "Car" class, such as engine specifications and manufacturing processes, to protect sensitive information and provide a controlled interface for interacting with the car.

Scenario 2: Health Tracking Application
In a health tracking application, encapsulate the "User" class's personal health data, such as weight, heart rate, and sleep patterns, to maintain privacy and provide controlled access to the user's health information.

Scenario 3: Online Banking Application
In an online banking application, encapsulate the "Account" class's balance and transaction history to protect the customer's financial information and ensure that interactions with the account are performed through controlled methods.

Scenario 4: Smart Home Automation System
In a smart home automation system, encapsulate the internal workings of devices like "Thermostat" and "LightingController" to provide a simplified interface for controlling and monitoring these devices while hiding complex implementation details.

Scenario 5: Customer Relationship Management (CRM) System
In a CRM system, encapsulate the customer data and methods for managing customer interactions to ensure data integrity, privacy, and controlled access to customer information.

*/