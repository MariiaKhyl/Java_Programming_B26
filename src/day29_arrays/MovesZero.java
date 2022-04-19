package day29_arrays;

import java.util.Arrays;

public class MovesZero {

    public static void main(String[] args) {

        int [] nums = {10, 0, 5, 0, 1, 0};
        int [] fixed = new int [nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] != 0){

                fixed[index++] = nums[i]; // reading the elements on position i of the nums array and storing it into the fixed array and position index. After storing the value index variable is incremented by 1

            }
        }
        System.out.println(Arrays.toString(fixed));


        // for each loop
        for ( int each : nums){

            if (each != 0){

                fixed[index] = each;
                index++;
            }

        }
        System.out.println(Arrays.toString(fixed));


    }
}
