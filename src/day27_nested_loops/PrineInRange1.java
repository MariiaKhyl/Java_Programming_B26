package day27_nested_loops;

public class PrineInRange1 {

    public static void main(String[] args) {

        /*
        Prime in range

Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		50
	Output:
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

         */
        int range = 50;

        for (int i = 2; i<=range; i++){ // the purpose of this loop is to check all the numbers from 2 to the value the range variable

            int count = 0; // putting the counter inside of the loop will reset it back to 0 for the next number;

            for (int j=2; j<i; j++){

                if (i% j == 0){

                    count++;
                    /*
                    i = 5;
                    j = 2; j< 5; j++     if     j = 2; j< 6; j++
                    i%j                             i = 6
                    5%2                             6%2 --> count++
                    5%3                             6%3 --> count++
                    5%4                             6%4   6%5
                     */
                }

            }// end of inner loop
            if(count == 0){
                System.out.print(i+",");
            }



        }



    }
}
