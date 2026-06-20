package AccessModifiers.Bankabc;

public class User {
    public String name;
    protected float balance;
    private int account_no;
    int age;

    public User(String name, float balance, int account_no, int age) {
        this.name = name;
        this.balance = balance;
        this.account_no = account_no;
        this.age = age;
    }

    public void getDetails() {
        // All access modifiers can be accessed within the class
        System.out.println("Name: " + this.name + " Balance: " + this.balance + " Account No: " + this.account_no + " Age: " + this.age);
    }

    public void getBankDetails(){
        BankABC abc = new BankABC();
        System.out.println(abc.name);
        System.out.println(abc.customer_count);
        System.out.println(abc.year_started);
        // private access modifier can only be accessed within the class
        // System.out.println(abc.access_key);
    }
}

class Employee extends User {
    int employee_id=101;

    public Employee(String name, float balance, int account_no, int age) {
        super(name, balance, account_no, age);
    }

    void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println(super.name);
        System.out.println(super.balance);
        // private access modifier can only be accessed within the class
        // System.out.println(super.account_no);
        System.out.println(super.age);
        System.out.println(this.employee_id);
    }
}