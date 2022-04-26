package test;

public class Method5 {
    public static void main(String[] args) {
        /*
        Write a Java method to compute the sum of the digits in an integer. Go to the editor
Test Data:
Input an integer: 25
Expected Output:

The sum is 7
         */
        System.out.println(sumOfDigits(12));
    }
    public static int sumOfDigits(int sum){
        int add = 0;

       while (sum > 0){
           add +=sum % 10;
           sum/=10;
       }
        return add;
    }
}

