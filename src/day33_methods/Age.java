package day33_methods;

import java.util.Scanner;

public class Age {
    /*
    Make a method that calculate and prints the age
    takes the birth year as an input
     */

    public static void getAre(int birthYear){
        System.out.println("Age: "+(2022 - birthYear));

    }

    public static void main(String[] args) {

        getAre(1993);

        int year = 1990;
        getAre(year);

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your birth year");
        getAre(scanner.nextInt());

    }


}
