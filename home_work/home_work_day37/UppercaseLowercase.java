package home_work_day37;

import java.util.Arrays;

public class UppercaseLowercase {

/*
Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true
 */


    public static boolean checking(String str) {

        int uppercase = 0;
        int lowercase = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                uppercase++;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                lowercase++;
            }

        }

        if (uppercase == lowercase) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checking("JAVA java"));


        String word = "iotYY65:*aP3d572&*jd@jdJU";
        int numbers = 0, upper = 0, lower = 0, symbols = 0;
        String up = "", low = "", num = "", other = "";

        for (int i = 0; i < word.length(); i++) {

            char letters = word.charAt(i);

            if (Character.isUpperCase(letters)) {
                upper++;
                up += letters;
            }else if (Character.isLowerCase(letters)) {
                lower++;
                low += letters;
            }else if (Character.isDigit(letters)) {
                numbers++;
                num += letters;
            } else {
                symbols++;
                other += letters;
            }


        }
        System.out.println("Uppercase - " + upper + "\nLowercase - " + lower + "\nNumbers - " + numbers + "\nSymbols - " + symbols);
        System.out.println("Upper letters - " + Arrays.toString(up.toCharArray()) + "\nLower letters - " + Arrays.toString(low.toCharArray()) + "\nNumbers - " + Arrays.toString(num.toCharArray())+"\nOther symbols - "+Arrays.toString(other.toCharArray()));
    }


}

