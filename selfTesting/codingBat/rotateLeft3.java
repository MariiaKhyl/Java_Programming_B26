package codingBat;

import java.util.Arrays;

public class rotateLeft3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4,5,6};
       // System.out.println((Arrays.toString(rotateLeft3(nums))));

        System.out.println(Arrays.toString(rotateLeft3(nums)));
    }

    public static int[] rotateLeft3(int[] nums){

        int [] arr = new int[nums.length];
        arr[arr.length-1]=nums[0];

        for (int i = 0; i < nums.length -1; i++) {
            arr[i] = nums[i+1];
        }
        return arr;
    }








//    public static int[] rotateLeft3(int[] nums) {
//
//        int[] reversed = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//
//            reversed[i] = nums[nums.length - 1 - i];
//
//        }
//
//        return reversed;
//    }
}
