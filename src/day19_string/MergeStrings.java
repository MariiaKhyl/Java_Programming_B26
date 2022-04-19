package day19_string;

public class MergeStrings {


    public static void main(String[] args) {

        /*
        2 Strings: hard code to have 3 characters each
        marge the String together

         */

        String one = "abc";
        String two = "xyz"; // saim: xyz
        String merged = "";
        merged += one.charAt(0);
        merged += two.charAt(0);
        merged += one.charAt(1);
        merged += two.charAt(1);
        merged += one.charAt(2);
        merged += two.charAt(2);
        System.out.println(merged);



        //System.out.println(""+one.charAt(0)+two.charAt(0)+one.charAt(1)+two.charAt(1)+one.charAt(2)+two.charAt(2));




    }
}
