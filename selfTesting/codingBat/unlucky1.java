package codingBat;

public class unlucky1 {
    public static void main(String[] args) {

    }
    public static boolean unlucky1 (int [] nums){

        if (nums.length >= 2) {

         if (nums[0] == 1 || nums[1] == 3) {
                return true;
            } else if (nums[nums.length - 2] == 1 || nums[nums.length - 1] == 3) {
                return true;
            } else {
                return false;
            }
        }
return false;

    }
}
