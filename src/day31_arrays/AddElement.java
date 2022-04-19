package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        /*
        Have a starting array
        you want to add number to the end
        so make your array bigger to store the new number


        int [] scores = {45, 123,62};
        int [] score2 = Arrays.copyOf(scores,4);

        score2 [3] = 100;

        System.out.println(Arrays.toString(score2));

         */

        Scanner scanner = new Scanner (System.in);
        // Ask how many numbers to start with
        System.out.println("How many numbers do you want to start with?");
        int size = scanner.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i < nums.length; i++){ // the purpouse of this loop is to get all the numbers for the array

            System.out.println("Enter a number");
            nums[i] = scanner.nextInt();

        }
        System.out.println("Array so far: "+ Arrays.toString(nums));

        int [] expanded = Arrays.copyOf(nums, nums.length+1);
        System.out.println("Enter the last number");
        expanded[expanded.length-1] = scanner.nextInt();
        System.out.println(Arrays.toString(expanded));



    }
}
