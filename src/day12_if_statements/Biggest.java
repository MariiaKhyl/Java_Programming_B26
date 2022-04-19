package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {

        /*
        declare and assign 3 int variables
        between the 3 numbers find and print the biggest one
         */
        Scanner input = new Scanner (System.in);
        System.out.println(" Please enter 3 numbers. Use enter after each");
        int oneVer = input.nextInt();
        int secondVer = input.nextInt();
        int thirdVer = input.nextInt();

        //int oneVer = 40;
        //int secondVer = 34;
      //  int thirdVer =77;

        if(oneVer > secondVer && oneVer > thirdVer){
            System.out.println(oneVer);
        }else if(secondVer > oneVer && secondVer > thirdVer){
            System.out.println(secondVer);
        }else if (thirdVer > oneVer && thirdVer > secondVer){
            System.out.println(thirdVer);
        }
        System.out.println("This is the biggest number");

    }
}
