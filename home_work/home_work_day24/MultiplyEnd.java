package home_work_day24;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        /*
        Multiply End [String, Loops]

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please entry a word");
        String word = scanner.nextLine();
        System.out.println("Please enter repeat amount");
        int repeat = scanner.nextInt();
        String word2 = word.substring(word.length()-1);

        for (int i=0; i< repeat; i++) {

            word+=word2;
        }
        System.out.println(word);




        /*String hello = "Hello?";
        String lastIndex = hello.substring(hello.length() - 1);

        for (int i = 0; i < 3; i++) {
            hello+=lastIndex;
        }
        System.out.println(hello);


        String java = "java";
        String newResult = java.substring(java.length()-1);

        for (int i = 0; i< 5; i++){
            java+=newResult;
        }
        System.out.println(java);

        String red = "red";
        String red1 = red.substring(red.length()-1);

        for (int i = 0; i<10; i++){

            red+=red1;
        }
        System.out.println(red.toUpperCase());


         */
    }
}
