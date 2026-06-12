package Pillars.Inheritance;
// Multi Level Inheritance - It is a mechanism to extend the properties of parent class to only one child class and child class to another grand child class
// super - variables/method/constructor to refer its parent class

// this - check if variables/method is there in the child class 
// If missing checks it parent, if it is missing there too it will check grandparent


//     Meta FB
//        |  extends
//        FB
//        | extends
//    Instagram

class MetaFB {
    String name;
    int people_working = 200000;
    int working_hours = 8;

    MetaFB(String name) {
        this.name = name;
    }

     public void getName() {
        System.out.println("Meta FB Name: " + this.name);
    }
}

class FB extends MetaFB {

    int people_working = 100000;

    FB(String name) {
        super(name);
    }

    public void getName() {
        System.out.println("FB Name: " + this.name);
    }
}

class Instagram extends FB {    

    int installed_people = 100000000;

    Instagram(String name) {
        super(name);
    }

    public void getDetails() {
        System.out.println("Instagram Name: " + this.name + " People working " + super.people_working);
        System.out.println("Working hrs : " + super.working_hours);
    }
}


public class MultiLevelInheritance {
    public static void invoke() {
        Instagram ig = new Instagram("Instagram");
        ig.getDetails();

        // Child object refering Parent type
        // In this the Parent(MetaFB) class based properties only be accessed not property of child/grandchild
        MetaFB m = new Instagram("InstaFB");
        System.out.println("Parent referring Child " + m.name);
        // -- Throws error accessing installed_people
        // System.out.print("Installed people " + m.installed_people);

        // This is not possible as the Instagram properties are missing in the MetaFB
        // Instagram i = new MetaFB("Insta");

    }
}