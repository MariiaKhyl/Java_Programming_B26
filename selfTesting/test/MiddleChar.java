package test;

import java.util.Scanner;

public class MiddleChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length()%4==0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }
        if (word.length()%2==1){
            System.out.println(word.substring(word.length()/2, word.length()/2+1));
        }



    }


}
