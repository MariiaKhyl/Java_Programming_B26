package codingBat;

public class firstLast6 {

    public static void main(String[] args) {

        int [] nums = {13, 6, 1, 2, 3};
        System.out.println(firstLast6(nums));

    }

    public static boolean firstLast6(int[] nums) {

        if (nums.length >= 1) {

            if (nums[0] == 6) {
                return true;
            } else if (nums[nums.length - 1] == 6) {
                return true;
            }
        }
        return false;

    }
}
