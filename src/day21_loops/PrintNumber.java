package day21_loops;

public class PrintNumber {
    public static void main(String[] args) {

        /*


        print all the even numbers from 1 to 100, on separate lines

        print all the odd numbers from 1 to 100, but all in one line with spaces between each number
     */
//even numbers
        int number = 2;

        while (number <= 100) {

            if (number % 2 == 0) {
                System.out.print(number + " hello ");
                number += 2;
            }
            System.out.println();
        }
        // approach 2:
        int i = 1;
        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.print(i + " hi ");
            }
            i++;

        }
        System.out.println();
        //odd numbers

        int a = 1;
        while (a <= 100) {

            System.out.print(a + " ");
            a += 2; // how to see odd numbers
        }
        System.out.println();

        int b = 0;
        while (b++ < 100) {

            if (b % 2 == 1) {
                System.out.print(b + " ");
            }

        /*
        flow:
        b=0
        b++ <= 100 -->0<=100-->loop runs and b is now 1
        if (b%2==1)-->1%2==1-->true->prints number

        while (b++<=100)--> 1<= 100 --> loop runs and b increments to 2
        if (b%2==1 ) -->2%2==1-->false -> nothing happens

        while (b++<=100) --> 2<--100-> loop runs and b increments to 3
         */


        }
    }}
