//  Singleton Pattern - It ensures that a class has only one instance, and provides a global point of access to it.
//  No new instances can be created so memory is saved
package Singleton;

class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton invoked");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

public class InvokeSingleton {

    public void invoke(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}

