package home_work_day19;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        /*
        [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.


Ex: Input: Java is a fun language Output: is a fun language Java
           0123456789012345678901

           string1="java";
           string2="is a fun language"
           string2+" " +string1
Hint: Use indexOf and substring

         */

        String sentence = "Java is a fun language";
        int index=sentence.indexOf(" ");
        String string1=sentence.substring(0,index);
        String string2=sentence.substring(index+1);
        System.out.println(string2+" "+string1);








    }
}
