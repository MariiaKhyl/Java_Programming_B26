package test;

import java.util.Scanner;

public class MergeIt {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        if (word1.length()==3 && word2.length()==3){

            char merge1 =word1.charAt(0);
            char merge2 =word2.charAt(0);
            char merge3 =word1.charAt(1);
            char merge4 =word2.charAt(1);
            char merge5 =word1.charAt(2);
            char merge6 =word2.charAt(2);
            String marge = ""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
            System.out.println(marge);

        }else{
            System.out.println("cannot merge");
        }









    }
}