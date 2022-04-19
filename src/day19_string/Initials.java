package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {


        /*
            Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letters

            james
            bond
            JB
         */
        Scanner scanner = new Scanner (System.in);
        System.out.println("Your first name ?");
        String firstName = scanner.next().toUpperCase();
        System.out.println("Your last name ?");
        String lastName = scanner.next().toUpperCase();
        //System.out.println(""+firstName.charAt(0)+ lastName.charAt(0));
        String initials = firstName.substring(0,1)+"."+lastName.substring(0,1)+".";
        System.out.println(initials);

    }

}
