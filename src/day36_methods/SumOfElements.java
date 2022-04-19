package day36_methods;

public class SumOfElements {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(sum(arr));

        System.out.println(sum(2,3,4,6,7,8));
    }
    public static int sum (int ... nums){
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }



 /*   public static int sum (int [] nums){
        int sum = 0;
        for (int each : nums) {
            sum+=each;
        }
        return sum;
    }

  */

}
