package Pillars.Inheritance;
// Hierarchial Inheritance - It is a mechanism to extend the properties of parent class to multiple child class


//            Account
//   extends   /     \  extends
//        Savings  Current

class Account {
    int account_no;
    String name;
    float balance;

    public Account(int account_no, String name, float balance) {
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
    }
    
    public void getDetails() {
        System.out.println("Account No: " + this.account_no + " Name: " + this.name + " Balance: " + this.balance);
    }
}

class Savings extends Account {
    int interest_rate = 10;

    Savings(int account_no, String name, float balance) {
        super(account_no, name, balance);
    }

    @Override
    public void getDetails() {
        System.out.println("Account No: " + this.account_no + " Name: " + this.name + " Balance: " + this.balance + " Interest Rate: " + this.interest_rate);
    }
}

class Current extends Account {
    int overdraft_limit = 10000;

    Current(int account_no, String name, float balance) {
        super(account_no, name, balance);
    }

    @Override
    public void getDetails() {
        System.out.println("Account No: " + this.account_no + " Name: " + this.name + " Balance: " + this.balance + " Overdraft Limit: " + this.overdraft_limit);
    }
}

public class HierarchialInheritance {

    public static void invoke() {
        Savings s1 = new Savings(1, "Savings", 10000);
        s1.getDetails();

        Current c1 = new Current(2, "Current", 20000);
        c1.getDetails();

        Account a1 = new Account(3, "Account", 30000);
        a1.getDetails();
    }
}