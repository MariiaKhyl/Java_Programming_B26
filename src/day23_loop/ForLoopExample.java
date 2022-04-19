package day23_loop;

public class ForLoopExample {
    public static void main(String[] args) {

        for(int i = 1; i<=10; i++){ // for (int i=10; i>=10; i--){ or for ( int i = 1; i<=10; i+=2){

            System.out.println(i);

        }

        /*
            flow of FOR loop

            1) it executes the initialization part to declare and assign a variable ;

            initialization: int i = 1;
            initialization part runs ONCE in the beginning

            2) boolean condition / termination condition
            -> if the boolean is true: the loop will execute the statement
            -> if the loop boolean is false: the loop will stop

            in our exemple : i<=10

            30 the statements in the code body are executed top to bottom

            in our ex.: System.out.println(i);

            4) update happens -- this is the end of the iteration
            in our ex: i++

            5) goes back to step 2 and repeats

         */

        // While loop
        int z = 1;
        while (z<=10){
            System.out.println(z);
            z++;
        }


    }
}
