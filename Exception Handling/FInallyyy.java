public class FInallyyy {

    // Case 1: when the exception doesn;t occur
    // public static void main(String[] args) {
    //     System.out.println("Before Exception");
        
    //     try {
    //         int data = 25/5;
    //         System.out.println(data);
    //     } catch (ArithmeticException e) {
    //         e.printStackTrace();
    //         // System.out.println(e);
    //     } finally {
    //         System.out.println("finally block executed!");
    //     }

    //     System.out.println("After Exception");
    // }

    // Case 2: when the exception occurs and not handled
    // public static void main(String[] args) {
    //     System.out.println("Before Exception");
        
    //     try {
    //         int data = 25/0;
    //         System.out.println(data);
    //     } catch (NullPointerException e) {
    //         e.printStackTrace();
    //     } finally {
    //         System.out.println("finally block executed!");
    //     }

    //     System.out.println("After Exception");
    // }

    // Case 3: when the exception occur and also gets handled by the catch block
    public static void main(String[] args) {
        System.out.println("Before Exception");
        
        try {
            int data = 25/0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally block executed!");
        }

        System.out.println("After Exception");
    }
}

/*
Tasks:

1. Calculator with User Input: Develop a basic calculator that takes user input for arithmetic operations. Use 'try' and 'catch' to handle 'InputMismatchException' when incorrect input is provided and ensure scanner resources are closed in 'finally'.

2. Temperature Converter: Build an application that converts temperatures between Celsius and Fahrenheit. Handle 'NumberFormatException' using 'try' and 'catch' for incorrect input and ensure resource cleanup in the 'finally' block.

3. Array Manipulation: Develop a program that performs operations on arrays (e.g., sorting, searching). Use 'try' and 'catch' to handle 'ArrayIndexOutOfBoundsException' for incorrect array access and ensure resource cleanup in 'finally'.

4. User Authentication: Create a basic login system. Implement 'try' and 'catch' to handle 'LoginFailedException' and ensure resource release (e.g., closing streams) in the 'finally' block.

5. Simple Math Operations: Build a program that performs basic mathematical calculations. Use 'try' and 'catch' to catch 'ArithmeticException' for divide-by-zero errors and ensure proper cleanup in 'finally'.
*/