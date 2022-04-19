package home_work_day28;

import java.util.Arrays;

public class EvenAndOddFromArray {
    public static void main(String[] args) {

        /*
        Write a program that can count the even and odd number from an array of integers
             Ex:
        Input: [4,1,3,12,5]
            Output:
            Even: 2
            Odd: 3
         */

        int [] numbers = {4,1,3,12,5};

        System.out.println("Odd numbers");
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]%2 == 1){
                System.out.println(numbers[i]);
            }
        }

        System.out.println("Even numbers");
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]%2 == 0){
                System.out.println(numbers[i]);
            }
        }



    }
}
