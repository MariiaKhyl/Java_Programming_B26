package day21_loops;

public class Factorial {
    public static void main(String[] args) {

        int number = 5;
        int result = 1;

        // 5*4*3*2*1
        // repeated action : multiply the number
        //stopping point : number gets to 1

        while (number>1){
            System.out.println(result+" * "+number);
            result*=number;
            number--;

        }
        System.out.println(result);




    }


}
