package replit;

import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        boolean yes = false;

        for (int i = 0; i < nums.length; i++){

            if (nums[i]== 5 && nums[i+1]== 5){

                yes = true;
                break;
            }

        }

        System.out.println(yes);







    }
}
