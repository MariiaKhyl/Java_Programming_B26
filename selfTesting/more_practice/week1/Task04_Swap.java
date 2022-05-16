package more_practice.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task04_Swap {
/*
Swap Numbers
Swap two variable' values without using a third variable
 */

    public static void main(String[] args) {


            System.out.println("Enter the value of x and y");
            Scanner scanner = new Scanner(System.in);
            /*Define variables*/
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("before swapping numbers: "+x +" "+ y);
            /*Swapping*/
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After swapping: "+x +"  " + y);

        }

}
