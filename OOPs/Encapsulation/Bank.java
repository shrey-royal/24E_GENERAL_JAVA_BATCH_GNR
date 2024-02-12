import mypackage.BankAccount;
import mypackage.Transaction;

public class Bank {
    public static void main(String[] args) {
        BankAccount father = new BankAccount("123456789", "Kuber", 100000);
        BankAccount son = new BankAccount("987654321", "Dhyey", 50000);


        System.out.println("Initial balances: ");
        System.out.println(father.getAccountHolderName() + ": " + father.getBalance());
        System.out.println(son.getAccountHolderName() + ": " + son.getBalance());

        Transaction transaction = new Transaction();
        transaction.transfer(father, son, 50000);

        System.out.println("Final balances after transfer: ");
        System.out.println(father.getAccountHolderName() + ": " + father.getBalance());
        System.out.println(son.getAccountHolderName() + ": " + son.getBalance());
    }
}

/*
Tasks: 

Scenario 1: Banking System (Illustrated as an example)
Create a package called "bank" that contains classes like "Account," "Transaction," and "Customer" that are related to banking operations. Place these classes in the "bank" package to organize and group them together.

Scenario 2: E-commerce Platform
Design a package called "ecommerce" that includes classes like "Product," "Cart," and "Order" that are related to online shopping. Place these classes in the "ecommerce" package to encapsulate and manage them as a cohesive unit.

Scenario 3: Hospital Management System
Develop a package called "hospital" that contains classes like "Doctor," "Patient," and "Appointment" that handle various aspects of managing a hospital. Place these classes in the "hospital" package to provide organization and separation from other modules.

Scenario 4: Game Development
Create a package called "game" that includes classes like "Player," "Enemy," and "Level" that are used in a game development project. Place these classes in the "game" package to maintain a logical grouping of game-related components.

Scenario 5: Social Media Application
Design a package called "socialmedia" that contains classes like "User," "Post," and "Comment" that handle functionalities of a social media application. Place these classes in the "socialmedia" package to keep them organized and separate from other modules.

*/