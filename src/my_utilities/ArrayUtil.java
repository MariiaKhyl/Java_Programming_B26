package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /*
    Min Number
create a method that will accept an int array and return the smallest number from the array
     */
    public static int minNumber (int [] nums){
        int min= nums[0];
        for (int num : nums) {
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    /*
    Max Number
create a method that will accept an int array and return the smallest number from the array
     */
    public static int maxNumber (int [] nums){

        int max = nums[0];

        for (int num : nums) {
            if (num > max){
                max = num;
            }
        }
        return max;
    }
    /*
       Contains
   create a method that will accept an int array and an int number. Check and return if the given number is in the array.
        */
    public static boolean contains (int [] nums, int element){

        for (int each : nums) {
            if(each == element){
                return true;
            }
        }
        return false;
    }
// Index Of (String elements)
    public static int indexOf (String [] str, String element){
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
//Index of (int elements)
    public static int indexOf(int [] nums, int element){
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == element){
                return i;
            }
        }
        return -1;
    }
    //adding to int arrays together
    public static int [] addElement (int [] original, int [] elementsToAdd){

        int [] newArr =new int [original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArr.length; i++) {

            if(i< original.length){
                //added the element from the original array in the new array
                newArr[i] = original[i];
            }else{
                // added the new elements to the new array
                newArr[i] = elementsToAdd[j++];
            }
        }
        return newArr;
    }




}
