package home_work_day28;

import java.util.Scanner;

public class AverageNumberFromArray {
    public static void main(String[] args) {


      /*  Given an int array calculate the average number
        -> Make it flexible so it will work with any array size
             Examples:
         [1,2,3] -> average: 2
         [10, 15, 5, 6] -> average: 9
         [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10

       */

        int [] numbersOne = {1,2,3};
        int sum = 0;
        int length = numbersOne.length;
        for (int i = 0; i < numbersOne.length; i++) {

            sum+=numbersOne[i];
        }
        int average = sum/length;
        System.out.println("Average of array "+ average);


        int [] numberTwo = {10, 15, 5, 6};
        int sumTwo = 0;
        int lengthTwo = numberTwo.length;

        for (int i = 0; i < numberTwo.length; i++) {

            sum+=numberTwo[i];
        }
        int average2 = sum / lengthTwo;
        System.out.println("Average of array "+average2);


        int [] numberThree = {4, 5, 6, 7, 8, 10, 20, 30, 0};
        int sum3 = 0;
        int length3 = numberThree.length;
        for (int i = 0; i < numberThree.length; i++) {
            sum3+=numberThree[i];
        }
        int average3 = sum3/length3;
        System.out.println("Average of array " +average3);



    }
}
