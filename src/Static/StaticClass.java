package Static;
// Static - It is related to class not object
// Static is executed at compile time 
// static is shared by all objects
// there is only one copy of static variable and method which is shared by all objects

class AreaClass {
    // static variable - It is created only once and it is shared by all objects
    static float PI = 3.14f;

    static {
        // Run only once even if n number of objects are created
        // As soon as the class is loaded this block will be executed
        System.out.println("Static block always executed first");
    }

    AreaClass() {
        // run for each object 
        System.out.println("Constructor will be loaded after static block"); 
    }

    // static method - It is created only once and it is shared by all objects

    //Inside static method we cannot use non-static methods
    public static void area_of_circle(int r) {
        // non static variables can be used inside static method

        // Object referenced method can be used inside static method
        // Eg: From Main class main method we can call non static method created for an object
        
        //this - cannot be used inside static method
        float area = AreaClass.PI * r * r;
        System.out.println("Area is " + area);
    }
}

class AreaofCircle extends AreaClass {

    // Static method cannot be overridden because it not related to object
    // overriding happens with obects during run time so it can be inherited but not overridden
    // @Override
    // public static void area_of_circle(int r) {
    //     System.out.println("Area of circle is " + 3.14 * r * r);
    // }
}

public class StaticClass {

    public void invoke() {
        AreaClass a1 = new AreaClass();
        AreaClass a2 = new AreaClass();

        // works even without object creation
        AreaClass.area_of_circle(5);

        // -- works but not recommended to use static variable and method with object reference 
        // -- because it creates confusion that it is related to object but it is related to class
        // AreaClass area1 = new AreaClass();
        // area1.PI = 3.14f;
        // area1.area_of_circle(10);
    }

}