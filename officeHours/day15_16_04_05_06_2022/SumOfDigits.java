package day15_16_04_05_06_2022;

public class SumOfDigits {
    /*
     Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
     */
    public static void main(String[] args) {

        String s = "jav45ai1000sgre1at82";
        System.out.println(sumOfDigits(s));

    }

    private static int sumOfDigits(String str) {

        String digits = "0"; // why we are using 0 into digits . if we don't have any number in String it will give us NumberFormatExceptions. Sinse 0 has no effect to result addition (+) operator, we used it to prevent errors
        //String s = "jav45ai1000sgre1at82";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                digits += str.charAt(i);

            } else {
                sum+= Integer.parseInt(digits);
                digits = "0";
            }


        }
        return sum+Integer.parseInt(digits);


    }

}
