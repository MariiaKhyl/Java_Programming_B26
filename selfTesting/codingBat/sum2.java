package codingBat;

public class sum2 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1};
        System.out.println(sum2(nums));
    }
    public static int sum2(int[] nums){

        if (nums.length <= 0){
            return 0;
        }else if (nums.length == 2){
            return nums[0]+nums[1];
        }else if (nums.length > 2){
            return nums[0]+nums[1];
        }else {
            return nums[0];
        }

    }
}
