package more_practice.week1;

public class Task01_OddAndEven {
    public static void main(String[] args) {
        /*
        Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
         */

        int number = 6;

        if(number%2 == 0){
            System.out.println("even");
        }else if (number%2 == 1){
            System.out.println("odd");
        }

    }
}
