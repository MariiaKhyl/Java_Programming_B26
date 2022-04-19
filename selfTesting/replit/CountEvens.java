package replit;

import java.util.Scanner;

public class CountEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int even = 0;

        for (int each : nums){

            if (each%2==0){

                even++;

            }

        }
        System.out.println(even);

    }
}
