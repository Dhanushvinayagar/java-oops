package Pillars.Encapsulation;
// Encapsulation - Wrapping up all the data member and methods into a single unit

class Student {
    private String name;
    private int age;
    private String address;

    // getter methods
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Encapsulation {
    public static void invoke() {
        Student s1 = new Student();
        // Accessing or Modifying the data members is done using setter and getter methods only
        //  s1.name = "John"; // not allowed
        s1.setName("John");
        s1.setAge(20);
        s1.setAddress("New York");
    }
}