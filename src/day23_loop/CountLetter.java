package day23_loop;

public class CountLetter {
    public static void main(String[] args) {

        /*

        Given a String and we want to count how many 'a' char we have

        Challenge : adjust so that we can check for not only 'a' but ant char

        ex aabbcaa
         */


        String word = "aabbcaa";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i)=='a'){// checks if every char is = to a word
                count++;
            }
        }
        System.out.println(count);



    }
}
