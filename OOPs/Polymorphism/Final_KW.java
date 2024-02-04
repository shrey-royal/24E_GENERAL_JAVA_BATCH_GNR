final class Bike {
    final int speedLimit = 90;

    // void run() {
    //     speedLimit = 400;
    // }

    final void run() {
        System.out.println("running");
    }
}

// class Honda extends Bike {
//     void run() {
//         System.out.println("running safely with 100kmph");
//         // run();
//     }
// }

class A {
    private A() {
        System.out.println("A Constructor");
    }
}

public class Final_KW {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.speedLimit);
        // b.run();

        // A a = new A();
    }
}

/*
Final Keyword: it is used to restrict the user from accessing certain things in the program.
(acts like a constant)

Final can be: 
1. variable: stop value change
2. method: stop method overriding
3. class: stop inheritance


Tasks:

Scenario 1: Math Constants
In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

Scenario 2: Configuration Settings
In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

Scenario 3: Math Calculations
In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.

Scenario 4: Database Connectivity
In a database connectivity framework, define a class called "DatabaseConnection" with a final variable for the database connection URL. This variable cannot be modified and represents the fixed database connection URL.

*/