package home_work_day20;

import java.util.Scanner;

public class ReplaceProgram {
    public static void main(String[] args) {

        /*
        [ Replace program] Will do this later when we learn replace method
Given a String message with some text and a number (1-3) replace certain characters from the String message.
When the number is:
1: replace 'a' with 'e'
2: replace 's' with 'r'
3: replace 'o' with 'z'
Ex:
message: java class is fun
number: 1
Output: jeve cless is fun
Ex:
message: java class is fun
number: 2
Output: java clarr ir fun
         */
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter message");
        String message = scanner.nextLine();
        String message1 = message.replace('a','e');
        String message2 = message.replace('s','r');
        String message3 = message.replace('o','z');
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);

















    }
}
