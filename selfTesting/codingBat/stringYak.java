package codingBat;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yak123ya"));
    }

    public static String stringYak(String str) {

        String strNew = "";

        if (str.contains("yak")) {
            strNew = str.replace("yak", "");
        }
        return strNew;
    }
}