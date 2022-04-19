package home_work_day31;

public class Names {
    public static void main(String[] args) {

        /*
        Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

                Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

                Output:
                    ssk
                    esre
                    sw

         */

        String [][] arr = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        for (int i = 0; i < arr.length; i++) {

            String last = "";
            for (int j = 0; j < arr[i].length; j++) {

                last += arr[i][j].charAt(arr[i][j].length()-1);

            }
            System.out.println(last);
        }




    }
}
