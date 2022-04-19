package home_work_day40;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        /*
        Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
                Ex:
                Input:
                ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
                letter: ‘a’
                Output: 6
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(countLetters(list, 'j'));
    }
    public static int countLetters (ArrayList<String> list, char letter){

        int count = 0;

        for (String each : list) {

            for (int i = 0; i < each.length(); i++) {

                if (each.charAt(i) == letter){

                    count++;
                }

            }

        }
        return count;
    }

}
