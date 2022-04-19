package home_work_day28;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        /*
        Write a program that will move all the zero numbers to the end of the array.
        The rest of the numbers will move over in position
        Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
                Ex:
                Input:
            [10, 0, 5, 0, 1, 0]
                Output:
            [10, 5, 1, 0, 0, 0]
         */

        int [] arr = {10, 0, 5, 0, 1, 0};
        int [] result = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0){

                result[count] = arr[i];
                count++;
            }

        }
        System.out.println(Arrays.toString(result));




    }
}
