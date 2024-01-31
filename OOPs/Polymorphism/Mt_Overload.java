class Overload {
    public static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    public static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void display(String a) {
        System.out.println("Got String paramter: " + a);
    }

    public static void display(String a, String b) {
        System.out.println("Got String paramter: \"" + a + "\" and \"" + b + "\"");
    }
}

class Sum {
    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static float sum(float a, float b) {
        return a+b;
    }
}

public class Mt_Overload {
    public static void main(String[] args) {
        Overload.display(23);
        Overload.display(3, 34);

        Overload.display("string");
        Overload.display("string", "str");
    }
}


/* (compiler time polymorphism)
Overloading is done in 2 different ways: 
1. by changing the number of parameters
2. by changing the datatype of parameters

*/