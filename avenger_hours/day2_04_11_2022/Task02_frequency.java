package day2_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task02_frequency {
    public static void main(String[] args) {

        String str = "AABCCDDEE";
        String [] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));

        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArray));
        System.out.println(strList);

        String result = "";

        for ( String each: strList) {
            int freq = Collections.frequency(strList,each);

            if (result.contains(each)){
                continue;
            }

            result+=each+freq;
        }
        System.out.println(result);

        String str2 = "AABCCDDEE";

        char[]chArray = str2.toCharArray();
        System.out.println(Arrays.toString(chArray));

        ArrayList<Character> chList = new ArrayList<>();

        for (Character each : chArray) {

            chList.add(each);
        }
        System.out.println(chList);

        String result2="";

        for (Character each : chList) {
            int freq2 = Collections.frequency(chList,each);

            if (result2.contains(""+each)){
                continue;
            }

            result2+=""+each+freq2;
        }
        System.out.println(result2);

    }
}
