package home_work_day26;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        /*
        Unique characters
        Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		BDF

	-> the characters B D and F are only found in the String once so they are unique
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String word = scanner.nextLine();
        String unique = "";
        int number = 0;

        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j <word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    number++;
                }

            }
            if (number >1) {

            }else if (!unique.contains("" + word.charAt(i))) {
                    unique += word.charAt(i);
                }

            number = 0;
        }
        System.out.println(unique);

    }
}
