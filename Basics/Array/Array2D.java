public class Array2D {
    public static void main(String[] args) {
        String cars[][] = {
            {"Car 00", "Car 01", "Car 02"}, 
            {"Car 10", "Car 11", "Car 12"}, 
            {"Car 20", "Car 21", "Car 22"}
        };

        // for (String[] three_cars : cars) {  //rows
        //     for (String car : three_cars) { //cols
        //         System.out.print(car + ", ");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + ", ");
            }
            System.out.println();
        }


    }
}
