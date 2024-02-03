class Brand {
    protected String brandName;
    protected String location;

    public void display() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Location Name: " + location);
    }
}

class Car extends Brand {
    Car(String brandName, String location) {
        super.brandName = brandName;
        super.location = location;
    }

    @Override   //annotation
    public void display() {
        System.out.println("This car is from " + brandName + " company and I bought this car from " + location);
    }
}

class Pizza extends Brand {
    Pizza(String brand, String loc) {
        brandName = brand;
        location = loc;
    }

    @Override
    public void display() {
        System.out.println("I'm Ordering Pizzas from " + brandName + " and the nearest outlet is " + location);
    }
}


public class MT_Overriding {
    public static void main(String[] args) {
        Car c = new Car("BMW", "Ahmedabad");
        c.display();

        Pizza p = new Pizza("Dominos", "Kudasan");
        p.display();
    }
}

/*
Tasks:

Scenario 1: Shape Drawing Application
In a shape drawing application, create a base class called "Shape" with a method called "draw." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "draw" method to display the respective shapes.

Scenario 2: Bank Account System
In a bank account system, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "CurrentAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

Scenario 3: Shape Transformation Application
In a shape transformation application, create a base class called "Shape" with a method called "transform." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "transform" method to perform shape-specific transformations.

Scenario 4: Banking Application
In a banking application, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "LoanAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

*/