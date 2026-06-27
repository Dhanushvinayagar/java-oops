package Pillars.Abstraction;
// Abstract - defining properties as abstract so that it can be implemented using inhertitance or during object creation
// If Abstract method is declared in the class then the class should be abstract 
// If abstract property is there in the class then the class should be abstract


// Abstract class cannot be final due to overriding
abstract class Branch {
    String name;
    static int members;
    final int year_started = 2000;

    // Abstaract method - without defining function body
    abstract void statements();

    // Abstract constructor cannot be created 
    Branch() {
        System.out.println("Abstract Branch constructor");
    }

    Branch(int a ) {
        System.out.println("Abstract Branch constructor called via super");
    }

    // Abstract methods cannot be static  because static methods are not overridden but abstract should be overridden
    // but static methods are allowed 
    static void details() {
        System.out.println("Abstract Branch static details");
    }

    void message() {
        System.out.println("Abstract Branch message");
    }
}

class NorthBranch extends Branch { 

    // here this and super are pointing to name of the parent class
    NorthBranch(String name) {
        super(1);
        this.name = name;
        System.out.println("North Branch " + super.name);
    }
    void statements() {
        System.out.println("North Branch statements");
    }
}

public class Branches {

    public static void branch(){
        System.out.println("Account");
        // Objects cannot be created for abstract methods without method implementation
        // not possible like this Branch b = new Branch();

        // 1. Methods Needs to be implemented 
        Branch b = new Branch() {
            @Override
            void statements() {
                System.out.println("Abstract Branch statements");
            }
        };
        b.details();

        // 2. Extending the abstract class and mandatory to overriding the abstract method
        System.out.println("Using Sub Class");
        NorthBranch nb = new NorthBranch("NB");
        nb.statements();
    }
}
