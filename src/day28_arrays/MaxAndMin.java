package day28_arrays;

public class MaxAndMin {
    public static void main(String[] args) {

        /*
        declare and assign an array
        500,120,-80,90,250
        find the biggest number in the array
        find the smallest number in the array


        int max = 0;
        int min = 0;
        int [] numbers = {500,120,-80,90,250,890,-1000};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]> max){
                max = numbers[i];
            }
            if (numbers[i]< min){
                min = numbers[i];
            }

        }
        System.out.println(min+" - min #, max # - "+max);

         */

        int [] nums = {500,120,-80,90,250};

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++){

            int number = nums[i];

            if (number> max){ // if (nums [i] > max)
                max = number;  // max = nums[i]
            }
            if (number< min ){
                min = number;
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);

    }
}
