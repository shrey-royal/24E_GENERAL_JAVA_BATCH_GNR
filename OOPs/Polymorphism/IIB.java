class Parent {
    int x;
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Bike extends Parent {
    int speed;        //instance variable/data member/class member
    static int a;

    {   //IIB
        System.out.println("IIB called!");
        speed = 130;
        super.x = 34;
    }

    Bike() {
        super();
        //IIB place
        System.out.println("Constructor called!");
    }
}


public class IIB {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Bike b = new Bike();
        // System.out.println(Bike.a);
    }
}

/*
Instance Initializer Block (IIB): used to initialize data members.
it runs each time when object of class is created.

Tasks:

Scenario 1: Employee Database
In an employee database system, create a class called "Employee" with an instance initializer block that initializes a static database connection. The block runs whenever an object of the "Employee" class is created.

Scenario 2: Game Initialization
In a game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

Scenario 3: Online Game Initialization
In an online game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

Scenario 4: Company Employee Management
In a company employee management system, create a class called "Employee" with an instance initializer block that initializes an employee's access privileges and permissions when a new employee object is created.

*/