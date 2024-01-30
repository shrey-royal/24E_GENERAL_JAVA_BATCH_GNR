class ScienceStream {
    void displayStream() {
        System.out.println("This is a Science Stream");
    }
}

class Physics extends ScienceStream {
    void displaySubject() {
        System.out.println("This is Physics.");
    }
}

class Chemistry extends ScienceStream {
    void displaySubject() {
        System.out.println("This is Chemistry.");
    }
}

class Biology extends ScienceStream {
    void displaySubject() {
        System.out.println("This is Biology.");
    }
}


public class Hierarchical1 {
    public static void main(String[] args) {
        Physics physics = new Physics();
        Chemistry chemistry = new Chemistry();
        Biology biology = new Biology();

        physics.displayStream();
        physics.displaySubject();
        
        chemistry.displayStream();
        chemistry.displaySubject();
        
        biology.displayStream();
        biology.displaySubject();
    }
}
