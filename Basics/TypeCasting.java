public class TypeCasting {
    public static void main(String[] args) {
        int x = 56;
        long y = x;     //implicit type conversion
        float z = y;    //implicit type conversion

        // System.out.println(((Object)x).getClass().getName());
        // System.out.println(((Object)y).getClass().getName());
        // System.out.println(((Object)z).getClass().getName());
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        double d = 166.76;
        long l = (long)d;   //fractional part lost
        int i = (int)l;     //fractional part lost
        short s = (short)i;
        byte b = (byte)s;

        System.out.println(d);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
    }
}

/*
//Implicit type casting (automatic)
Widening Type Casting ==> byte -> short -> char -> int -> long -> float -> double
Narrowing Type Casting => double -> float -> long -> int -> char -> short -> byte
*/