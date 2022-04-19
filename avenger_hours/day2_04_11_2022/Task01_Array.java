package day2_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01_Array {
    public static void main(String[] args) {
        int [] arr = {4,5,1,5,6};
        System.out.println(contains2or3(arr));

    }

    public static boolean contains2or3 (int [] arr){

        for (int i = 0; i < arr.length; i++ ){

            if (arr[i] == 2 || arr[i]== 3){
                return true;
            }
        }
        return false;

    }
    public static boolean contains (int [] array){

        for (int each : array) {

            if (each == 2 || each == 3){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(ArrayList<Integer>list){

        if (list.contains(2) || list.contains(3)){

            return true;
        }
        return false;
    }


}
