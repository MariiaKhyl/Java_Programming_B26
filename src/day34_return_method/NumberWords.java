package day34_return_method;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {

        System.out.println(numberAsWord(3));
        System.out.println(numberAsWord(10));

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(scanner.nextInt()));

    }

    public static String numberAsWord(int num){

        if (num < 1 || num > 10){
            return "Invalid number " + num;
        }

        String [] words = {"One", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        return words[num - 1];

    }




}
