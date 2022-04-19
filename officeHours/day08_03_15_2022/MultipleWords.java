package day08_03_15_2022;

import java.util.Arrays;

public class MultipleWords {

    public static void main(String[] args) {

    /*
        Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer
     */

        String [] words = {"knife","wooden spoons","plates","cups","forks","pan","pot","trash can","fridge","dish washer"};

        String  multipleWords = "";
        int count = 0;


        for (int i = 0; i < words.length; i++){

            if ( words[i].contains(" ")){
                count++;
                multipleWords = words[i];
            }

        }

        System.out.println(count);
        System.out.println(multipleWords);





    }

}
