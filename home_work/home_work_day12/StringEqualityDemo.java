package home_work_day12;

import java.util.Scanner;

public class StringEqualityDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two lines of text:");
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        if (s1.equals(s2)){
            System.out.println("The two lines are equal.");
        }else{
            System.out.println("The two lines are not equal.");
        }
        if (s2.equals(s1)){
            System.out.println("The two lines are equal.");
        }else{
            System.out.println("The two lines are not equal.");
        }
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("But the lines are equal, ignoring case.");
        }else{
            System.out.println("Lines are not equal, even ignoring case. ");
        }

    }

}
