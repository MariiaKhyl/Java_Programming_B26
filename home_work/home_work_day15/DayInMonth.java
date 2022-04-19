package home_work_day15;

import java.util.Scanner;

public class DayInMonth {

    public static void main(String[] args) {

        /*
        Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
         */
        Scanner input = new Scanner ( System.in);
        System.out.println("Enter days");
        int days = input.nextInt();
        String month = "";


        switch (days) {

            case 28:
                month = "February";
                break;

            case 30:
                month = "April, June, September, November";

            case 31:
                month = "January, March, May, July, August, October, December";

            default:
                System.out.println("Invalid");

        }
        System.out.println("What is the month?\n"+ month+ "\ndays ?\n"+days);



    }



}
