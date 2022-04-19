package codingBat;

public class middleThree {
    public static void main(String[] args) {

    }

    public static String middleThree(String str) {

        int sh = str.length()/2;
        return str.substring(sh-1,sh+2);

    }
}
