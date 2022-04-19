package day28_arrays;

import java.util.Arrays;

public class ArrayIntro2 {

    public static void main(String[] args) {

        double [] arr = new double[4];
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr));
        arr[1] = 55.25;
        arr[2] = 63.25;
        arr[3] = 58;
        System.out.println(Arrays.toString(arr));

        //reassigning
        arr[2] = 20000;
        System.out.println(Arrays.toString(arr));

        arr = new double[5]; // creates a new array with 5 elements, and reassigns the arr reference to the new object
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[1]);


    }
}
