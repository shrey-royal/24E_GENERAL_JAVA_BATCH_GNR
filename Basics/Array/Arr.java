import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int size;
        String cars[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of cars you want to store in the array: ");
        size = sc.nextInt();

        cars = new String[size];
        // System.out.println("Length of the cars array is " + cars.length);

        System.out.println("Enter "+size+" names of Cars");
        sc.nextLine();
        for (int i = 0; i < cars.length; i++) {
            System.out.print("\nEnter car " + (i+1) + ": ");
            cars[i] = sc.nextLine();
        }

        // for (int i = 0; i < cars.length; i++) {
        //     System.out.println(cars[i]);
        // }

        // for (data_type var_name : arr_name) {
        //     //body
        // }

        for (String car : cars) {
            System.out.print(car + ", ");
        }
    }
}


/*
// int[] arr;//declaration
//declaration with instantiation
// int arr[] = new int[10];
// int size = 45;
// float[] f_arr = new float[size];
//arr[0]  = 23;
//arr[1] = 45;


*/