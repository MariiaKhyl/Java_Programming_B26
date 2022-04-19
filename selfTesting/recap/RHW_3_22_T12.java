package recap;

import java.util.Arrays;

public class RHW_3_22_T12 {
    /*
    Create a method that accepts an int array. Count how many even and odd numbers there is. Print an array at the end where the first element is how
many even numbers there was and the second element in the number of odd elements
                Ex:
                input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
                input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
     */
    public static void evenAndOddArr (int [] arr){

        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0){
                countEven++;
            }else if (arr[i]% 2 == 1){
                countOdd++;
            }

        }
        System.out.println(Arrays.toString(arr)+" "+"["+countEven+", "+countOdd+"]");
    }

    public static void main(String[] args) {
        evenAndOddArr(new int [] {1, 2, 3, 4});
        evenAndOddArr(new int [] {1, 3, 5, 2});
    }


}
