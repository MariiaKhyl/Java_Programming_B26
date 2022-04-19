package codingBat;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yak123ya"));
    }

    public static String stringYak(String str) {

        String strNew = "";

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.length() > 3) {
                if (str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'k') {
                    strNew += str.charAt(i);
                    return strNew;
                }
            }

        }
        return str;
    }
}