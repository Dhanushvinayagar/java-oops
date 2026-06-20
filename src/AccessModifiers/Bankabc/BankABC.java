package AccessModifiers.Bankabc;

public class BankABC {
    int customer_count = 1000;
    public String name = "BankABC";
    private String access_key = "1234";
    protected String year_started = "1234";

    public static void bank(){
        System.out.println("BankABC");

        User u1 = new User("Jake",120393.29f,122242343,21);
        u1.getDetails();
        u1.getBankDetails();

        // cannot access private access modifier in child class
        Employee e1 = new Employee("Jake",120393.29f,122242343,21);
        e1.getEmployeeDetails();

        // Upcasting - Parent class reference can point to child class object
        // Here private access modifier can be accessed as it's reference is of parent class
        User ue1 = new Employee("Jake",120393.29f,122242343,21);
        ue1.getDetails();
    }
}