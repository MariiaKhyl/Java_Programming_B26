package test;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();




        if (word.toLowerCase().startsWith("x")){
            word = word.substring(1);

        }
        if (word.toLowerCase().endsWith("x")){
            word=word.substring(0, word.length()-1);
        }else{
            System.out.println(word);
        }







    }
}
