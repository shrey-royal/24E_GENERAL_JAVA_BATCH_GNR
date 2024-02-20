public class Basic_Runtime_Errors {
    public static void main(String[] args) {
        System.out.println("Before ");
        try {
            Class.forName("java.lang.Scanner");
            System.out.println(12/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // } catch (ClassNotFoundException e) {
        //     // TODO: handle exception
        //     // System.out.println(e.getMessage() + "\n" + e.getClass());
        //     // System.out.println(e.getStackTrace());
        //     e.printStackTrace();
        // } catch (ArithmeticException e) {
        //     // System.out.println(e);
        //     e.printStackTrace();
        // }

        System.out.println("After Exception");
    }
}
