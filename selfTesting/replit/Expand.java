package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        int [] newArr = new int[nums.length*2];

        for (int i =0; i < newArr.length; i++){

            if (i < nums.length){

                newArr[i] = nums[i];
            }else{

                newArr[i] = 0;
            }

        }
        System.out.println(Arrays.toString(newArr));






    }
}
