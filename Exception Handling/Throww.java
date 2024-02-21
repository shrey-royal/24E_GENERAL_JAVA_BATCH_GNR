public class Throww {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        try {
            Throww.div(25, 0);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("After Exception");
    }

    private static void div(int a, int b) {
        if (b == 0) throw new ArithmeticException("Avu na thaay!");
        else {
            System.out.println(a/b);
        }
    }
}
