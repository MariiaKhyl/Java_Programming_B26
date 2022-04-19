package day07_03_09_2022;

public class FrequencyOH {

    public static void main(String[] args) {

        String s = "appleee";
        String checked = ""; // aple

        for(int i = 0; i < s.length(); i++){

            int count = 0;  // everytime the outer loop iterates, the counter is set back to 0. It is reset between every character
            char letter = s.charAt(i);

            if(checked.contains("" + letter)){
                continue;
            }

            for(int j = 0; j < s.length(); j++){

                char eachLetter = s.charAt(j);

                if(letter == eachLetter)  { // s.charAt(i) == s.charAt(j)
                    count++;
                }

            } // end of the inner loop

            System.out.println(letter + " - " + count);
            checked += letter;


        }



    }


}
