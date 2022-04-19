package codingBat;

public class arrayCount9 {
    public static void main(String[] args) {
        int [] nums = {1,2,9,9,4,9};
        System.out.println(arrayCount9(nums));
    }
    public static int arrayCount9(int [] nums){

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9){
                count++;
            }
        }
            return count;


    }
}
