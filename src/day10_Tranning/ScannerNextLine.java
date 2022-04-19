package day10_Tranning;

import java.util.Scanner;

public class ScannerNextLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is today");
        String day = scanner.nextLine();

        System.out.println("Enter your first name");
        String firstName = scanner.next();

        System.out.println("Enter your last name");
        String lastName = scanner.next();

        scanner.nextLine(); // to enter scanner from the next line above is absorbed here

        System.out.println("What is your address");
        String address = scanner.nextLine();

        System.out.println("Today is " + day);
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);
        System.out.println("Address " + address);


    }
}
