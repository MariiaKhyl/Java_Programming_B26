package day09_Scanner;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        /*
        create a Scanner object
        ask the user to enter 2 numbers
        check if the numbers are equal to each other
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = input.nextInt();
        System.out.println("Enter number 2");
        int number2 = input.nextInt();
        System.out.println("The number are equal " + (number1 == number2));


    }
}
