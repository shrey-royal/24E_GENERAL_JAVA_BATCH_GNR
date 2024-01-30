class Shape {
    void printShape() {
        System.out.println("This is a Shape");
    }
}

class Triangle extends Shape {
    void printShape() {
        System.out.println("This is a Triangle.");
    }
}

class Circle extends Shape {
    void printShape() {
        System.out.println("This is Circle.");
    }
}

class Rectangle extends Shape {
    void printShape() {
        System.out.println("This is Rectangle.");
    }
}


public class Hierarchical2 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        t.printShape();
        c.printShape();
        r.printShape();
    }
}
