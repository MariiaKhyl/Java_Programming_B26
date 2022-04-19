package day15_switch;

import java.util.Scanner;

public class DayInWeek {

    public static void main(String[] args) {

        /*
        Given a day number, find and print the day related to the number

        1- Monday
        2 - Tuesday

        6 - Saturday
        7 - Sunday

         */
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter week day: 1-7");
        int day = input.nextInt();
        String day2 = "";
        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }

        // or Saim

        switch (day){
            case 1 :
                day2 = "Monday";   // System.out.println("Monday)
                break;
            case 2 :
                day2 = "Tuesday";
                break;
            case 3 :
                day2 = "Wednesday";
                break;
            case 4:
                day2 = "Thursday";
                break;
            case 5 :
                day2 = "Friday";
                break;
            case 6 :
                day2 = "Saturday";
                break;
            case 7 :
                day2 = "Suturday";
                break;
            default :
                day2 = "Not a value day";




        }


    }

}
