package codingBat;

public class sameFirstLast {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 1, 9};

        System.out.println(sameFirstLast(nums));
    }

    public static boolean sameFirstLast(int[] nums) {

        if (nums.length >= 1) {

            if (nums[0] == nums[nums.length - 1]) {
                return true;
            }
        }
        return false;

    }
}
