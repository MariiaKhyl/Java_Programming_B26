package codingBat;

public class comboString {
    public static void main(String[] args) {
        System.out.println(comboString("hello","hiloooo"));
    }

    public static String comboString(String a, String b) {

        if (a.length() > b.length()) {
            return b + a + b;
        }

        return a + b + a;
    }
}
