package recap;

public class AnagramRecap {
    public static void main(String[] args) {

/*
        Task 04 : Anagram

                Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent  --> not anagram
                    funeral vs  real fun
                    a gentleman vs elegant man

                 -> anagram
                 Hint: look up and use replaceFirst() method
         */

        String one = "a gentleman";
        String two = "elegant man";

        one = one.replace(" ", "").toLowerCase();
        two = two.replace(" ", "").toLowerCase();

        if (one.length() == two.length()){

            for ( int i = 0; i < one.length(); i++){

                char each = one.charAt(i);

                two = two.replaceFirst(each+"", "");

            }
        }

        if (two.isEmpty()){
            System.out.println("Is anagram");
        }else {
            System.out.println("Non anagram");
        }





    }
}
