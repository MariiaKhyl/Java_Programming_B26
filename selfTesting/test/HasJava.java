package test;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length()>5) {

            if (word.substring(0, 4).equals("java")) {
                exists = true;

            }
            if (word.substring(1, 5).equals("java")) {
                exists = true;
            }

            System.out.println(exists);

        }

        else{
            System.out.println(exists);

        }




    }

}
