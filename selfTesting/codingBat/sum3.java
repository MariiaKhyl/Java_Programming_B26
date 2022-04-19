package codingBat;

public class sum3 {
    public static void main(String[] args) {

        int [] nums = {5,11,2};
        System.out.println(sum3(nums));
    }

    public static int sum3(int[] nums) {

        int total = 0;
        for (int i = 0; i < nums.length; i++) {

            total += nums[i];
        }
        return total;
    }
}
