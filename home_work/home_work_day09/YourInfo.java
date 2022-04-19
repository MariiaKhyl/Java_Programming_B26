package home_work_day09;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {

        /*
        Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age ");
        byte pleaseEnterYourAge = input.nextByte();
        System.out.println("Please enter your favorite number ");
        long pleaseEnterYourFavoriteNumber = input.nextLong();
        System.out.println("Please enter you favorite book");
        String pleaseEnterYourFavoriteBook = input.next();

        String answers = "How old are you? \nI'm am "+ pleaseEnterYourAge + " years old.\nWhat is your favorite number?\nMy favorite number is " + pleaseEnterYourFavoriteNumber+". \nWhat is your favorite book?\nMy favorite book is "+ pleaseEnterYourFavoriteBook;
        System.out.println(answers);


    }
}
