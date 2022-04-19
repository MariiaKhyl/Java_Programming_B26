package day31_arrays;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {

        int [] nums = {3,6,2,68,32,-2,24};
        int [] notSorter = nums; // does not make a new array object

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorter));

        // max and min
        System.out.println("Min "+nums[0]);
        System.out.println("Max "+nums[nums.length-1]);

    }
}
