package home_work_day18;

import java.util.Locale;
import java.util.Scanner;

public class Title {

    public static void main(String[] args) {

        /*
ask the user to enter their name including titles
use the following titles to determine how to refer to the person as

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them

         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your name including titles");
        String nameTitles = scanner.nextLine().toLowerCase();

        /*if (nameTitles.toLowerCase().contains("mr") || nameTitles.toLowerCase().contains("mister")){
            System.out.println("Hello Sir");
        }
        else if (nameTitles.toLowerCase().contains("ms") || nameTitles.toLowerCase().contains("miss") || nameTitles.toLowerCase().contains("madam")){
            System.out.println("Hello Ma'am");

        }
        else if (nameTitles.toLowerCase().contains("dr")){
            System.out.println("Hello Doctor");
        }
        else if (nameTitles.toLowerCase().contains("sr")){
            System.out.println("Nice to meet you Senior");
        }
        else if (nameTitles.toLowerCase().contains("jr")){
            System.out.println("Nice to meet you Junior");
        }
        else{
            System.out.println("please enter valid title");
        }

         */

        if (nameTitles.startsWith("mr") || nameTitles.startsWith("mister")){
            System.out.println("Hello Sir");
        }else if (nameTitles.startsWith("ms ") || nameTitles.startsWith("miss") || nameTitles.startsWith("madam")){
            System.out.println("Hello Ma'am");
        }else if (nameTitles.startsWith("dr ")){
            System.out.println("Hello Doctor");
        }

        if (nameTitles.endsWith(" sr")){
            System.out.println("Nice to meet you Senior");
        }else if (nameTitles.endsWith(" jr")){
            System.out.println("Nice to meet you Junior");
        }


















    }

}
