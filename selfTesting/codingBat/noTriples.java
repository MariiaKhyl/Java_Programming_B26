package codingBat;

public class noTriples {
    public static void main(String[] args) {

        int [] nums = {1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(nums));
    }

    public static boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length-2; i++) {

            if (nums[i+1] == nums[i] && nums[i+2] == nums[i]){
                return false;
            }

        }
        return true;
    }
}
