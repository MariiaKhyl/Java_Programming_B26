package replit;

import java.util.Scanner;

public class CatsAndDogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < str.length()-1; i++){


            if (str.startsWith("cat", i)){
                count++;
            }
        }
        for (int j = 0; j < str.length()-1; j++) {

            if (str.startsWith("dog",j)){
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
