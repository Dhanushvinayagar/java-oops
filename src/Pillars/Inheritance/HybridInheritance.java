package Pillars.Inheritance;

// Hybrid Inheritance - It is a mechanism to extend the properties of parent class to multiple child class and child class to another grand child class


//              Parent
//   extends   /     \  extends
//        Child1  Child2
//             \    /
//          GrandChild


// Not possible because java does not support multiple inheritance for GrandChild
// class GrandChild extends Child1, Child2 {}

// Solution: Use Interface instead 


class ElectronicDevice {
    void powerOn() {
        System.out.println("Device Powered On");
    }
}

interface Camera {
    void takePhoto();
}

interface Charger {
    void charge();
}

class SmartPhone extends ElectronicDevice
        implements Camera, Charger {

    public void takePhoto() {
        System.out.println("Photo Captured");
    }

    public void charge() {
        System.out.println("Charging Device");
    }
}

public class HybridInheritance {
    public static void invoke() {
        SmartPhone sp = new SmartPhone();
        sp.powerOn();
        sp.takePhoto();
        sp.charge();
    }
}