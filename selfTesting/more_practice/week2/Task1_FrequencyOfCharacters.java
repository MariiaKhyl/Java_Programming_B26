package more_practice.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1_FrequencyOfCharacters {
    /*
    1) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        String str = "AAABBCDDA";
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char letter = str.charAt(i);
            if (checked.contains("" + letter)) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {

                char eachLetter = str.charAt(j);
                if (letter == eachLetter) {
                    count++;
                }
            }
            checked += letter;
            System.out.print(letter + "" + count);

        }

    }


    public static String FrequencyOfCharacters(String word) {

        String res = "";

        String[] str = word.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

        for (int i = 0; i < list.size(); i++) {
            int freq = Collections.frequency(list, list.get(i));
            if (res.contains(list.get(i))) {
                continue;
            }
            res += list.get(i) + freq;
        }
        return res;

    }
}