package home_work_day33;

public class Task6 {
    /*
    create a method that will accept a String and find if it is Palindrome or not
     */
    public static void palindrome (String palindromeWord){

        String newWord = "";
        for (int i = palindromeWord.length()-1; i >= 0 ; i--) {

           newWord += palindromeWord.charAt(i);

        }
        if (palindromeWord.equalsIgnoreCase(newWord)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Non palindrome");
        }

    }

    public static void main(String[] args) {
        palindrome("racecar");
        palindrome("Anna");
        palindrome("BaNana");
        palindrome("cat");
        palindrome("dog");
    }


}
