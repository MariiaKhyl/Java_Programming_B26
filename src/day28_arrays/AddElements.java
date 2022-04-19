package day28_arrays;

public class AddElements {
    public static void main(String[] args) {

        /*
        declare and assign an array of numbers

        {3,6,10}

        sum all the numbers in the array


         */


        int sum = 0;
        int[] numbers = {3, 6, 10};

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        System.out.println(sum);


    }
}
