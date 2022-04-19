package home_work_day26;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        /*
        Prime in range

Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		50
	Output:
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");

        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i=2; i<=number; i++){
            isPrime=true;

            for (int j = 2; j<i; j++){

                if (i%j==0){
                    isPrime = false;
                    break;
                }
                if(isPrime==true){
                    System.out.print(i+", ");
                    break;
                }

            }
        }




    }
}
