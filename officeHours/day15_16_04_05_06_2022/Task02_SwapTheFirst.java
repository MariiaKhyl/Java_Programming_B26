package day15_16_04_05_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task02_SwapTheFirst {
    public static void main(String[] args) {

        //2. write a program that can swap the first and last elements of an ArrayList

        ArrayList<String> list = new ArrayList<>(Arrays.asList("1","2","3","4","5"));
        ArrayList<String> other = new ArrayList<>();




        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        Collections.swap(numbers, 0, numbers.size()-1);
        System.out.println(numbers);


    }
}
