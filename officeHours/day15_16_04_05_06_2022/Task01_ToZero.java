package day15_16_04_05_06_2022;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task01_ToZero {
    public static void main(String[] args) {

        /*
        1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];

         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        list.set(list.size()-1, 0 );
        System.out.println(list);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);
        numbers.set(numbers.size()-1,0);
        System.out.println(numbers);


    }

}
