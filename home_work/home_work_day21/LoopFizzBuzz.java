package home_work_day21;

import java.util.Scanner;

public class LoopFizzBuzz {
    public static void main(String[] args) {

        /*
        write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
	1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
	2.  For numbers which are divisible by 5, print "Buzz" instead of the number
	3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number

Try with Scanner:

	write a program that will add 5 numbers from the console
         */
        Scanner scanner = new Scanner(System.in);

       int number = 1;
       int total = 0;
       while (number<=5){
           System.out.println("Please enter your number");
           total = scanner.nextInt();

           if (number%3==0 && number%5==0){
               System.out.println(number+"FizzBuzz");
               number++;
           }else if(number%5==0){
               System.out.println(number+"Fizz");
               number++;
           }else if (number%3==0){
               System.out.println(number+"Buzz");
               number++;
           }
           number++;


       }

    }
}
