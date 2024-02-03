class Parent {
    int parentVariable = 10;

    Parent() {
        System.out.println("Parent class Constructor");
    }

    void parentMethod() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int childVariable = 20;

    Child() {
        super();    //calling parent class constructor
        System.out.println("Child class constructor");
    }

    void childMethod() {
        super.parentMethod();   //calling parent class method
        System.out.println("Child class method");
    }

    void displayVariables() {
        System.out.println("Parent variable: " + super.parentVariable); //accessing the parent class instance variable
        System.out.println("Child variable: " + this.childVariable);
    }
}

public class Super_KW {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.displayVariables();
    }
}

/*
Usage of super keyword (kw):
1. to refer immediate parent class instance variable
2. to refer immediate parent class method
3. to refer immediate parent class constructor


Tasks:

Scenario 1: Car Manufacturing
In a car manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 2: Online Shopping
In an online shopping system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "Electronics" and "Clothing" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

Scenario 3: Vehicle Manufacturing
In a vehicle manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 4: Online Retail System
In an online retail system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

*/