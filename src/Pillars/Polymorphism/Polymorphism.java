package Pillars.Polymorphism;
// Polymorphism - It is a mechanism to use same method name in multiple forms
// compile time polymorphism / static polymorphism
// - It is achieved by Method Overloading 
// - Same method name/ constructor with different parameters or different types

// Method Overriding - 

class Vechicle {

    Vechicle() {
        System.out.println("Parent");
    }

    Vechicle(int a, int b) {
        System.out.println("Two wheeler");
    }

    Vechicle(double a, int b) {
        System.out.println("Two wheeler with double");
    }

    Vechicle(int a, int b, int c) {
        System.out.println("Three wheeler");
    }

    Vechicle(int a, int b, int c, int d) {
        System.out.println("Four wheeler");
    }

    void run() {
        System.out.println("Vehicle is running");
    }

}

class Car extends Vechicle {
    Car() {
        System.out.println("Child");
    }
    void run() {
        System.out.println("Car is running");
    }
}

public class Polymorphism {
    public static void invoke() {
        //execution will go to child class because of method overriding
        Vechicle v = new Car();
        v.run();

        // Method Overloading
        Vechicle v1 = new Vechicle();
        Vechicle v2 = new Vechicle(1,2);
        Vechicle v2_1 = new Vechicle(1.5,2);
        Vechicle v3 = new Vechicle(1,2,3);
        Vechicle v4 = new Vechicle(1,2,3,4);

    }
}