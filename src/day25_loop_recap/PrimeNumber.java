package day25_loop_recap;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

      /*
      Prime number [Loops]

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime
       */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        int primeNumber = 0;
        boolean isPrime = number>2;

        //this loop is tyring to check if our number is evenl i divisible by value from 2 to the number
        for ( int i=2; i< number; i++){

            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number+" is prime");
        }else{
            System.out.println(number+" not prime");
        }





    }

}
