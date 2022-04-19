package codingBat;

import java.util.Arrays;

public class maxEnd3 {
    public static void main(String[] args) {
        int [] nums = {4,2,3};
        System.out.println(Arrays.toString(maxEnd3(nums)));
    }

    public static int[] maxEnd3(int[] nums){

        if (nums[0] >= nums[nums.length-1]){

            for (int i = 0; i < nums.length-1; i++) {
                nums[i+1] = nums[0];
            }

        }else if (nums[nums.length-1] >= nums[0]){

            for (int i = 0; i < nums.length-1; i++) {
                 nums[i]=nums[nums.length-1];
            }

        }
        return nums;


    }
}
