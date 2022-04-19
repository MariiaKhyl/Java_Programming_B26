package day37_wrapper_class;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds)";
        String [] arr = result.split(" ");
        System.out.println(Arrays.toString(arr));
        String resultStr = arr[1].replace(",","");
        String timeStr = arr[3].substring(1); // or replace(",","");

        System.out.println(resultStr);
        System.out.println(timeStr);

        long resultNumber = Long.parseLong(resultStr);
        double timeNumber = Double.parseDouble(timeStr);

        if (resultNumber >= 0){
            System.out.println("TEST CASE PASSED - POSITIVE NUMBER");
        }
        if (timeNumber <= 2 && timeNumber >= 0){
            System.out.println("TEST CASE PASSED - UNDER TWO SECONDS");
        }



    }

}
