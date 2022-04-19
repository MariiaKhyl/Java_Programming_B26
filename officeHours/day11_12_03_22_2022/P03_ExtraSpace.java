package day11_12_03_22_2022;

import java.util.Arrays;

public class P03_ExtraSpace {

    /*
    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
     */
    public static void main(String[] args) {

        String input = "  Hello world      I      love      Java    ";
        removeSpaces(input);



    }
    public static void removeSpaces(String str) {

        String [] s=str.trim().split(" ");
        System.out.println(Arrays.toString(s));

        //System.out.println(s[2].length()); to see we have empty String

        String result = "";
        for (String each : s){

            if (!each.isEmpty()){
                result+=each+" ";
            }

        }
        System.out.println(result);


    }
 /*
    public static void removeExtraSpace(String str){

        str = str.trim();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ' || str.charAt(i) == ' ' && i != str.length() - 1 && str.charAt(i + 1) != ' ' || str.charAt(i) == ' ' && i == str.length() - 1){
              result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";
        removeExtraSpace(str);
     */



}
