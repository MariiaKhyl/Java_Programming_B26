package recap;

public class RHW_3_22_T6 {
    /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */

    public static void numbersMethod (double number){

        if (number >0){
            System.out.println("Number is positive "+number);
        }else if (number < 0){
            System.out.println("Number is negative "+number);
        }else if (number == 0){
            System.out.println("Number is zero "+number);
        }else{
            System.out.println("This is not a number");
        }

    }

    public static void main(String[] args) {
        numbersMethod(44);
        numbersMethod(-13);
        numbersMethod(0);
        numbersMethod(0.01);
        numbersMethod(0.0);
        numbersMethod(0.005);

    }



}
