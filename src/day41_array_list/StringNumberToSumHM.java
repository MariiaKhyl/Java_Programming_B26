package day41_array_list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringNumberToSumHM {

    public static ArrayList<Integer> sumFromString (ArrayList<String> list){

        ArrayList<Integer> sum = new ArrayList<>();

        for (String each : list){

            int currentSum = getCurrentSum(each);
            sum.add(currentSum);
        }
        return sum;
    }

    private static int getCurrentSum(String each) {
        int currentSum = 0;

        for (String eachDigit : each.split("")) { // converting the String, each, to an array by sprit with an empty space , it means the each String will be separated with each character as separate String elements. "123-- > ["1","2","3"] and then you loop through that array
            currentSum+=Integer.parseInt(eachDigit);
        }
        return currentSum;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","1111","34"));
        System.out.println(sumFromString(list));

    }
}
