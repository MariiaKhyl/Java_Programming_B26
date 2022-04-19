package home_work_day31;

public class Diagonal {
    public static void main(String[] args) {
        /*
        Given a 2D array with values:

	{3, 5, 1}
	{1, 6, 10}
	{5, 21, 10}


Calculate and find the biggest diagonal

	if an array was

	a b c
	d e f
	g h i

	aei and ceg would be the diagonals
         */

        int [][] arr = {
                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };

        System.out.println("Diagonal one "+ (arr[0][0]+arr[1][1]+arr[2][2])+"\nDiagonal two "+(arr[0][2]+arr[1][1]+arr[2][0]));

    }
}
