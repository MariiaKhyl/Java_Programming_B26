package codingBat;

public class stringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("abc"));
    }

    public static String stringSplosion(String str) {

        String strC = "";
        for (int i = 0; i < str.length(); i++) {
            strC += str.substring(0, i + 1);
        }
        return strC;

    }


}
