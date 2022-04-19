package day25_loop_recap;

import java.util.Scanner;

public class SpaceProgram {
    /*
    Space program [String, Loops]

Given a String return a version of with spaces between all the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the word with spaces");
        String str = scanner.nextLine();
        String word = "";

        for (int i=0; i < str.length(); i++){

            if (str.charAt(i)==' '){
                word+= "_ ";
            }else{
                word+= str.charAt(i)+" ";
            }

        }
        System.out.println(word.trim());






    }
}
