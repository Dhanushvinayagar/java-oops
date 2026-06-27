package Interfaces;

class Num {
    public interface Func {
        public void oddOrEven(int num);
    }
}

class MathOperation implements Num.Func {
    public void oddOrEven(int num) {
        System.out.println("Number is " + (num%2==0 ? "Even" : "Odd"));
    }
}

public class NestedInterface {

    public static void invoke() {
        MathOperation m = new MathOperation();
        m.oddOrEven(100);
        m.oddOrEven(201);
    }
}