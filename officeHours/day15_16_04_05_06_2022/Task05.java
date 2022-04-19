package day15_16_04_05_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {
        /*
        write a program that can return the nth largest number from an arraylist

                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5
                    			output:
                    				4
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));
        System.out.println(numbers);
        int n = 3;
        System.out.println(NthMax(numbers,n));



    }

    private static int NthMax(ArrayList<Integer> numbers, int n) {

        for (int i = 1; i < n; i++) {
            numbers.removeIf(each -> Collections.max(numbers) == each);
        }



        return Collections.max(numbers);
    }
}
