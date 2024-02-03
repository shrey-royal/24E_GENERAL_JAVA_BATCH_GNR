class Vehicle {
    Vehicle startEngine() {
        System.out.println("Starting the engine of a generic vehicle.");
        return this;
    }
}

class Car extends Vehicle {
    @Override
    Car startEngine() {
        System.out.println("Starting the engine of a car.");
        return this;
    }
}

class Shape {
    Shape createShape() {
        System.out.println("Creating a generic Shape.");
        return this;
    }
}

class Circle extends Shape {
    @Override
    Circle createShape() {
        System.out.println("Creating a circle");
        return this;
    }
}

class Rectangle extends Shape {
    @Override
    Rectangle createShape() {
        System.out.println("Creating a rectangle");
        return this;
    }
}

public class Covariant_RT {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle();
        // vehicle.startEngine();

        // Car car = new Car();
        // car.startEngine();

        // Vehicle vehicle = new Car();
        // vehicle.startEngine();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println(circle.createShape());
        System.out.println(rectangle.createShape());
    }
}


/*
Tasks:

Scenario 1: Animal Sounds
In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.

Scenario 2: Shape Factory
In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method and return their specific shape objects.

Scenario 3: E-commerce Product Search
In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.

Scenario 4: Stock Market Analysis
In a stock market analysis system, define a base class called "Stock" with a method called "getStockData" that returns an instance of the "Stock" class. Implement derived classes like "TechStock" and "PharmaStock" that override the "getStockData" method and return their specific stock data objects.

*/