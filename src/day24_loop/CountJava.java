package day24_loop;

public class CountJava {

    public static void main(String[] args) {

        /*
        java is a language
        0123

        java 0,4
        ava  1,5
        va i 2,6

         */
        String str = "java is a java language.java";
        int count = 0;

        for ( int i=0; i< str.length()-3; i++){ // i<=str.length()-4;


            String everyFour = str.substring(i, i+4);
            System.out.println(everyFour);
            if (everyFour.equals("java")){
                count++;
            }

        }
        System.out.println(count);

        /*
         we did substring (i, i+4) to ready every four char in the String.

         doing i+4 causes the program to out of bounds

         so to fix it we tried i < str.length() - 4
         but -4 skipped the last 4 char in the String

         so either you had to do:
         i <=str.length()-4
         or i< str.length() -3

         because the second number is in substring is not included in the result



         */





    }
}
