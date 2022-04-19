package recap;

public class RHW_3_22_T10 {
    /*
    Create a method that accept an int array. Take the sum of all the numbers and print the result
     */
    public static void summMethod (int [] arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        summMethod(new int[] {12,23,34,45});
        summMethod(new int [] {10,10,10,10,10});
    }
}
