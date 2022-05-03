package day4_04_25_2022.gradeActivity;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {

        int totalQuestions, missed;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many questions in the exam?");
        totalQuestions = scanner.nextInt();
        System.out.println("How many questions is missed?");
        missed = scanner.nextInt();

        FinalExam math = new FinalExam(totalQuestions, missed);
        System.out.println(math.getScore());
        System.out.println(math.getGrade());
    }
    /*
    - Create StudentsGrade runner class
                      -ask user how many question in the exam (Scanner)
                      -ask user how many question is missed (Scanner)
                      -give user the final grade
     */
}
