package more_practice.week1;

public class Task02_Divide {
    public static void main(String[] args) {

        /*
        2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
         */
        int one = 10;
        int two = 5;
        int quotient = 0;

        while( one>=two){
            one=one - two;
            quotient++;
        }
        System.out.println(quotient);
    }

}
