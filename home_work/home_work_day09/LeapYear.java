package home_work_day09;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        /*
        create a class LeapYear
        create a main method
        create a Scanner object

Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4. Print true or false.

        Hint: use remainder operator
         */

        Scanner scanner = new Scanner(System.in);

       /* System.out.println(" Please enter a year ");
        int enterYear = scanner.nextInt();
        boolean leapYear = enterYear == 366 || enterYear != 366;
        boolean isDivisibleBy4 = enterYear % 4 == 0;
        boolean trueOrFalse = isDivisibleBy4;
        System.out.println("Is is a \"Leap Year\"? "+ leapYear+ "\nWe need to divisible by 4 " + isDivisibleBy4+ "\nIs it true? " +trueOrFalse);


        */
        System.out.println("Enter the year");
        int year = scanner.nextInt();

        boolean isLeapYear = year % 4 == 0 || (year % 100 == 0 && 400 != 0);
        System.out.println(isLeapYear);








    }
}
