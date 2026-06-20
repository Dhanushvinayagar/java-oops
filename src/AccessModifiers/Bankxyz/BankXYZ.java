package AccessModifiers.Bankxyz;
import AccessModifiers.Bankabc.BankABC;


class BankABCDetails extends BankABC{
    
    void details() {
        System.out.println("Diff package and Child class --");
        System.out.println("Bank ABC name from XYZ package : " + super.name);
        // can access protected in the other package whenn it is extended
        System.out.println("Bank ABC year started from XYZ package : " + super.year_started);

        // cannot access default/private in the other package it throws error
        // System.out.println("Bank ABC customer_count from XYZ package : " + super.customer_count);
        // System.out.println("Bank ABC access_key from XYZ package : " + super.access_key);
    }
}

public class BankXYZ {
    public static void bank(){

        System.out.println("-----BankXYZ-----");

        BankABC b_abc = new BankABC();
        System.out.println("Diff pack not Child Class --");
        System.out.println("Bank ABC name from XYZ package : " + b_abc.name);


        // cannot access default/private in the other package it throws error
        // System.out.println("Bank ABC year_started from XYZ package : " + b_abc.year_started);
        // System.out.println("Bank ABC customer_count from XYZ package : " + b_abc.customer_count);
        // System.out.println("Bank ABC access_key from XYZ package : " + b_abc.access_key);


        // BankABCDetails abc = new BankABCDetails();
        // abc.details();

    }
}