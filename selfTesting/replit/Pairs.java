package replit;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }

        for (int j= 0; j< arr.length-1; j++){

            System.out.println(arr[j]+", "+arr[j+1]);
        }






    }
}
