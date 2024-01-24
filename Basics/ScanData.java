// import java.util.*; //star mean all classes inside the current package will be included
import java.util.Scanner;

public class ScanData {
    public static void main(String[] args) {
        //object creation
        // Scanner sc; //Object Creation/Declaration
        // sc = new Scanner(System.in);    //Object Instantiation
        
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter any Integer: ");
        // int _int = sc.nextInt();

        // System.out.print("Enter any Float:");
        // float _float = sc.nextFloat();

        // System.out.print("Enter any Char:");
        // char _char = sc.next().charAt(0);

        // System.out.print("Enter any Double:");
        // double _double = sc.nextDouble();

        // System.out.print("Enter any String:");
        // String _line = sc.nextLine();

        // System.out.print("Enter any Boolean:");
        // boolean _bool = sc.nextBoolean();

        System.out.print("Enter any Byte: ");
        byte _byte = sc.nextByte();

        sc.close(); //to prevent the resource leak

        // System.out.println("Integer: " + _int);
        // System.out.println("Float: " + _float);
        // System.out.println("Data Type: " + ((Object)_float).getClass().getSimpleName());
        // System.out.println("Character: " + _char);
        // System.out.println("Double: " + _double);
        // System.out.println("Line: " + _line);
        // System.out.println("Boolean: " + _bool);
        System.out.println("Byte: " + _byte);


    }
}

/*
Scanner Class: Used to scan the data from the user.
> this class comes from a package named java.util

Methods used in Scanner class: 
1. next(): Used to scan a word from the user
2. nextLine(): used to scan the whole line from the user
3. nextInt(): used to scan integer data from the user
4. nextFloat(): used to scan float data from the user
5. nextDouble(): used to scan double data from the user
6. nextBoolean(): used to scan boolean data from the user
7. nextByte(): used to scan byte data from the user

Creating Object of Scanner Class:

Scanner obj = new Scanner(Source);

If the Method doesn't match with the data entered by the user then it will return InputMismatchException


Tasks:

1. Write a Java program to take the user's name as input and display a personalized greeting message.

2. Create a program that prompts the user to enter their age, and then determine if they are eligible for voting (age >= 18).

3. Build a Java application to collect the user's contact information (name, email, and phone number) and display it back to them.

4. Develop a program that takes a user's birthdate as input and calculates their current age.

5. Implement a program to accept the user's weight and height, and then calculate their BMI (Body Mass Index).

6. Create a simple password validation system that prompts the user to enter a password and checks if it meets certain criteria (e.g., minimum length, containing numbers and special characters).

7. Write a Java program that reads a user's favorite color and displays it back to them in a sentence.

8. Develop a program to take the user's marks in three subjects (Math, Science, and English) and calculate their average score.

9. Create a program that asks the user for their address, including street, city, state, and zip code, and displays the complete address.

10. Implement a basic calculator program that accepts two numbers and an operator (+, -, *, /) as input, performs the corresponding operation, and displays the result.




*/