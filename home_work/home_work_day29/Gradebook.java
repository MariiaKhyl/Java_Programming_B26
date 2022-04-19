package home_work_day29;

import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {

        /*
             Declare three arrays:
    1. String array which will hold names for the students (give values)
    2. Int array which has the score of the student got in the quiz (give values)
    3. Char array which will have some letter grade based on the score (empty)
    4. Output the gradebook at the end with all the information
            Grade scale:
            Above 85: A
            Above 75: B
            Above 65: C
            Other: D
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter how many students in your Grade book");
        int size = scanner.nextInt();

        String [] students = new String[size];
        int [] score = new int[size];
        char [] gradeBased = new char[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Please enter student name");
            students[i] = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Please enter the score of the students");
            score[i] = scanner.nextInt();

            if (score[i] >= 85){
                gradeBased[i] = 'A';
            }else if (score[i] >= 75){
                gradeBased[i] = 'B';
            }else if (score[i] >= 65){
                gradeBased[i] = 'C';
            }else {
                gradeBased[i] = 'D';
            }

        }

        for (int i = 0; i < size; i++) {

            System.out.println(""+ students[i]+" | "+score[i]+" | "+gradeBased[i]);

        }









    }
}
