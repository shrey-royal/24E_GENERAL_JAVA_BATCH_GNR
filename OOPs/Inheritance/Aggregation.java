class Address {
    private String city, state, country;

    public Address() {}

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void display() {
        System.out.println("City: " + city + "\nState: " + state + "\nCountry: " + country);
    }
}

class Employee {
    private int id;
    private String name;
    private float salary;
    private Address address;    //object

    public Employee() {}

    public Employee(int id, String name, float salary, Address address) {
        this.id = id;
        this.name =name;
        this.salary = salary;
        this.address = address;
    }

    void display() {
        System.out.println("Id: " + id + "\nName: " + name + "\nSalary: " + salary);
        address.display();
    }
}


public class Aggregation {
    public static void main(String[] args) {
        // Address add = new Address("Gandhinagar", "Gujarat", "India");
        Employee e = new Employee(23, "Kartik", 34.5f, new Address("city", "state", "country"));
        // Employee e = new Employee(23, "Kartik", 34.5f, add);

        e.display();
    }
}

/*
When you pass another class' object as a parameter into the current class then it is called aggregation.

Employee - Address
*/