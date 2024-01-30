class Car {
    void drive() {
        System.out.println("Driving a car.");
    }
}

class SportsCar extends Car {
    void drive() {
        System.out.println("Driving a sports car");
    }

    void turbo() {
        System.out.println("Sports car in turbo mode!");
    }
}

class LuxurySportsCar extends SportsCar {
    void drive() {
        System.out.println("Driving a luxury sports car.");
    }
    
    void autopilot() {
        System.out.println("Luxury sports car in autopilot mode!");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Car car = new Car();
        SportsCar sportsCar = new SportsCar();
        LuxurySportsCar luxurySportsCar = new LuxurySportsCar();

        car.drive();

        sportsCar.drive();
        sportsCar.turbo();

        luxurySportsCar.drive();
        luxurySportsCar.autopilot();
    }
}
