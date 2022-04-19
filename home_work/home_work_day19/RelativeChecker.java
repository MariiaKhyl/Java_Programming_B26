package home_work_day19;

import java.util.Scanner;

public class RelativeChecker {

    public static void main(String[] args) {

        /*
        [Relative checker]
Given two full names check if the two people are related. They will be considered to be related if they have the same last name
Ex:
Input:
James Bond
Jamie Bond
Output:
Related
Input:
James Bond
Alex Benji
Output:
Not Related
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your full name");
        String firstPerson = scanner.nextLine();
        System.out.println("Please enter your full name");
        String secondPerson = scanner.nextLine();

        boolean one = firstPerson.equalsIgnoreCase(secondPerson);
        System.out.println();

    }


}
