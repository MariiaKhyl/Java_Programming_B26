package day15_switch;

import java.util.Scanner;

public class Schedule {

    public static void main(String[] args) {

        /*

         Task:

            Ask the user to enter which day it is
            print which class we have on that day, and the time of the class
            show if there is office hours

            challenge:
                make each day flexible

                    monday
                    Monday
                    mon

         */


        Scanner input = new Scanner (System.in);
        System.out.println("Please enter which day it is");
        String day = input.next();

        switch (day){

            case "mon":
            case "monday":
            case "Monday":
                System.out.println("Class - Java\nTime - 5 PM\nNone Office hours");
                break;

            case "tues":
            case"tuesday":
            case"Tuesday":
                System.out.println("Class - Java\nTime - 4:30 PM\nWe have Office hours");
                break;

            case "wen":
            case"wednesday":
            case"Wednesday":
                System.out.println("Class - Java\nTime - 4:30 PM\nWe have Office hours");
                break;

            case "thur":
            case "thursday":
            case "Thursday":
                System.out.println("Class - Soft Skills\nTime - 5 PM\nNone Office hours");
                break;

            case "fri":
            case "friday":
            case "Friday":
                System.out.println("Class - Java\nTime - 5 PM\nNone Office hours");
                break;

            case "sat":
            case "saturday":
            case "Saturday":
                System.out.println("Class - Java\nTime - 8 AM\nNone Office hours");
                break;

            case "sun":
            case "sunday":
            case "Sunday":
                System.out.println("Class - Java\nTime - 8 AM\nNone Office hours");
                break;

            default:
                System.out.println("Invalid");









        }





    }



}
