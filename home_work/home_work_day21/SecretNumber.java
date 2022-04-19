package home_work_day21;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        /*
        create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
         */
        Scanner scanner = new Scanner (System.in);
        int secretNumber = 17;
        int customerNumber;
        int attempt =0;

        do{
            System.out.println("Please enter your number?");
            customerNumber = scanner.nextInt();

            if(customerNumber>secretNumber){
                System.out.println("Too high");
            }
            if (customerNumber<secretNumber){
                System.out.println("Too low");
            }
            if (customerNumber==secretNumber){
                System.out.println("You guessed correctly");
            }
            attempt++;

        }while (secretNumber!=customerNumber);




    }
}
