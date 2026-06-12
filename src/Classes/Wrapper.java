package Classes;

public class Wrapper {
    
    // call by value - primitive data types do not pass by reference so it is call by value
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public void swap_wrapper(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public void invoke() {

        int a=10,b=20;
        swap(a,b);
        System.out.println(a + " " + b);

        // Integer num1 = new Integer(10); // deprecated
        Integer num1 = 10;
        Integer num2 = 20;
        // Integer is final class so it cannot be extended and it is immutable so its value cannot be changed once assigned
        swap_wrapper(num1,num2);
        System.out.println(num1 + " " + num2);
    }
    
}