package recap;

import java.util.Arrays;

public class RHW_3_22_T11 {
    /*
    Create a method that accepts an int array and a number. Check if the array contains that number or not
                    Ex:
                    input: ( {1, 2, 3, 4}, 4 ) -> true
                    input: ( {1, 2, 3, 4}, 7 ) -> false
     */

    public static void acceptMethod (int [] arr, int number){

        int count = 0;
        boolean accept = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number){
                count++;
                accept = true;
            }

        }
        System.out.println(Arrays.toString(arr) +" "+number+" "+accept);

    }

    public static void main(String[] args) {
        acceptMethod(new int []{1, 2, 3, 4}, 4);
        acceptMethod(new int []{1, 2, 3, 4}, 7);
    }


}
