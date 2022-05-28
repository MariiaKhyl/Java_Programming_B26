package more_practice.week2;

public class Task5_Reverse {
    /*
    5) String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i) + "";
        }
        return reverse;

    }

    public static String Reverse1(String word) {

        String reverse = "";

        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }
        return reverse;

    }
}