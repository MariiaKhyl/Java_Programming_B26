package home_work_day29;

public class ReverseHW {

    public static void main(String[] args) {

        /*
        Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
                    Output: racecar
                    Ex:
                Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                Output: No palindrome
         */

        String [] palindrome = {"java","longer word", "civic", "apple","racecar", "mom","anna"};

        String longPali = "";


        for (String each : palindrome){

            boolean isPalindrome = true;

            for (int i = 0; i < each.length()/2; i++){

                if (each.charAt(i) != each.charAt(each.length()-1 - i)){

                    isPalindrome = false;

                }

            }


            if (isPalindrome && each.length() > longPali.length()){
                longPali = each;
            }

        }
        System.out.println(longPali.isEmpty() ? "No Palindrome" : longPali );


    }

}
