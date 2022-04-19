package day41_array_list;

import day40_array_list.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Reversal {
    public static ArrayList<String> reversedAll (ArrayList<String> list){

        ArrayList<String> reverseWords = new ArrayList<>();

        for (String each : list) {

            reverseWords.add(StringUtil.reverse(each)); // we call the reverse method in StringUtil class to reverse each word, each element, then we are adding the reversed word into the "reverseWords" ArrayList

        }
        return reverseWords;
    }

    public static void main(String[] args) {
        /*
        Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
                @param words - Given ArrayList of Strings
                @return - ArrayList of Strings
                Ex:
                Input: {"ted", "talk", "learn"}
                Output: {"det", "klat", "nrael"}
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reversedAll(list));

        System.out.println(reversedAll(ArrayListWithMethods.getDaysOfWeek()));

    }
}
