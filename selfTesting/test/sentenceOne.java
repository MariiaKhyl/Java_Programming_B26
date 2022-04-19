package test;

import java.util.Scanner;

public class sentenceOne {
    public static void main(String[] args) {

        /*

        java is a language
        0123

        java 0,4
        ava  1,5
        va i 2,6

         */

        String sentence = "java is a language is java jav java";
        int result = 0;

        for (int i=0; i<=sentence.length()-4; i++){

            String everyFour= sentence.substring(i,i+4);


            if (everyFour.contains("java")){

                result++;
            }


        }

        System.out.println(result);

    }
}
