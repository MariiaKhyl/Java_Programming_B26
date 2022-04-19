package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        /*
        All String types
        0 -> ID
        1 -> First name
        2 -> last name
        3 -> batch #

         */

        String [] studentOne = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo = new String [4];
        System.out.println(Arrays.toString(studentTwo));

        studentTwo[0] = "010";
        studentTwo[1] = "Jamie";
        studentTwo[2] = "Smith";
        studentTwo[3] = "26";
        System.out.println(Arrays.toString(studentTwo));

       // String [] studentThree = new String [4];
        Scanner scanner = new Scanner (System.in);
       // System.out.println("Enter your ID");
      // studentThree[0] = scanner.nextLine();
       // System.out.println("Enter your name");
     //   studentThree[1] = scanner.nextLine();
       // System.out.println("Enter your last name");
      //  studentThree[2] = scanner.nextLine();
      //  System.out.println("Enter your batch number");
       // studentThree[3] = scanner.nextLine();
     //   System.out.println(Arrays.toString(studentThree));



        String [] studentFour = new String [4];
        String [] questions= {"Enter your ID","Enter your name", "Enter your last name","Enter your batch number", "Enter your batch number" };

        for (int i = 0; i < 4; i++) {  //for (int j = 0; j < studentFour.length ; j++) {

            System.out.println(questions[i]);// reading each element of the questions array
            studentFour[i]= scanner.nextLine(); // assigning the Scanner input into our studentFour array
        }
        System.out.println(Arrays.toString(studentFour));




    }
}
