package home_work_day24;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {

        /*
        Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday

         */


        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter sentence");
        String newSen = scanner.nextLine();


       String sentence = "Today is SUNDAY".trim().toLowerCase();

        for (int i = 0; i<sentence.length(); i++){

            if (sentence.charAt(i)==' '){
                System.out.print((""+ sentence.substring(i + 1, i+2).toUpperCase()));
                i++;
            }else{
                System.out.print(sentence.charAt(i));
            }


        }





    }
}
