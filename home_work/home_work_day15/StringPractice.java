package home_work_day15;

import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {

      // charAt(int index) : returns the char at given index, return type --> char
      String str = "Cydeo";
      //index:      01234

        //System.out.println(str.charAt(2));
        char ch1 = str.charAt(2);
        System.out.println(ch1);

        //length(): returns the total number of characters. return type ---> int
        String str2 = "Wooden Spoon";

        int n1 = str2.length();
        System.out.println(n1);

        int lastIndex = str2.length() -1;
        System.out.println(lastIndex);
        System.out.println("lastIndex = " + lastIndex);

        // toLowerCase(): returns the all lower case version of the String. return type --> String
        String str3 = "Java";
        str3.toLowerCase();

        // toUpperCase(): returns the all Upper case versoin of the String. return type --> String

        String str4 = "Java";
        str4.toUpperCase();

        // trim(): returns the String without all the white spaces (unused spaces). return type --> String

        String str5 = "       Java Programming    Language          ";
        str5 = str5.trim(); // "Java Programming    Language"
        System.out.println(str5);

        // indexOf(): returns the first matching character' index number
        String str6 = "Wooden Spoon";
        int indexNumOfFirstO = str6.indexOf("o");
        System.out.println("indexNumOfFirstO = " + indexNumOfFirstO);

        int indexNumOfSecondO = str6.indexOf("od");
        System.out.println("indexNumOfSecondO = " + indexNumOfSecondO);


        int indexNumOfThirdO = str6.indexOf("oon");
        System.out.println("indexNumOfThirdO = " + indexNumOfThirdO);

        //lastIndexOf(): returns the last matching character ' index number. return type --> int
        String str7 = "Wooden Spoon";
        
        int indexNumOfLastO = str7.lastIndexOf("o");

        System.out.println("indexNumOfLastO = " + indexNumOfLastO);

    }
}
