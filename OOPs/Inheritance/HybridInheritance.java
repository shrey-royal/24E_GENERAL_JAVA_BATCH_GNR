// class A {}
// interface B {}
// class C extends A implements B {}

interface Shape {
    void draw();
}

interface Color {
    void fillColor();
}

class BaseShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling with red color");
    }
}

class HybridObject extends BaseShape implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling with Color");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        HybridObject hybridObject = new HybridObject();
        hybridObject.draw();
        hybridObject.fillColor();

        RedColor r = new RedColor();
        r.fillColor();
    }
}
