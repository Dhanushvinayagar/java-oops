// Interface - It contains abstract methods so multiple classes can implements it by defining the function body
// Interface cannot have constructors
// Variables are public,static and final by default in interface.
// Methods are public, abstarct and final by default in interface.
// Multiple inheritance is achived via interface
// Class can implement multiple interfaces
package Interfaces;
import Interfaces.ProperUsage.InterfaceUsage;


public class InvokeInterfaces {
    public static void invoke() {
        System.out.println("Interface");
        // InterfaceImplementation.call();
        // InterfaceUsage.call();
        // Extending.invoke();
        NestedInterface.invoke();
    }
}