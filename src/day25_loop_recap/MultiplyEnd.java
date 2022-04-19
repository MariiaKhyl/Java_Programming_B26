package day25_loop_recap;

import java.util.Scanner;

public class MultiplyEnd {

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
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("please enter some crazy word");
        String crazy = scanner.nextLine();
        System.out.println("How many times you want to repeat ");
        int repeat = scanner.nextInt();

        for (int i = 0; i < repeat; i++){
            crazy+=crazy.charAt(crazy.length()-1);

        }
        System.out.println(crazy);







    }

}
