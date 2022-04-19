package home_work_day39;

import java.util.ArrayList;
import java.util.Arrays;

public class GetUppercaseToLowercase {
    public static void main(String[] args) {
        /*
        Get Uppercase or Lowercase
Write a program that can extract the uppercase and lowercase characters from a String and store them into separate ArrayLists of Characters
                        Ex:
                        str = “heLLoWoRlD
                        list1: {h, e, o, o, l}
                        list2: {L, L, W, R, D}
         */
        String  str = "heLLoWoRlD";

        String upperLetter = "";
        String lowerLetter = "";


        ArrayList<Character> up = new ArrayList<>();
        ArrayList<Character> low = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int other = 0;
            char each = str.charAt(i);
            if(Character.isUpperCase(each)){
                upperLetter+=each;
                up.add(other, each);
                other++;
            }else if (Character.isLowerCase(each)){
                lowerLetter+=each;
                low.add(other,each);
                other++;
            }

        }

        System.out.println(up);
        System.out.println(low);




    }
}
