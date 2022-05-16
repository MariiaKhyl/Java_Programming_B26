package day57_exceptions.learn;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        try{

            System.out.println("Enter a number");
            int num = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();
            System.out.println(num/num2);

        }catch(InputMismatchException obj){
            obj.printStackTrace(); // shows the exception message in the console
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally BLOCK");
            input.close();
        }

        System.out.println("Done");

    }
}
