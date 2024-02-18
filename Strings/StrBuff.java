public class StrBuff {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();  //capacity - 16
        // StringBuffer str = new StringBuffer(5); //capacity - 5
        // CharSequence charSequence = "dhyeybhai is curious";
        // StringBuffer str1 = new StringBuffer(charSequence);
        // System.out.println(str1);


        str.insert(0, "Java");
        System.out.println(str);
        // System.out.println(str.hashCode());
        // str.append("Java");
        // System.out.println(str);
        // System.out.println(str.hashCode());

        str.insert(4, "_World");
        // str.delete(0, 4);
        // str.reverse();
        // str.replace(0, 4, "Java");
        // System.out.println(str.capacity());
        // str.ensureCapacity(100);
        System.out.println(str.capacity());

        System.out.println(str);

    }
}

/*
StringBuffer class is used to create mutable String objects.
Thread Safe (multiple thread can't access it simultaneously)

default capacity: 16

append(String s)
insert(int offset, String s)
replace(int startindex, int endindex, String s)
delete(int startindex, int endindex)
reverse()
capacity() - new capacity will be allocated to the string acc. to ((oldCapacity*2) + 2)
ensureCapacity(int minimumCapacity)
charAt(int index)
length()
substring(int beginIndex)
substring(int beginIndex, int endIndex)

*/