package home_work_day21;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        /*
        write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5

         */

        Scanner scanner = new Scanner (System.in);
        int max = 0;
        int min = 0;
        int iteration=0;
        int number;

        do{
            System.out.println("Please enter your number");
            number = scanner.nextInt();
            if(number>=max){
                max = number;

            }if (number<=min){
                min=number;
            }
           iteration++;

        }while (iteration<5);
        System.out.println("min "+min);
        System.out.println("max "+max);


        }


    }

