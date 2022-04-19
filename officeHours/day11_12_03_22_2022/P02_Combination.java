package day11_12_03_22_2022;

import java.util.Arrays;

public class P02_Combination {

    /*
    Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    public static void combination (int [] arrOne, int [] arrTwo){

        int length = arrOne.length + arrTwo.length;

        int [] combined = Arrays.copyOf(arrOne,length);
        for (int i = 0; i < arrTwo.length; i++) {

            combined[arrOne.length+i] = arrTwo[i];
        }
    }
    public static void main(String[] args) {
        combination(new int [] {1,2,3,4}, new int [] {5,6,7,8,9,10});
    }

     */

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8,11,9,10};

        mergeTwoArrays(array1,array2);

    }

    public static void mergeTwoArrays(int[] array1, int[] array2) {

        int[] array3 = new int [array1.length+ array2.length];
        int i = 0;
        for (int each : array1) {
            array3[i++] = each;
        }

        for (int each : array2) {
            array3[i++] = each;
        }
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }


}

