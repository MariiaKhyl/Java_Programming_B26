package home_work_day33;

public class Task8 {
    /*
    Create a method that accepts an int array and a number. Check if the array contains that number or not
                  Ex:
                input: ( {1, 2, 3, 4}, 4 ) -> true
                input: ( {1, 2, 3, 4}, 7 ) -> false
     */

    public static void numberSearch (int number){

        int [] arr = {1, 2, 3, 4};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number){

                count++;
            }

        }
        System.out.println(count > 0 ? "True" : "False" );
    }

    public static void main(String[] args) {

        numberSearch(1);


    }



}
