package day13_14_03_29_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class P07_Task04 {
    public static void main(String[] args) {
        /*
        Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
         */

        System.out.println(summ("jav45ai1000sgre1at82"));

    }

    public static int summ(String str) {

        ArrayList<Integer> numbers = new ArrayList<>();
        String strNumber = "";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char chrchar = str.charAt(i);

            if (Character.isDigit(chrchar)) {
                strNumber += chrchar;
            }

            if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                numbers.add(Integer.valueOf(strNumber));
                    strNumber = "";
                }
            }


        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }


}



