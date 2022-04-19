package day15_16_04_05_06_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task03_MultiplyOddNumbers {
    public static void main(String[] args) {

        /*
         3. write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> multi = new ArrayList<>();

        for (int i = 0; i < list.size()-1; i++) {

            if (list.get(i) % 2 == 1){

                list.set(i, list.get(i)*2);
            }
        }
        System.out.println(list);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i)% 2 == 1){
                numbers.set(i,numbers.get(i)*2);
            }
        }
        System.out.println(numbers);

    }
}
