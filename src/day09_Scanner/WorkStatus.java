package day09_Scanner;

import java.util.Scanner;

public class WorkStatus {

    public static void main(String[] args) {

        /*
        Task

        create Scanner object
        ask the user to enter theis first name - next
        ask the user to enter theis last name - next
        ask the user if theis are employed - boolean
        ask the user if they are a student - boolean
         */

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        System.out.println("Are you employed? ");
        boolean employed = input.nextBoolean();
        System.out.println("Are you a student? ");
        boolean student = input.nextBoolean();

        String details = firstName + " " +lastName +" is employed "+employed+ " and they are a students "+ student;
        System.out.println(details);


    }

}
