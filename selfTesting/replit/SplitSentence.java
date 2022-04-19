package replit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] split=sentence.split(" ");
        for (String each : split){
            System.out.println(each);

        }




    }

}
