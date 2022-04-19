package day33_methods;

import java.util.Scanner;

public class Greeting {

    public static void hello(String name){

        System.out.println("hello "+name + " , how are you?");

    }

    public static void main(String[] args) {
        hello("James");
        hello("Victoria");

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        hello(name);
        // hello(scanner.nextLine())
    }
}
