package day06_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double reminder = num1 % num2; // 10/3=3.3333 -> 3+3+3-> 10-9 = 1 ( what is left)

        System.out.println(num1 + " + "+num2+" = "+addition);
        System.out.println(num1 + " - "+num2+" = "+subtraction);
        System.out.println(num1 + " * "+num2+" = "+multiplication);
        System.out.println(num1 + " / "+num2+" = "+division);
        System.out.println(num1 + " % "+num2+" = "+reminder);

    }
}
