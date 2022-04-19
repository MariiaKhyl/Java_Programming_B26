package home_work_day40;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    public static void main(String[] args) {
        /*
    String numbers to sum
Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
Return the ArrayList of summed numbers
                    Ex:
                    Input:
                    “123”, “34”, “513”
                    Output:
                    [ 6, 7, 9 ]
     */
        ArrayList<String> str = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(numbersOfSum(str));
    }

    public static ArrayList<Integer> numbersOfSum(ArrayList<String> str) {

        ArrayList<Integer> added = new ArrayList<>();

        for (String each : str) {
            int count = 0;
            for (int i = 0; i < each.length(); i++) {

                count += Integer.parseInt(each.charAt(i) + "");
            }
            added.add(count);

        }
        return added;
    }


}
