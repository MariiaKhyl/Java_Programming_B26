package codingBat;

public class in3050 {
    public static void main(String[] args) {

        /*
        Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

                in3050(30, 31) → true
                in3050(30, 41) → false
                in3050(40, 50) → true
         */
        System.out.println(in3050(30,41));
    }
    public static boolean in3050 (int a, int b){
        if ((a >= 30 && b<=50) && (a >=50 && b <= 30)){
            return true;
        }

        if ((a >=40 && b <=50)&& (a >= 50 && b<=40)){
            return true;
        }
        return false;
    }

}
