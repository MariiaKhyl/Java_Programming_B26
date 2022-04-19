package day25_loop_recap;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        /*
        Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday

         */

        Scanner scanner = new Scanner (System.in);
        System.out.println(" please enter something");
        String str = scanner.nextLine().toLowerCase();
        String newest = str.substring(0,1);

        for (int i = 1; i<str.length();i++){

            if (str.charAt(i-1)==' '){
                newest+=str.substring(i,i+1).toUpperCase();// (""+str.charAt(i)).toUpperCase(). sub(i,i+1) is the same as charAt(i) but the type are differen
            }else{
                newest+=str.charAt(i);
            }

        }
        System.out.println(newest.replaceAll(" ",""));

       // if (i != 0 && str.charAt(i-1)==0

    }
}
