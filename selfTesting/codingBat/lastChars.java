package codingBat;

public class lastChars {
    public static void main(String[] args) {
        System.out.println(lastChars("last", ""));
    }

    public static String lastChars(String a, String b) {

        if (a.isEmpty() && b.length() > 1) {
            return "@" + b.substring(b.length() - 1);
        } else if (a.length() > 1 && b.isEmpty()) {
            return a.substring(0, 1) + "@";
        } else if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        } else {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        }

    }
}
