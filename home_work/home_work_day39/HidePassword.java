package home_work_day39;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        /*
        Hide Password
Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
                            Ex:
                            Input:
                            {"one", "hi", "hold}
                            Output:
                            [ ***, **, **** ]
         */

        String [] pass = {"one","hi","hold"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(pass));
        String str ="";


        for (int i = 0; i < arr.size(); i++) {
            String oneMore ="";
            for (int j = 0; j < arr.get(i).length(); j++) {
                oneMore+="*";
            }
            str+=oneMore+" ";
        }

        String [] str1 = str.split(" ");
        ArrayList<String> arrOne = new ArrayList<>(Arrays.asList(str1));
        System.out.println(arrOne);




    }
}
