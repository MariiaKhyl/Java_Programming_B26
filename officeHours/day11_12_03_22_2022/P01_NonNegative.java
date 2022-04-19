package day11_12_03_22_2022;

public class P01_NonNegative {

    /*
    Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi


    public static void stringTimes(String word, int numbers){

        for (int i =0; i < numbers; i++){
            System.out.print(word);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stringTimes("Hi", 2);
        stringTimes("Hi", 3);
        stringTimes("Hi", 1);
        stringTimes("Love",100);
    }

     */

    public static void main(String[] args) {

        String word = "Hi";

        stringTimes("Hi", 2);
        stringMarge("SomeWords");
    }

    private static void stringMarge(String someWords) {
    }


    public static void stringTimes(String word, int num) {

        String str = "";
        for (int i = 0; i <num; i++){

            str+=word;

    }
        System.out.println(str);

}





}
