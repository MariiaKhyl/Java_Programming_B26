package home_work_day33;

public class Task9 {
    /*
    Create a method that accepts an int array. Count how many even and odd numbers there is. Print an array at the end where the first element is how
many even numbers there was and the second element in the number of odd elements
                Ex:
                input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
                input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
     */
    public static void evenAndOdd (int [] arr){

        int even = 0;
        int odd = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2 == 0){

                even++;
            }
            if (arr[i]% 2 == 1){
                odd++;
            }

        }
        System.out.println("We have int our array:\nEven - "+even+"\nOdd - "+odd);
        System.out.println("["+even+", "+odd+"]");
    }

    public static void main(String[] args) {
        evenAndOdd(new int [] {1, 2, 3, 4});
        evenAndOdd(new int [] {1, 3, 5, 2});
    }



}
