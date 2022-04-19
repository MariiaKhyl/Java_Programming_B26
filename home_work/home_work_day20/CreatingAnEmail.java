package home_work_day20;

import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {

      /*
      [Creating an email]
Ask user to enter two strings. Both strings should be at least 6 character long.
If they are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string.
At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sentence not less than 6 characters");
        String word1 = scanner.next().toLowerCase().trim();
        System.out.println("Please enter sentence not less than 6 characters");
        String word2 = scanner.next().toLowerCase().trim();

        if (word1.length() < 4 && word2.length() <4){
            System.out.println("Invalid data");
        }else{

            String first = word1.substring(0,4);
            String second = word2.substring(2+1);
            String together = first+second;
            System.out.println(together+"@cybertek.com");







        }









    }
}
