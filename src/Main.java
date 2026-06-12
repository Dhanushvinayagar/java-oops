// import - keyword to import the package
import Singleton.InvokeSingleton;
import Classes.InvokeClasses;
import Classes.Wrapper;
import Classes.Final;
import Static.StaticClass;
import Static.OuterInnerClass;
import Pillars.Inheritance.InvokeInheritance;
import Pillars.Polymorphism.Polymorphism;

public class Main {

    public static void main(String[] args) {

        // InvokeSingleton s1 = new InvokeSingleton();
        // s1.invoke();

        // InvokeClasses c1 = new InvokeClasses();
        // c1.invoke();

        // Wrapper wrp = new Wrapper();
        // wrp.invoke();

        // Final f1 = new Final();
        // f1.invoke();

        // StaticClass s = new StaticClass();
        // s.invoke();

        // OuterInnerClass outer = new OuterInnerClass();
        // outer.invoke();

        // InvokeInheritance ih = new InvokeInheritance();
        // ih.invoke();

        Polymorphism p1 = new Polymorphism();
        p1.invoke();
    }
}