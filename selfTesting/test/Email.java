package test;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int first = email.indexOf('_');
        int second = email.indexOf('@');
        int third = email.indexOf('.');


        String firstName = email.substring(0, first);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String lastName = email.substring(first + 1, second);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String domain = email.substring(second + 1, third);
        domain = domain.substring(0,1).toUpperCase()+domain.substring(1);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);


    }


}
