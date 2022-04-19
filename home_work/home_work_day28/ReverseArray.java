package home_work_day28;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        /*
        Write a program that will reverse the order of any given array
                 Ex:
                Input:
            [1, 2, 3, 4, 5]
                Output:
            [5, 4, 3, 2, 1]
         */

        int [] arr = {1, 2, 3, 4, 5};
       /* StringBuilder reversed = new StringBuilder();

        for (int i = arr.length; i> 0;i--){

            reversed.append(arr[i-1]).append(" ");
        }
        String[] reversedArrey = reversed.toString().split(" ");

        System.out.println(Arrays.toString(reversedArrey));

        */

        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }


    }
}
