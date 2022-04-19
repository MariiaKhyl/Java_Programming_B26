package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] arr = str.split(", ");

        String shortest = arr[0];
        String sameSize = "";

        for ( String each : arr){

            if(each.length() < shortest.length()){

                shortest = each;

            }

        }
        for (String each : arr){

            if (shortest.length() == each.length()){

                sameSize += each+" ";

            }

        }
        String [] newArr = sameSize.split(" ");
        System.out.println(Arrays.toString(newArr));








    }
}
