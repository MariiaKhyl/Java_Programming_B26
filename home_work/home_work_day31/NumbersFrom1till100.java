package home_work_day31;

import java.util.Arrays;

public class NumbersFrom1till100 {
    public static void main(String[] args) {

        int [][] arr = new int [10][10];
        int arrArr = 1;

        for (int i = 0; i <arr.length; i++){

            for (int j = 0; j <arr[i].length; j++){

                arr [i][j] = arrArr++;

            }
            System.out.println(Arrays.toString(arr[i]));
        }






    }
}
