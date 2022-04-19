package replit;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = 0;

        for (int i = 0; i < nums.length; i++){

            int numbers = nums[i];

            if ( max > numbers){

                max = numbers;
            }
        }
        System.out.println(max);




    }
}
