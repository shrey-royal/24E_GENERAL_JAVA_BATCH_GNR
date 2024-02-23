abstract class Person {
    abstract void eat();
}

class Bee {
    class Honey {
        void getHoney() {
            System.out.println("Getting Fresh & Pure Honey!");
        }
    }

    void beeSting() {
        System.out.println("A HoneyBee Stung me while i was getting honey!");
    }
}


public class AnonymousClass {
    public static void main(String[] args) {
        Person p = new Person() {
            void eat() {
                System.out.println("Nice Fruits");
            }
        };

        p.eat();

        Bee b = new Bee();

        b.beeSting();

        Bee.Honey h = b.new Honey();
        h.getHoney();
    }
}
/*
Task: 
Problem Statement:
You are tasked with designing a system for a library that manages various types of books. Each type of book has specific borrowing rules, such as the maximum borrowing duration and the late fee policy. Additionally, the library wants to track the number of times each book has been borrowed and maintain a record of overdue books.

Real-World Scenario:
In the library management system, you need to implement a mechanism to handle overdue books differently based on their type. For instance, fiction books might have a different late fee policy compared to reference books. To achieve this, you decide to use an anonymous inner class in Java to define the specific late fee calculation logic for each book type.

*/