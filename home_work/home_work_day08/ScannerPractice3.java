package home_work_day08;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt(); // 85 was entered

        input.nextLine(); // entering Enter

        System.out.println("Enter your full name ");
        String fullName = input.nextLine();

        System.out.println("Score = " + score);
        System.out.println("Full Name = " + fullName);
    }
}
