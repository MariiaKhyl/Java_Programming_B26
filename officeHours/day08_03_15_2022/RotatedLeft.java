package day08_03_15_2022;

import java.util.Arrays;

public class RotatedLeft {

    public static void main(String[] args) {

        /*
        Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]



        int [] numbers = {17,12,10,8};
        int [] reverse = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            reverse[numbers.length -1 -i] = numbers[i];

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));

         */


        int [] x = {1,2,3,4,5}; // ->[2,3,4,5,1[
        /*

        int temp = x[0]

        i = 0 --> x[0]=x[1] -->2,2,3,4,5
        i = 1 --> x[1]=x[2]  --> 2,3,3,4,5
        i = 2 --> x[2]=x[3]  --> 2,3,4,4,5
        i = 3 --> x[3]=x[4]  --> 2,3,4,5,5

        x[x.length-1]= temp --> 2,3,4,5,1

        Formula
            x[i] = x[i+1];

         */

        int temp =x[0]; // 1

        for (int i = 0; i < x.length-1; i++) {
            x[i]=x[i+1];

        }
        x[x.length-1]= temp;

        System.out.println(Arrays.toString(x));

        // DO IT FOR ROTATED RIGHT
        // int x = {1,2,3,4,5} // -> [5,1,2,3,4]







    }
}
