package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {

    public static void main(String[] args) {

        /*
        first name
        last name

        fix to print proper name:
        capital first letter , the rest of the letter lowercase, no extra space
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();

        firstName =firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixedFirst = firstName.substring(0,1).toUpperCase();
        fixedFirst += firstName.substring(1);

        String fixedLast = lastName.substring(0,1).toUpperCase()+ lastName.substring(1);

        System.out.println(fixedFirst+ " "+fixedLast);


    }






}
