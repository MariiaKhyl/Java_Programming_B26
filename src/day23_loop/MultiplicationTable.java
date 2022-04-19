package day23_loop;

public class MultiplicationTable {

    /*
    declare and assign a number

    print all the multiplication results for 1 throught 10
    ex :
    4*1 = 4
    4*2 = 8
    ..
    4*10 = 40
     */
    public static void main(String[] args) {


        int number = 4;
        for (int i = 1; i <= 10; i++) {

            System.out.println(number+" x "+i+" = "+(number * i));

        }



    }
}