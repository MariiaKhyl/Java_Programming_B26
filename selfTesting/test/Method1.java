package test;

public class Method1 {
    public static void main(String[] args) {
        /*
        Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
         */

        System.out.println(smallestNumber(25,37,29));

    }
    public static int smallestNumber( int one, int two, int three){

        int min = one;

        if (min >= two){
            min = two;
        }else if (min >=three){
            min = three;
        }else if (min >= one){
            min = one;
        }
        return min;
    }

}
