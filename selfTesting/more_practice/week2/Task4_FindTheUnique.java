package more_practice.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4_FindTheUnique {
    /*
    4) String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }

    public static String uniqueChar(String str) {

        String result = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : list) {

            int frequency = Collections.frequency(list, each);
            if (result.contains(each)) {
                continue;
            }
            if (frequency <= 1) {
                result += each;
            }
        }
        return result;
    }
}