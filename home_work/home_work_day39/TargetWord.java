package home_work_day39;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        /*
        Target word
Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
            Ex:
            Input:
            ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
            Target: java
            Output:
            2
         */
       String [] arr = {"java","html","css","java","javascript","selenium"};
       ArrayList<String> str = new ArrayList<>(Arrays.asList(arr));

       int count = 0;
        for (String word:str) {

            if(word.equals("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}
