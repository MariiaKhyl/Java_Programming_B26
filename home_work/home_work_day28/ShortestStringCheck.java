package home_work_day28;

import java.util.Scanner;

public class ShortestStringCheck {
    public static void main(String[] args) {

        /*
        Write a program that can return the shortest string element from a
    String array
         */



            Scanner input = new Scanner(System.in);
            System.out.println("Enter array length");
            String [] arr = new String[input.nextInt()];
            int shortest = Integer.MAX_VALUE;
            String res = "";
            input.nextLine();

            for (int i = 0; i < arr.length; i++) {
                System.out.println("enter a word");
                arr[i] = input.nextLine();
            }

            for (int i = 0; i < arr.length; i++) {
                if(arr[i].length() <= shortest){
                    if(arr[i].length() == shortest){
                        res += ", " + arr[i];
                    } else {
                        res = arr[i];
                    }
                    shortest = arr[i].length();
                }
            }

            System.out.println("\n--------RESULT--------");
            System.out.println("Shortest word length: " + shortest + ": " + res);
        }

    }

