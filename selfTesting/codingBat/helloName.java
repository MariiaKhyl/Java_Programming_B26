package codingBat;

public class helloName {
    public static void main(String[] args) {
        String name = "Bob";
        System.out.println(helloName(name));
    }

    public static String helloName(String name) {

        String hello = "Hello";
        return hello+" "+name+"!";
    }
}
