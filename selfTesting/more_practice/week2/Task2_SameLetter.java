package more_practice.week2;

public class Task2_SameLetter {
    /*
    2) String - Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false;
     */

    public static boolean sameLetter (String str, String str2){

        if(str.length() == 0 || str2.length() == 0){
            return false;
        }
        if (str.length() != str2.length()){
            return false;
        }


        for(int i = 0; i < str2.length(); i++){
            if (!str2.contains(str.charAt(i)+"") || !str.contains(str2.charAt(i)+"")){
                return false;
            }
        }
       return true;

    }

    public static void main(String[] args) {
        System.out.println(sameLetter("abc2", "cab"));
    }

}
