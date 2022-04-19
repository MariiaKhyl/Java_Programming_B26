package home_work_day12;

public class Calculator {

    public static void main(String[] args) {

        /*
        create a class Calculator

- do it without Scanner

declare and assign 2 number variables
declare and assign a char variable for an operator

create a calculator based on the operator picked
	+ : add num1 and num2
	- : minus num1 and num2
	* : multiply num1 and num2
	/ : divide num1 and num2
	any other char: "invalid operator"

         */
        int number1 = 10;
        int number2 = 5;
        char operator = '*';

        if (operator == '+'){
            System.out.println("+ : Add  "+number1+" + "+number2+" = " + (number1+number2));
        }else if(operator == '-'){
            System.out.println("- : Minus  "+number1+" - "+number2+" = " + (number1-number2));
        }else if(operator == '*'){
            System.out.println("* : Multiplication  "+number1+" * "+number2+" = " + (number1*number2));
        }else if(operator == '/'){
            System.out.println("/ : Division  "+number1+" / "+number2+" = " + (number1/number2));
        }else {
            System.out.println("Invalid operator");
        }

    }

}
