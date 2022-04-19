package day24_loop;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        /*
        Given a sentence determine how many words are in the String.
         Ex:
         Input:
        This has multiple words
        Output:
            4
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence");

        String str = scanner.nextLine().trim();
        int spaces = 0;

        for ( int i=0; i< str.length(); i++){

            if (str.charAt(i)== ' '){ // str.substring(i, i+1).equals(" ")
                spaces++;
            }

        }

        System.out.println("Number of words: "+(spaces+1));


    }


}
