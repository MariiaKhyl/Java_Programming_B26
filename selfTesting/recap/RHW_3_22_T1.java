package recap;

public class RHW_3_22_T1 {
    /*
    Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi
     */

    public static void methodOne (String word, int number){

        for (int i = 0; i <= number; i++){
            System.out.print(word);
        }

    }

    public static void main(String[] args) {
        methodOne("Hello", 5);
    }



}
