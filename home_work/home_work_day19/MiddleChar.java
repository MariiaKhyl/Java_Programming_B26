package home_work_day19;

public class MiddleChar {
    public static void main(String[] args) {

    /*
    [Middle char]
Given a String, write a program to display the middle character of a string

a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.

Ex: Input: elephant Output: The middle characters: ph
     */
        String word = "watermelonn";
//                     01234567
        if (word.length() % 2 == 0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1)+" - even");
        }
        if (word.length() % 2 == 1){
            System.out.println(word.substring(word.length()/2,word.length()/2+1)+" - odd");
        }


    }
}