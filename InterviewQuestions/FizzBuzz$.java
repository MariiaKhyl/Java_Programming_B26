import java.util.Scanner;

public class FizzBuzz$ {
    public static void main(String[] args) {


    /*
        you will have a number

        if the number is divisible by 3 print -> Fizz
        if the number is divisible by 5 print -> Buzz
        if the number is divisible by both 3 and 5 print -> FizzBuzz
        if the number is not divisible by any of those, print just the number
     */

     Scanner input = new Scanner(System.in);
     int number1 = input.nextInt();

     if (number1 % 3 == 0 && number1 % 5 == 0){
         System.out.println("FizzBuzz");
     }else if(number1 % 3 == 0) {
         System.out.println("Fizz");
     }else if(number1 % 5 == 0){
         System.out.println("Buzz");
     }else{
         System.out.println(number1);
     }





    }
}
