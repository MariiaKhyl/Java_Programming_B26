package day24_loop;

public class Syllables {
    public static void main(String[] args) {

        /*
        Syllables
Given a String separated by dashes calculate how many syllables the words are
       Ex:
       Input:
       ja-va
       Output:
         2
         */
        //String bbb= ("" +newSen.charAt(' ')).toLowerCase();

        String s = "ja-va-va-ja-la-la";
        int syllables = 1;

        for (int i=0; i<s.length();i++){

            if (s.charAt(i)=='-'){
                syllables++;
            }
        }
        System.out.println("Syllables: "+syllables);


    }
}
