package codingBat;

import java.util.Arrays;

public class makeEnds {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(makeEnds(nums)));
    }

    public static int[] makeEnds(int[] nums) {

        int[] arr = new int[2];

        if (nums.length == 1) {
            arr[0] = nums[0];
            arr[1]= nums[0];
            return arr;
        } else {
            arr[0] = nums[0];
            arr[1]=nums[nums.length - 1];
        }
        return arr;

    }
}

