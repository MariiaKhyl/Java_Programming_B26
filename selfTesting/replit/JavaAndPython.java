package replit;

import java.util.Scanner;

public class JavaAndPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < sentence.length()-3; i++) {

            String everyFour = sentence.toLowerCase().substring(i, i+4);
             if (everyFour.equals("java")){
                 count++;
            }
        }

        for (int j =0; j <sentence.length()-5; j++){

            String everyFife = sentence.substring(j,j+6);
            if (everyFife.equals("python")){
                count2++;
            }
        }
        if (count == count2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
