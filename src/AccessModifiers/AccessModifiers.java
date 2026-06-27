package AccessModifiers;
import AccessModifiers.Bankabc.BankABC;
import AccessModifiers.Bankxyz.BankXYZ;

// Access Modifiers - It is a keyword which is used to restrict the access of the class members

// 1. Public - accessible from anywhere (even outside the package)
// 2. Private - accessible only within the class
// 3. Protected - accessible anywhere within the package and its subclasses(inherited subclasses - even outside the package)
// 4. Default - accessible within the package 

// Table
//  This is applicable for variables, methods, constructors and  classes
// Access Modifier | Class  | Package | Childclass(same pkg) | Childclass(diff pkg)    | Outside Package & Not ChildCLass
// Public          | Y      | Y       | Y                    | Y                       | Y
// Private         | Y      | N       | N                    | N                       | N
// Protected       | Y      | Y       | Y                    | Y                       | N
// Default         | Y      | Y       | Y                    | N                       | N

public class AccessModifiers {
    public static void invoke() {
        System.out.println("Access Modifiers");
        BankABC.bank();
        // BankXYZ.bank();
    }
}