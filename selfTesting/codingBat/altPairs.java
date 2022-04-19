package codingBat;

public class altPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("Chocolate"));
    }

    public static String altPairs(String str) {
        str += " ";
        String strNew = "";

        for (int i = 0; i <= str.length() - 2; i += 4) {


            strNew += str.substring(i, i + 2);


        }
        return strNew.trim();

    }
}
