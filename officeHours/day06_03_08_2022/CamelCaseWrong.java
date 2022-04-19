package day06_03_08_2022;

import java.util.Scanner;

public class CamelCaseWrong {

    public static void main(String[] args) {

        /*
        Given a String of words that follow Camel Case convention.

				Every word, except the first word, begin with an uppercase letter.
				The other characters of the word will be lowercase


				-  Find and print each words are in the given String.

						Input:  neverGiveUp
						Output: Never
								Give
								Up
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the word");
        String word = scanner.nextLine();
        String newWord = "";

        for (int i = 0; i <=word.length();i++){

            if (word.charAt(i)>='A' && word.charAt(i)<='Z'){

                newWord+=word.substring(0, i+1).toUpperCase();

            }else{
                newWord+=word.charAt(i);
            }

            System.out.println(newWord);
        }

    }

}
