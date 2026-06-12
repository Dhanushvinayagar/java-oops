package Pillars.Inheritance;
// Single Inheritance - It is a mechanism to extend the properties of parent class to only one child class
// super - keyword to refer the parent class 
// this - it checks for value/method in current class and if not found it will check in parent class
// private values / methods cannot be inherited

// Inheritance - order of constructor execution
// 1. Parent class constructor
// 2. Child class constructor

// override - keyword to identify override the existing method in parent class

//  Employee
//     | extends
//  Partner

class Employee {

    int employee_id;
    String employee_name;
    float salary;
    private String password = "secret";

    public Employee(int employee_id, String employee_name, float salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.salary = salary;
    }

    public void getId() {
        System.out.println("From Parent Employee ID: " + this.employee_id);
    }

    public void getDetails() {
        System.out.println("Parent Class Details" + this.employee_name);
    }

}

class Partner extends Employee {

    int monthly_bonus = 500;
    int salary = 50000;

    Partner(int employee_id, String employee_name, float salary) {
        // call parent class constructor
        super(employee_id, employee_name, salary);
    }

    @Override
    public void getDetails() {
        System.out.println("Partner Details");
    }

    public void getMonthlySalary() {
        this.getDetails(); // This - Call child class method
        super.getDetails(); // Super - Call parent class method
        System.out.println("Child Salary " + this.salary + " : " + (super.salary + this.monthly_bonus));
        // super.salary - Call parent class variable
        // this.salary - Call child class variable if not found it will check in parent class
    }
}

public class SingleInheritance {
    public static void invoke() {
        Partner m1 = new Partner(1, "John", 100000.5f);
        // If the method is in Child class it will be called
        // Else it will be called from parent class
        m1.getDetails(); 
        m1.getMonthlySalary();
    }
}