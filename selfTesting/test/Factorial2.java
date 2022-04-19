package test;

import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 1;

        while (n>1){
            System.out.println(n+" * "+result);
            result*=n;
            n--;
        }
        System.out.println(result);


    }

}
