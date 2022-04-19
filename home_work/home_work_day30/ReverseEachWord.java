package home_work_day30;

public class ReverseEachWord {
    public static void main(String[] args) {

        /*
        Reverse Each word

   Given a String, reverse each individual word and print the result
      Hint: Use a nested loop, split

          Input:
      It started to snow in Chicago
          Output:
      tI detrats ot wons ni ogacihC
         */

        String str = "It started to snow in Chicago";
        String [] arr = str.split(" ");
        String reversed = "";

        char [] words = arr[str.length()-1].toCharArray();

        for (int i = words.length -1; i >=0; i --){

            reversed+=words[i]+" ";

        }
        System.out.println(reversed);






    }
}
