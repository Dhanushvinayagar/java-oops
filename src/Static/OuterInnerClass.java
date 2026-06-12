package Static;

// Outer Class cannot be static

public class OuterInnerClass {

    // works just as a normal class 
    // since it depends on outer class static helps to access inner class without creating an object to outer class
    static class InnerClass {
        String name;

        InnerClass(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println("Static Inner Class :" + this.name);
        }
    }

    class NonStaticInnerClass {
        public void print() {
            System.out.println("Non Static Inner Class");
        }
    }

    public static void invoke() {


        // -- Since NonStaticInnerClass is dependent on OuterClass
        // we need to create an object of OuterClass to access NonStaticInnerClass
        // -- error: non-static variable this cannot be referenced from a static context

        // NonStaticInnerClass ns_inner = new NonStaticInnerClass();
        // ns_inner.print();

        OuterInnerClass o = new OuterInnerClass();
        NonStaticInnerClass inner2 = o.new NonStaticInnerClass();
        inner2.print();

        // But if the inner class is static then it can be accessed directly
        // Without object creation for outer class
        InnerClass a = new InnerClass("ABCD");
        InnerClass b = new InnerClass("EFGH");
        a.print();
        b.print();
    }
}