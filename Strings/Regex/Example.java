import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        // String str = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Eum ad voluptatum quis recusandae at harum ducimus exercitationem nisi laborum odio suscipit ullam quam in sunt iure eius natus enim magni beatae adipisci, a minima vero praesentium? Explicabo eaque, corporis doloremque, voluptates aliquid minima, perspiciatis possimus repudiandae iste accusantium eos cumque?";
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("\nEnter regex Pattern: ");
            Pattern p = Pattern.compile(sc.nextLine());
            System.out.print("\nEnter text: ");
            Matcher m = p.matcher(sc.nextLine());
            boolean found = false;
            while(m.find()) {
                System.out.println("I found the text " + m.group() + "starting at index " + m.start() + " and ending at index " + m.end());
                found = true;
            }
            if(!found) {
                System.out.println("No Match Found!");
            }
        }
    }
}

/*
Tasks:  1, 5, 10

Problem 1: Email Validation
Question: Write a Java program to validate email addresses using regular expressions.

Sample Test Case:
- Input: "user@example.com"
- Output: Valid

Problem 2: Phone Number Formatting
Question: Create a program to format phone numbers in a specific pattern using regex.

Sample Test Case:
- Input: "1234567890"
- Output: "(123) 456-7890"

Problem 3: Password Strength Checker
Question: Develop a tool to check the strength of a password using regex to ensure it meets specific criteria (e.g., length, special characters, etc.).

Sample Test Case:
- Input: "P@ssw0rd123"
- Output: Strong

Problem 4: URL Parser
Question: Implement a URL parser that extracts different components (e.g., protocol, domain, path) from a given URL using regular expressions.

Sample Test Case:
- Input: "https://www.example.com/path/to/resource"
- Output:
  - Protocol: "https"
  - Domain: "www.example.com"
  - Path: "/path/to/resource"

Problem 5: Date Format Conversion
Question: Write a program that converts dates from one format to another (e.g., from "MM/DD/YYYY" to "YYYY-MM-DD") using regex.

Sample Test Case:
- Input: "12/31/2022"
- Output: "2022-12-31"

Problem 6: HTML Tag Removal
Question: Create a tool to remove all HTML tags from a given string using regular expressions.

Sample Test Case:
- Input: "<p>This is a <b>sample</b> text.</p>"
- Output: "This is a sample text."

Problem 7: License Plate Recognition
Question: Develop a program to recognize and validate license plate numbers using regex based on a predefined format.

Sample Test Case:
- Input: "AB123CD"
- Output: Valid

Problem 8: IP Address Validation
Question: Write a Java program to validate IPv4 and IPv6 addresses using regular expressions.

Sample Test Cases:
- Input: "192.168.1.1"
- Output: Valid

- Input: "2001:0db8:85a3:0000:0000:8a2e:0370:7334"
- Output: Valid

Problem 9: Credit Card Number Masking
Question: Implement a program to mask all but the last four digits of a credit card number using regex.

Sample Test Case:
- Input: "1234 5678 1234 5678"
- Output: "5678"

Problem 10: Text Search and Highlighter
Question: Create a text search and highlight tool that finds and highlights specific words or phrases in a text document using regular expressions.

Sample Test Case:
- Input Text: "This is a sample text. It contains sample data."
- Search Term: "sample"
- Output: "This is a <span class='highlight'>sample</span> text. It contains <span class='highlight'>sample</span> data."


*/