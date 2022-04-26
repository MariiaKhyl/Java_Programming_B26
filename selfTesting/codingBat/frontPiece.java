package codingBat;

public class frontPiece {
    public static void main(String[] args) {

    }

    public static int[] frontPiece(int[] nums) {

        int[] arr = new int[2];

        if (nums.length >= 2) {
            arr[0] = nums[0];
            arr[1] = nums[1];
            return arr;
        } else {
            return nums;

        }
    }
}
