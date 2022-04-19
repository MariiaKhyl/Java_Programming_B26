package recap;

public class RHW_3_22_T3 {
    /*
        make a method that prints all the letters from A - Z

        make a method that prints all the letters from a - z

        make a method that prints all the letters from Z - A

        make a method that prints all the letters from z - a

        make a method that prints all the numbers from 0 - 9
     */

    public static void methodOne() {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void methodTwo() {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void methodThree() {

        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void methodFour() {

        for (int i = 9; i >= 0; i--) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void methodFive() {

        for (char i = 'Z'; i >= 'A'; i--){

            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void methodSix (){
        for (char i ='z'; i>= 'a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        methodOne();
        methodTwo();
        methodThree();
        methodFour();
        methodFive();
        methodSix();
    }


}
