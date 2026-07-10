package Generics;

class Staff {
    String name;
    int age;
    Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Generic method
    public <T> T showDetails(T val) {
        System.out.println("Generic Method : "+ val);
        return val;
    }
}

class Response<T> {
    T data;
    String msg = "Success";

    Response(T data) {
        this.data = data;
    }

    Response(T data, String msg) {
        this.data = data;
        this.msg = msg;
    }

    void showResponse() {
        System.out.println("Response: " + data + " " + msg);
    }
}
class Pair<K,V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
} 

public class Generics {
    public static void invoke() {
        System.out.println("Generics");

        Response<String> r1 = new Response<>("Hello");
        r1.showResponse();

        Response<Integer> r2 = new Response<>(10);
        r2.showResponse();

        Response<Boolean> r3 = new Response<>(false, "Failed");
        r3.showResponse();

        Staff s1 = new Staff("John", 20);
        Response<Staff> r4 = new Response<>(s1);
        r4.showResponse();
        s1.showDetails("Hello");
        s1.showDetails(10);


        Pair<String, Integer> p1 = new Pair<>("counter", 10);
        System.out.println("Pair : " +p1.key + " " + p1.value);

    }
}