package day08_reletional_operators;

public class SingType {
    public static void main(String[] args) {

        int number1 = 80;
        int positive = 30;
        int negative = -50;
        int zero = 0;
        boolean test1 = number1 >= positive;
        boolean test2 = number1 <= negative;
        boolean test3 = number1 == 0;
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);



        int number = 80;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        System.out.println(number + " is positive " + isPositive);
        System.out.println(number+ " is negative " +isNegative);
        System.out.println(number+ " is zero " + isZero);

    }
}
