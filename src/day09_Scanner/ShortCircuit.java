package day09_Scanner;

public class ShortCircuit {
    public static void main(String[] args) {

        //System.out.println( 5 / 0); we can't do / on zero
        System.out.println(true || 5 / 0 == 0);
        //System.out.println(true && 5 / 0 == 0); error
        //System.out.println(true | 5 / 0 == 0); error

        System.out.println(false && 5 / 0 == 0);
        //System.out.println(true & 5 / 0 == 0); error
        int a = 0;
        System.out.println( false && a++ == 5);
        System.out.println(a);

        int b = 0;
        System.out.println(false & b++ == 5);
        System.out.println(b);
    }
}
