package more_practice.week2;

import day20_04_26_27_2022.newAccessModifiers.Same;

public class Tasks {
    /*
    1) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

2) String - Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false;

3) String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC

4) String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";

5) String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverseString(String str) {

        String string = "";
        for(int i = str.length()-1; i >= 0; i--){
            string+=str.charAt(i)+"";
        }
        return string;
    }
//    2) String - Same letters
//    Write a return method that check if a string is build out of the same letters as another string.
//    Ex:  same("abc",  "cab"); -> true
//    same("abc",  "abb"); -> false;

    public static boolean sameLetter1 (String str, String str2){

        for(int i= 0; i < str.length(); i++){

            if (str.length() == 0 || str2.length() == 0){
                return false;
            }

            if (str.length() != str2.length()){
                return false;
            }

            if (!str2.contains(str.charAt(i)+"") || !str.contains(str2.charAt(i)+"")){
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {
        System.out.println(reverseString("cat"));
        System.out.println(sameLetter1("abccc","cab"));
    }
}
