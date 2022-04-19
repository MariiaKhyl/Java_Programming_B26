package home_work_day39;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparatePartsHW {
    public static void main(String[] args) {
        /*
        Separate Parts
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                    Ex:
                    str = "ABCD123$%#@&456EFG!"
                    list1: {$, %, #, @, &, !}
                    list2: {A, B, C, D, E, F, G}
                    list3: {1, 2, 3, 4, 5, 6}
         */

        String str = "ABCD123$%#@&456EFG!";
        char other = ' ';
        char upperLotters = ' ';
        int digits = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(Character.isUpperCase(each)){
                upperLotters++;
            }else if (Character.isDigit(each)){
                digits++;
            }else{
                other++;
            }

        }

        ArrayList<Character> up = new ArrayList<>(Arrays.asList(upperLotters));
        System.out.println(up);

    }
}
