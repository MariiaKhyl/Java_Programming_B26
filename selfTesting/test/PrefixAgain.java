package test;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        boolean is =false;
        String prefix = str.substring(0,n);

        if (str.substring(n).contains(prefix)){
            is=true;
        }
        System.out.println(is);







    }
}
