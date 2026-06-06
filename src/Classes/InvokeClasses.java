package Classes;

// CLasses - template of to create the object
// Object - Data to represent a particular entity which is stored in a pysical memory
class Student {
    // instance variables - variables created inside classes 
    int id; //default assigned 0 if it is not assigned
    String name = "";
    int value = 1;
}

public class InvokeClasses {

    public void invoke(){
       
        // new - keyword to create a new object
    
        // Student s0; // declaration - allowed but cannot be used without value initialization

        // So if we want to access s0 it should be initialized
        Student s0 = null;
        System.out.println(s0);
   
        Student s1 = new Student();
        // s1 is the reference variable
        // . operator is used to access the members of the class
        System.out.println(s1);
        System.out.println(s1.value);
    }
}