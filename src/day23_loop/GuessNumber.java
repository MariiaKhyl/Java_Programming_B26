package day23_loop;

import java.util.Scanner;

public class GuessNumber {
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
        int secretNumber = 80;
        int guessNumber;

        do {

            System.out.println("Guess a number 1-100");
            guessNumber= scanner.nextInt();

            if(guessNumber > secretNumber){
                System.out.println(guessNumber+" is to high");
            }else if (guessNumber< secretNumber){
                System.out.println(guessNumber+" is too low");
            }

        }while (guessNumber!=secretNumber);// the loop will continue if you guess wrong, because the guess is not equal to true

        System.out.println("You guessed correct!");


    }
}
