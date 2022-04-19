package day15_16_04_05_06_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04_CombineArrayList {
    /*
    write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */
    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"},
        arr2 = {"D", "E", "F", "G"};

        ArrayList<String> result = new ArrayList<>();

        result.addAll(Arrays.asList(arr1));
        System.out.println(result);
        result.addAll(Arrays.asList(arr2));
        System.out.println(result);

        System.out.println("=== TASK 4 with CHAR  ====");

        char[] carr1 = {'A', 'B', 'C'},
                carr2 = {'D', 'E', 'F', 'G'};

        ArrayList<Character> charResult=new ArrayList<>();
        //charResult.addAll(Arrays.asList(carr1));
        for (char eachChar : carr1) {
            charResult.add(eachChar);
        }

        System.out.println(charResult);

        //charResult.addAll(Arrays.asList(carr2));
        for (char eachChar : carr2) {
            charResult.add(eachChar);
        }
        System.out.println(charResult);


    }
}
