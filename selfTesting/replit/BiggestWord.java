package replit;

import java.util.Scanner;

public class BiggestWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        String bigger = words[0];

        for (String each : words){

            if (each.length() > bigger.length()){
                bigger = each;
            }

        }
        System.out.println(bigger);






    }
}
