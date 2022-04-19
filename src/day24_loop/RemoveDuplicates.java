package day24_loop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        /*
        Remove Duplicates
Write a program that can remove duplicates from a String
    Ex:
   Input: abcabc
    Output: abc
         */

        String s = "abcabc";
        String unique = "";

        for (int i = 0; i <s.length(); i++){

            if (!unique.contains(""+s.charAt(i))) { // or substring (i, i+1)
                unique += s.charAt(i);

            }
        }

        System.out.println(unique);

    }
}
