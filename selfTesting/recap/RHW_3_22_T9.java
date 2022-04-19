package recap;

public class RHW_3_22_T9 {

    /*
    create a method that will accept a String and find if it is Palindrome or not
     */

    public static void palindromeMethod (String word){

        String pali = "";
        for (int i = word.length()-1; i >=0; i--){
            pali += word.charAt(i);
        }
        if (word.equalsIgnoreCase(pali)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Non Palindrome");
        }
    }

    public static void main(String[] args) {
        palindromeMethod("racecar");
        palindromeMethod("Anna");
        palindromeMethod("Hello");
        palindromeMethod("dog");
        palindromeMethod("zero");
    }

}
