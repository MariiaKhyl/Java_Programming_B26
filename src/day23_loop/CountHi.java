package day23_loop;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaaahiahhihibbbbcch";

        int count = 0;

        for (int index = 0; index < str.length()-1; index++) {

            if (str.charAt(index) == 'h'&& str.charAt(index+1)=='i'){
                count++;
            }
        }
        System.out.println(count);


    }
}
