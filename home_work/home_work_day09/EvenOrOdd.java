package home_work_day09;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        /*
        Ask the user to enter an int number. Determine if the number is even or odd
        Print a boolean for both even and odd
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the hole number ");
        int customerNumber = input.nextInt();
        boolean evenNumber = customerNumber % 2 == 0;
        boolean oddNumber = customerNumber % 2 == 1;
        System.out.println(customerNumber+"- is it even number? "+ evenNumber);
        System.out.println(customerNumber+"- is it odd number? " + oddNumber);

    }

}
