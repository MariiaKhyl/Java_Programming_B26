package home_work_day09;

import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        /*
        Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
         */

        Scanner input = new Scanner(System.in);
        /*System.out.println("Please enter a number ");
        int enterNumber = input.nextInt();
        boolean isDivisibleBy2 = enterNumber % 2 == 0;
        System.out.println("Is the number divisible by 2? " + isDivisibleBy2);
        boolean isDivisibleBy3 = enterNumber % 2 == 0;
        System.out.println("Is the number divisible by 3? " + isDivisibleBy3);
        boolean isDivisibleBy5 = enterNumber % 5 == 0;
        System.out.println("Is the number divisible by 5? " + isDivisibleBy5);
         */
        System.out.println("Enter a number");
        int num = input.nextInt();

        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;
        System.out.println("By 2 " + by2);
        System.out.println("By 3 " + by3);
        System.out.println("By 5 " + by5);


    }

}
