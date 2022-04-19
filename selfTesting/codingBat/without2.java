package codingBat;

import java.awt.*;

public class without2 {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
    }

    public static String without2(String str) {

        String front = str.substring(0, 2);

        if (str.contains(front)) {
            return str.substring(2);
        } else if (str.length() <= 3) {
            return "";
        } else if (str.isEmpty() && !(str.contains(front))) {
            return str;
        }
        return str;
    }
}
