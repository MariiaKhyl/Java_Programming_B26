package day1_04_04_2022;

import java.util.ArrayList;

public class Task_02 {
    /*
    Array - an object that can hold multiple value of same time datatype simultaneously

    index starts with zere (like string)

    -declaration
    -instatiation
    -initialization

     int a;
     //declaration
     int[]nums;
     //nums[0]=3;

     //instatiation
     nums = new int[4]; // [0,0,0,0] (initialization my array with default values)
     nums[0]=5; // [5,0,0,0]

     //declaration + instatiation
     int [] nums2 = new int[3]; //[0,0,0]

     //initialization
     int [] nums3 = {1,2,3,4};

     int [] nums4 = new int [] {10,20,30};


    Task 02(Arrays):


         Write a method that accepts an array and return true if 6 appears as either the first or last element in the array.

         int[] x = {1,2,6};  ---> true
         int[] y = {6,3,5,7,9};  ---> true
         int[] z = {2,6,6,6,6,1};  ---> false
     */

    public static void main(String[] args) {

        int[] x = {1,2,6};
        int[] y = {6,3,5,7,9};

        System.out.println(lookingForSix(y));

        int[] j = {2,6,6,6,6,1};
        int [] a = new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;

        int firstElement = j[0];
        int lastElement = j[j.length-1];

        if (firstElement == 6 || lastElement == 6){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
    public static boolean lookingForSix (int [] arr){

        return arr[0] == 6 || arr[arr.length-1] == 6;

    }

}
