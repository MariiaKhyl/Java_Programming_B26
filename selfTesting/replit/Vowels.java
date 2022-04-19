package replit;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();





        for (int i = 0; i < word.length(); i++) {

            char each = word.charAt(i);

            if (each == 'a' || each == 'e' || each == 'i' || each == 'o' || each == 'u') {
                System.out.print(each);
            }

        }


    }
}
