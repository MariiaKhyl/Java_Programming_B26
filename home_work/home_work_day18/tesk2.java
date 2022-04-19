package home_work_day18;

import java.util.Scanner;

public class tesk2 {

    public static void main(String[] args) {

        /*
        create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("please enter three words");
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        String result ="";


        if (first.contains("a")){
            result = first;
        }
        if (second.contains("a")){
            if (second.length() > result.length()){
                result = second;
            }
            }

        if (third.contains("a")){
            if (third.length() > result.length()){
                result = third;
            }
        }

        System.out.println(result);

    }

}
