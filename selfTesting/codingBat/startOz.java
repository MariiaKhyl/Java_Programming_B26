package codingBat;

public class startOz {
    public static void main(String[] args) {
        System.out.println(startOz("oxx"));
    }

    public static String startOz(String str) {

        String strNew = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            strNew += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            strNew += str.charAt(1);
        }
        return strNew;

    }
}
