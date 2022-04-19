package day15_16_04_05_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task07 {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        String result = "";             // A3B2C1D4E3

        ArrayList<String> list = new ArrayList<>( Arrays.asList( str.split(""))  );
        // in order to be able to use frequency method


        for(String each : list ){
            int frequency = Collections.frequency(list, each);

            if(result.contains(each)) { // to avoid duplicated characters in the result
                continue;
            }

            result += each + frequency;

        }

        System.out.println(result);



    }
}
