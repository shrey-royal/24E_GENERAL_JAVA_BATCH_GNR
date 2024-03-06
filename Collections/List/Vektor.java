import java.util.Iterator;
import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        //Randomly add elements to the vector
        for (int i = 0; i < 10; i++) {
            // System.out.println(Math.random());
            nums.add((int)(Math.random() * 1000));
        }

        // System.out.println(nums);
        Iterator<Integer> i = nums.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
    }
}

/*
vector is a growable array of objects.

vector is synchronized and grows 100% when the vector is filled.

Methods of vector:

Same as ArrayList except that all the methods of vector are synchronized.

command line args

//code start
        // System.out.println("args length: " + args.length);
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
//code end

to run: java Vektor 1 shrey_k "himan shu" 'r i t u' tu

output: 
args length: 8
1
shrey_k
himan shu
'r
i
t
u'
tu


*/