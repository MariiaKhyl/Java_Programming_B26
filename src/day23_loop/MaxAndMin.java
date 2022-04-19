package day23_loop;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        /*
        repeated steps:
        ask for a number
        check if the biggest
        check is it the smallest
         */

        int max = -2147483648;
        int min = 2147483647;
        int iteration = 0;

        while (iteration< 5){
            iteration++;

            System.out.println("Enter a number");
            int number = scanner.nextInt();

            if (number>max){
                max = number;
            }

            if (number<min){
                min = number;
            }

        }

        System.out.println("Max: "+ max);
        System.out.println("Min: "+min);

    }

}
