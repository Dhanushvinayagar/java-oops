package Interfaces;

interface A {

    // Access modifiers in the method while implemeting should be same or give more access level
    // example if it is protected in the implementation it could be protected or public
    public void display();

    // using greet method in interface B will gives error
    // Interface gives default beacuse if in future i have to add some method to interface A 
    // i should have to define body fors it everywhere where it is implements
    default void greet() {
        System.out.println("Greet");
    }

    // Ststic method in interface should have a method body
    static void hi() {
        System.out.println("Hi");
    }
}

interface B extends A {
    public void show();
}
interface C {
    public void see();
}

class D {
    void hello(){
        System.out.println("Hello");
    }
}

class F extends D implements B,C {
    public void display() {
        System.out.print("Display");
    }

    public void show() {
        System.out.println("Show");
    }

    public void see() {
        System.out.println("See");
    }
}

public class Extending {
    public static void invoke() {
        F f = new F();
        f.display();
        f.show();
        f.see();
        f.hello();
        f.greet();
    }
}