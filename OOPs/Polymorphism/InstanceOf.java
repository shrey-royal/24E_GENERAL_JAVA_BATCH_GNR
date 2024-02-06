class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class InstanceOf {
    public static void main(String[] args) {
        // Animal a1 = new Dog();
        // Animal a2 = new Cat();
        Dog d = new Dog();
        Cat c = new Cat();

        // System.out.println(a1 instanceof Animal);
        // System.out.println(a1 instanceof Dog);
        // System.out.println(a1 instanceof Cat);

        // System.out.println(a2 instanceof Animal);
        // System.out.println(a2 instanceof Dog);
        // System.out.println(a2 instanceof Cat);

        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Dog);
        // System.out.println(d instanceof Cat);    // Error

        System.out.println(c instanceof Animal);
        // System.out.println(c instanceof Dog);    // Error
        System.out.println(c instanceof Cat);
    }
}

/*
Tasks:

Scenario 1: Online Course Platform
In an online course platform, create classes like "Course," "VideoLesson," and "Quiz" representing different course components. Use the instanceof operator to determine the type of course component and perform specific actions or display relevant information.

Scenario 2: Animal Shelter
In an animal shelter application, have classes like "Animal," "Cat," and "Dog" representing different types of animals. Use the instanceof operator to identify the type of animal and apply specific operations like feeding or grooming based on the animal's type.

Scenario 3: University Course Registration
In a university course registration system, have classes like "Course," "Lecture," and "Lab" representing different types of courses. Use the instanceof operator to determine the type of course and perform specific registration operations based on the course type.

Scenario 4: Vehicle Service Center
In a vehicle service center application, create classes like "Vehicle," "Car," and "Motorcycle" representing different types of vehicles. Use the instanceof operator to identify the type of vehicle and perform specific service operations based on the vehicle's type.

*/