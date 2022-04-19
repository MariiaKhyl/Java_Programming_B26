package home_work_day28;

import java.util.Scanner;

public class LongestStringCheck {

    public static void main(String[] args) {

         /*
        Write a program that can return the longest string element from a
String array
         */



            Scanner input = new Scanner(System.in);
            System.out.println("Enter array length");
            String [] arr = new String[input.nextInt()];
            int longest = Integer.MIN_VALUE;
            String res = "";
            input.nextLine();

            for (int i = 0; i < arr.length; i++) {
                System.out.println("enter a word");
                arr[i] = input.nextLine();
            }

            for (int i = 0; i < arr.length; i++) {
                if(arr[i].length() >= longest){
                    if(arr[i].length() == longest){
                        res += ", " + arr[i];
                    } else{
                        res = arr[i];
                    }
                    longest = arr[i].length();
                }
            }

            System.out.println("\n--------RESULT--------");
            System.out.println("the longest word length: " + longest + ": " + res);
        }

    }

