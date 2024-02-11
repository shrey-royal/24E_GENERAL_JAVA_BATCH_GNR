@SuppressWarnings("unused")
class School {
    public String name;
    private double revenue;
    protected int classRooms;

    School() {}

    School(String name, double revenue, int classRooms) {
        this.name = name;
        this.revenue = revenue;
        this.classRooms = classRooms;
    }
}

class Parent extends School {
    void knowSchool(School p) {
        System.out.println("School Name: " + p.name);
        System.out.println("Classrooms: " + p.classRooms);
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        School s = new School("ABC", 12000000, 10);
        Parent p = new Parent();
        p.knowSchool(s);
        // System.out.println(s.revenue);
    }
}

/*
Tasks:

Scenario 1: Banking System
In a banking system, use the "private" access modifier for sensitive information like customer account balances to restrict direct access to this data.

Scenario 2: Online Store
In an online store application, use the "public" access modifier for methods that provide services to customers, such as adding items to a shopping cart or processing payments.

Scenario 3: University Management System
In a university management system, use the "protected" access modifier for class members that need to be accessed by derived classes, such as a "Student" class accessing the "name" attribute in the "Person" class.

Scenario 4: Employee Database
In an employee database application, use the "default" (package-private) access modifier for methods and attributes that should only be accessible within the same package, such as utility methods or helper classes.

Scenario 5: Travel Booking System
In a travel booking system, use a combination of access modifiers, such as "private" for sensitive data like customer payment details, "protected" for methods used within specific subclasses, and "public" for API methods accessible by external systems.

*/