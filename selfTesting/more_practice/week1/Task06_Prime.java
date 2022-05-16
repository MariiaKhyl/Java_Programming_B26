package more_practice.week1;

import java.util.Scanner;

public class Task06_Prime {
    public static void main(String[] args) {
        /*
        6) Numbers - Prime Number
Write a method that can check if a number is prime or not
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        int primeNumber = 0;
        boolean isPrime = number>2;


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
//this loop is tyring to check if our number is evenl i divisible by value from 2 to the number