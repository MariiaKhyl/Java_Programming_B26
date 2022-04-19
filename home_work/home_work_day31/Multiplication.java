package home_work_day31;

import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        /*
        Given two 2D arrays multiply them together and store the results into a new 2D array. Multiple each number in each position as its own calculation
Ex:
	{1, 2, 3}
	{2, 5, 10}
	{0, 3, 20}
		x
	{10, 4, 3}
	{5, 2, 7}
	{100, 20, 5}
Output:
	{10, 8, 9}
	{10, 10, 70}
	{0, 60, 100}
         */
        int [][] arrOne = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20}
        };
        int [][] arrTwo = {
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}
        };

       int [][] arrThree = new int [3][3];

        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {

                arrThree [i][j] = arrOne[i][j] * arrTwo[i][j];

            }
        }
        System.out.println(Arrays.deepToString(arrThree));






    }
}
