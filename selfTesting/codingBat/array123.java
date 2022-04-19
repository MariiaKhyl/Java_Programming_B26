package codingBat;

public class array123 {
    public static void main(String[] args) {
        int [] nums = {1, 1, 2, 3, 1};
        System.out.println(array123(nums));
    }

    public static boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;

    }
}
