package codingBat;

public class frontAgain {

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));

    }

    public static boolean frontAgain(String str) {

        if (str.length() >= 2 && str.substring(0, 2).equals("ed")) {
            return true;
        } else if (str.substring(0, 2).equals("ed") == str.substring(str.length() - 2).equals("ed")) {
            return true;
        }else {
            return false;
        }
    }
}
