package home_work_day33;

import java.util.Arrays;

public class Task7 {
    /*
    Create a method that accept an int array. Take the sum of all the numbers
and print the result
     */
    public static void summa (int [] arr){

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

           sum+=arr[i];

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

        summa(new int [] {8,12,10});
        summa(new int [] {12,8});
    }




}
