package home_work_day19;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        /*
        String word = "unicorn";


        if (word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }
        if (word.length()%2==0){
            System.out.println((word.length()));
        }
*/


        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the text");
        String word = scanner.nextLine();


        if (word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
            System.out.println(word.substring(3, 9));
        }
        if ( word.length()%2==1){
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
            System.out.println(word.substring(5,13));
        }

        if (word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
            System.out.println(word.contains("support"));
        }
        if(word.length()%2==1 || word.contains("apple")){
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
            System.out.println("apple");
        }

























    }
}
