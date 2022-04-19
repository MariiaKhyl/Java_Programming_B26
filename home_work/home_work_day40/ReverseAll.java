package home_work_day40;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseAll {
    public static void main(String[] args) {

        /*
        Reverse All
Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
                        @param words - Given ArrayList of Strings
                        @return - ArrayList of Strings
                        Ex:
                        Input: {"ted", "talk", "learn"}
                        Output: {"det", "klat", "nrael"}
         */
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(arrList));
    }

    public static ArrayList<String> reverseAll(ArrayList<String> arrList) {

        ArrayList<String> list = new ArrayList<>();
        String reversed = "";

        for (String each : arrList) {
            reversed="";
            for (int i = each.length()-1;i>=0;i--){

                reversed+=each.charAt(i);
            }
            list.add(reversed);
        }
        return list;

    }

}
