// Package - collection of classes
// Package is a folder to manage multiple classes
// Cannot have two classes with the same name in package
package Classes;

// CLasses - template of to create the object
// Object - Data to represent a particular entity which is stored in a pysical memory
class Student {
    // instance variables - variables created inside classes 
    int id; //default assigned 0 if it is not assigned
    String name = "";
    int value = 1;
    boolean is_alumini;

    //constructor - special method initializes during object creation
    //can pass parameters in the constructor
    // during object creation constructor will be invoked based on the parameters passed

    // default constructor - no parameters and it will be invoked automatically when we create an object without parameters
    // Even if it is not defined it will be created
    // Ignored if we have parameterized constructor
    Student() {
        System.out.println("Constructor initialized");
    }

    // Constructor overloading - multiple constructors with different parameters
    // parameterized constructor - it will be invoked when we create an object with parameters
    Student(int id, String first_name) {

        // this - keyword to refer the current objects instance variables
        // It helps to identify wheather it is a local variable or instance variable
        // first_name - local variable
        // this.name - instance variable
        this.id = id;
        this.name = first_name;
    }

    Student(int id, String name, boolean is_alumini) {
        System.out.println("Parameter Constructor initialized");
        this.id = id;
        this.name = name;
        this.is_alumini = is_alumini;
    }
}

public class InvokeClasses {

    public void invoke(){

        int a = 10;
        //primitive data type are stored in stack memory they are not objects

        Student s_0 = new Student(1,"Mike",true);
       
        // new - keyword to create a new object
    
        // Student s0; // declaration - allowed but cannot be used without value initialization

        // So if we want to access s0 it should be initialized
        Student s0 = null;
        System.out.println(s0);
   
        Student s1 = new Student();
        // Student s1 -(compile time)
        // new Student() - (during run time)
        // s1 is the reference variable
        // . operator is used to access the members of the class

        // new - create the object in heap memory dynamically allocates memory and returns the reference
        // s1 reference var is in stack memory 
        System.out.println(s1);
        System.out.println(s1.id);
        System.out.println(s1.is_alumini);

        Student s2 = new Student();
        s2.id = 1;
        s2.name = "Doe";
        System.out.println(s2.id);
        System.out.println(s2.name);

        Student s3 = new Student(1, "Doe");
        System.out.println(s3.id);
        System.out.println(s3.name);

        Student s4 = s3;
        // sharing the same memory location
        System.out.println(s4.id);
        System.out.println(s4.name);



    }
}