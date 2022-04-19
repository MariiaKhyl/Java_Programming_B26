package home_work_day24;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        /*
        [IQ] Prime number [Loops]

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

        Scanner scanner =new Scanner (System.in);
        int primeNumber = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < primeNumber; i++){

            if (primeNumber%i == 0){

                isPrime = false;

                break;
            }

        }

        if (!isPrime){
            System.out.println("Non prime");
        }else{
            System.out.println("Prime");
        }

    }

}
