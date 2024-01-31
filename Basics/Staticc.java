import java.util.Scanner;

class Student {
    static int count=0; //static var/methods gets allocated with the memory only once
    String name;

    Student(String name) {
        this.name = name;
        count++;
    }

    static void display() {
        // System.out.println("Name: " + name);
        System.out.println("static method");
    }
}

public class Staticc {
    // static int a;
    // int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[5];

        for(int i=0; i<s.length; i++) {
            System.out.print("Enter student name " + i + ": ");
            s[i] = new Student(sc.nextLine());
        }
        // Student.count = 34;
        for(int i=0; i<s.length; i++) {
            // s[i].display();
            Student.display();
            System.out.println("Count: " + Student.count);
        }
        
        // System.out.println(a);
        // Staticc s1 = new Staticc();
        // System.out.println(s1.b);

        sc.close();
    }
}
