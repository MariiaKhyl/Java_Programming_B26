package day20_string;

import java.util.Scanner;

public class MoveFirstWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String sentence = scanner.nextLine().trim();

        int spaceIndex = sentence.indexOf(' ');

        String firstWord = sentence.substring(0, spaceIndex);
        String second = sentence.substring(spaceIndex+1);
        System.out.println(second+ " "+ firstWord);





    }

}
