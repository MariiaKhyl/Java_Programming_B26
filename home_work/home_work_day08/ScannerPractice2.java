package home_work_day08;
import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first sentence");
        String firstSentence = input.nextLine();

        System.out.println("Enter your second sentence");
        String secondSentence = input.nextLine();

        System.out.println("first sentence " + firstSentence);
        System.out.println("second sentence " + secondSentence);


    }
}
