package test;

public class Method2 {
    public static void main(String[] args) {
        /*
        Write a Java method to compute the average of three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
         */

        System.out.println(avengerNumber(55,56,65));

    }
    public static double avengerNumber(int one, int two, int three){

        double aver = one + two + three;
        aver/= 3;

        return aver;

    }
}
