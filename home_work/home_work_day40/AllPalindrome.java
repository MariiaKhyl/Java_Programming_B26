package home_work_day40;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    public static void main(String[] args) {
        /*
        All Palindrome
Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings. Ignore case sensitivity
                Ex:
                Input:
                "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
                Output:
                Anna, Racecar, Level, Eye
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrome(list));
    }

    public static ArrayList<String> allPalindrome(ArrayList<String> list) {

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {
            each = each.toLowerCase();
            String reversed = "";
            for (int i = each.length()-1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            if (each.equals(reversed)) {
                result.add(each);
            }
        }

        return result;
    }
}
