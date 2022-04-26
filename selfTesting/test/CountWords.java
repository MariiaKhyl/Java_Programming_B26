package test;

public class CountWords {
    /*
    Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
     */
    public static void main(String[] args) {
        System.out.println(sumOfWords("Thequick brown fox jumps over the lazy dog."));
    }
    public static int sumOfWords(String str){

        int count = 0;
        str.trim();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' '){
                count++;
            }
        }
return count;
    }

}
