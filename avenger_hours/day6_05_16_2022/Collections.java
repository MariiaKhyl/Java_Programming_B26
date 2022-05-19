package day6_05_16_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {
    /*
    Task 03 ;   Write a program that can move all the zeros to the end of the List of integers
                Ex;
                   input: [0, 2, 0, 0, 0, 3, 4, 5]
                   output: [2, 3, 4, 5, 0, 0, 0, 0]




          int fixed [] = new int[arr.length];
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != 0){
                fixed[count++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(fixed));
    }
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 int arr [] = {0, 2, 0, 0, 0, 3, 4, 5};
        moveZero(arr);


     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 0, 0, 0, 3, 4, 5));
        int number = 0;

        System.out.println(moveToEnd(list, number));

    }

    public static ArrayList<Integer> moveToEnd(ArrayList<Integer> list, Integer number){

        int originalSize = list.size();

        list.removeIf(n -> n == number);

        // list.removeAll(ArrayList.asList(number));
        int newSize= list.size();

        int totalNumOfRemoved = originalSize - newSize;

        for (int i = 0; i < totalNumOfRemoved; i++) {

            list.add(number);
        }

        return list;
    }

}
