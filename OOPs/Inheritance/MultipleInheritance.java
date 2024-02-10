interface Father {
    void property();
}

interface Mother {
    void love();
    void property();
}

class Child implements Father, Mother {
    @Override
    public void property() {
        System.out.println("I have a house.");
    }

    @Override
    public void love() {
        System.out.println("I love my parents.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.love();
        c.property();
    }
}
