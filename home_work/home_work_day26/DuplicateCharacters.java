package home_work_day26;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {

        /*
        Duplicate characters

Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String word = scanner.nextLine();
        String newWord = "";
        int number = 0;

        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    number++;
                }
            }


            if (number == 1) {

            } else if (!newWord.contains("" + word.charAt(i))) {
                newWord+=word.charAt(i);

            }

            number = 0;

        }

        System.out.print(newWord);

    }
}
