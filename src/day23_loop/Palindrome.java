package day23_loop;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        /*
        Palindrome: it's the same reading from the beginning and end
        ex:
        mom
        racecar
        anna
        madam
        Task: check if a word is palindrome

        Flow declare some initial String
        how to reverse a String



        Scanner scanner = new Scanner (System.in);
        String word = scanner.nextLine();
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {

          reverse+=word.charAt(i); // char are being read from the end and being added backwards into reverse String

        }

        if (word.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

        System.out.println(word.equals(reverse)? "Palindrome":"Not Palindrome");

         */
        Scanner scanner = new Scanner (System.in);

        String word = scanner.nextLine();
        String newWord = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            newWord += word.charAt(i);
            System.out.println(newWord);
        }
            if(word.equalsIgnoreCase(newWord)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Non Palindrome");
            }





    }

}
