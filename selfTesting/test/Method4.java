package test;

public class Method4 {
    /*
    Write a Java method to count all vowels in a string. Go to the editor
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4
     */
    public static void main(String[] args) {
        System.out.println(vowels("w3resourceeeee"));
    }

    public static int vowels(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            if (each == 'a' || each == 'e' || each == 'i' || each == 'o' || each == 'u') {
                count++;
            }
        }
        return count;

    }
}
