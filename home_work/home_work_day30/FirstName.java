package home_work_day30;

import java.util.Arrays;
import java.util.Scanner;

public class FirstName {

    public static void main(String[] args) {

        /*
        Ask the user to enter their first name. Convert the name into a char array print the first and last letter of the name
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your first name");
        String name = scanner.nextLine();
        char [] charName = name.toCharArray();

        System.out.println(Arrays.toString(charName));
        System.out.println("First letter - "+charName[0]+"\nLast letter - "+charName[charName.length-1]);













    }

}
