package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        // how to compare String values --> use .equals();
        System.out.println(name.equals("james"));

        System.out.println("cat".equals("dog"));

        System.out.println(name.equals("James"));
        System.out.println(name.equalsIgnoreCase("James"));


        String a = new String ("hello");
        String b = new String ("hello");
        System.out.println(a.equals(b));

        String abc = new String("mariia");
        String cba = new String("Mariia");
        System.out.println(abc.equals(cba));

        System.out.println(a.equals("hello"));

        String last = "today was fun";
        System.out.println(last.length());

        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("today"));
    }


}
