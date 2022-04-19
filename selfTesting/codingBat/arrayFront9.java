package codingBat;

public class arrayFront9 {
    public static void main(String[] args) {

        int [] nums = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(nums));
    }

    public static boolean arrayFront9( int [] nums){

        int last = nums.length;
        if(last >4){
            last=4;
        }

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 9){
                return true;
            }

        }
        return false;
    }
}
