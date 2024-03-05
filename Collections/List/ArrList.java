import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        // List list = new ArrayList();

        // list.add(1);
        // list.add(1.2);
        // list.add(1.2f);
        // list.add('c');
        // list.add("string");

        // System.out.println(list);

        ArrayList<String> l = new ArrayList<>();

        l.add("Ram");
        l.add("Shiv");
        l.add("Hanuman");
        l.add("Narayan");
        l.add("Krishna");
        l.add("Swaminarayan");

        // System.out.println(l);

        // l.addAll(list);
        // System.out.println(l);

        // ArrayList<String> l1 = new ArrayList<>();
        // l1.add("Parvati");
        // l1.add("Agni");
        // l1.add("Aditi");
        // l1.add("Durga");
        // l1.add("Kali");
        // l1.add("Lakshmi");

        // l.addAll(l1);
        System.out.println(l);

        // System.out.println(l.get(2));

        // for (String string : l) {
        //     System.out.println(string);
        // }

        // for (int i = 0; i < l.size(); i++) {
        //     System.out.println(l.get(i));
        // }

        // l.clear();
        // l.removeAll(l1);

        // ArrayList<ArrayList<String>> m = new ArrayList<>();

        // ArrayList<String> inner1 = new ArrayList<>();
        // inner1.add("a");
        // inner1.add("b");
        // inner1.add("c");

        // m.add(inner1);

        // ArrayList<String> innerList2 = new ArrayList<>();
        // innerList2.add("X");
        // innerList2.add("Y");
        // innerList2.add("Z");

        // m.add(innerList2);

        // System.out.println(m.get(0).get(0));
        // System.out.println(m.get(0).get(1));
        // System.out.println(m.get(0).get(2));

        //iterator - Iterable interface
        // Iterator<String> bhagwaanjis = l.iterator();

        // while(bhagwaanjis.hasNext()) {
        //     System.out.println(bhagwaanjis.next());
        // }

        // l.set(0, "Ramchandra");

        // l.remove(2);
        // l.remove("Hanuman");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Krishnaji");
        l1.add("Hanumanji");
        // l.removeAll(l1);


        // Object arr[] = l.toArray();
        // String str[] = new String[l.size()];
        // System.out.println(Arrays.toString(arr));

        // System.out.println(l.contains("Shiv"));
        // System.out.println(l.containsAll(l1));
        System.out.println(l);
    }
}

/*
Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

Some of the commonly used methods of the Collection interface that's also available in the List interface are:

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element

*/