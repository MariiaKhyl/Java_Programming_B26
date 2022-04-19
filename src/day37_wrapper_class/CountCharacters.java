package day37_wrapper_class;

import java.util.Arrays;

public class CountCharacters {

    /*
    given some string, count the number of uppercase letter, lowercase letter, number, and other characters

    aP3d572&*jd@jdJU
     */

    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";
        int lowerCase = 0, upperCase = 0, numbers = 0, other = 0;
        String  upperLetters = "";

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);

            if (Character.isUpperCase(letter)) {
                upperCase++;
                upperLetters += letter;
            } else if (Character.isLowerCase(letter)) {
                lowerCase++;
            } else if (Character.isDigit(letter)) {
                numbers++;
            } else {
                other++;
            }
        }
        System.out.println("Uppercase: "+upperCase+"\nLowercase: "+lowerCase+"\nNumbers: "+numbers+"\nOther: "+other);
        System.out.println("Upparecase letters: "+ Arrays.toString(upperLetters.toCharArray()));

    }
}