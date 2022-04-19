package home_work_day11;

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        /*
        Create two number variables
Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Need to enter two numbers");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        System.out.println("Which number is bigger ?");
        if (numberOne > numberTwo){
            System.out.println("Yes, first number"+numberOne+" is bigger than "+numberTwo+" number");
        }else {
            System.out.println(numberTwo+" number is bigger then "+numberOne);
        }




    }


}
