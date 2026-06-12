package Classes;

final class FinalClass {
    // final class cannot be extended
    // throws error if extended
    void print() {
        System.out.println("This is a final class");
    }
}

class BaseClass {
    int num = 10;
    final int val = 20;

    void print() {
        System.out.println("This is a base class " + num);
    }

    final void display() {
        System.out.println("This is a final method");
    }
}

class ChildClass extends BaseClass {
    void print() {
        // -- final variable cannot be reassigned in child class
        // super.val =20;
        System.out.println("This is a child class");
    }

    // -- final method in parent class cannot be overridden
    // @Override
    // void display() {
    //     System.out.println("This is a overridden method");
    // }
}

public class Final {

    public void invoke() {
        // Always initialize the final variables while declaring for primitive data types
        final int a = 10;
        // a = 20; // not allowed throws error because final variable cannot be reassigned
        System.out.println(a);


        final BaseClass b = new BaseClass();
        // allowed because value in object could be changed
        b.num = 20;
        b.print();
        b.display();
        // but not allowed to change the object reference
        // c = new BaseClass(); // not allowed throws error because of final 

        //
        ChildClass c = new ChildClass();
        c.print();
        c.display(); // final method can be used by child class but cannot be overridden

    }
}