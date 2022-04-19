package home_work_day39;

import test.loop;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        /*
        Four or less
Given an ArrayList of Strings, go through and find Strings that are 4 characters or less. Take those Strings and put them into a different
ArrayList. Print that ArrayList of words
                Ex:
                Input:
                “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
                Output:
                [ tree, loop, cat ]
         */

        String  arrNew = "";
        String [] arr = {"apples", "tree", "loop", "cat", "animal", "shortcut"};
        ArrayList<String> str = new ArrayList<>(Arrays.asList(arr));
       // ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {

            if(str.get(i).length() <=4){
                arrNew+=str.get(i)+" ";
                //answer.add(nums.get(i));
            }

        }
        //Sout(answer);

        String [] four = arrNew.split(" ");
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(four));
        System.out.println(arr2);
        System.out.println(Arrays.toString(four)+ "Non form ArrayList");

    }
}
