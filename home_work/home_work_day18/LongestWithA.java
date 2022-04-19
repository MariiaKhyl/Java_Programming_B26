package home_work_day18;

import day15_switch.one;

import java.util.Scanner;

public class LongestWithA {

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


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three words");
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();
        System.out.println("Please enter character");
        String character= scanner.nextLine();


        String finalResult = "";

        if (one.toLowerCase().contains(character)) {
            finalResult = one;
        }
        if (two.toLowerCase().contains(character)) {
            if (two.length() > finalResult.length()) {
                finalResult = two;
            }
        }
            if (three.toLowerCase().contains(character)){
                if (three.length()> finalResult.length()){
                  finalResult = three;

                }

            }

        System.out.println(finalResult);
        */

        //Saim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three words");
        String one = scanner.nextLine().toLowerCase();
        String two = scanner.nextLine().toLowerCase();
        String three = scanner.nextLine().toLowerCase();

        int oneLen = one.length();
        int twoLen = two.length();
        int threeLen = three.length();


        if (one.contains("a") && oneLen > two.length() && oneLen > threeLen){
            System.out.println(one+" Word one is the biggest");
        }else if (two.contains("a") && twoLen > oneLen){
            System.out.println(two+" Word two is the biggest");
        }else if (three.contains("a") & threeLen > oneLen && threeLen > twoLen){
            System.out.println(three+" Word three is the biggest");
        }else{
            System.out.println("No single largest word with a");
        }













        }

}
