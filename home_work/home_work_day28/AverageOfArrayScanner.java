package home_work_day28;

import java.util.Scanner;

public class AverageOfArrayScanner {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner (System.in); // reading the array size
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        int [] array = new int[size]; // create an array

        System.out.println("Enter array value: "); // reading value from the user keyboard
        for (int i = 0; i < size; i++) {

            int value = scanner.nextInt();
            array[i] = value;

        }
        int lengzz = array.length; // getting array length
        int sumO = 0; // default sium value
        for (int j = 0; j < array.length; j++) {

            sumO+= array[j];
        }
        double aver = sumO/lengzz;
        System.out.println("Average of array "+aver);

         */
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int [] arr = new int [size];

        System.out.println("Enter array value:");
        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            arr [i] = value;
        }
        int length = arr.length;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double average = sum / length;
        System.out.println(average);







    }
}
