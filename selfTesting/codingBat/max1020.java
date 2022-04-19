package codingBat;

public class max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11, 21));
    }

    public static int max1020(int a, int b) {

        int max = 0;
        boolean a1020 = (a >= 10 && a <= 20);
        boolean b1020 = (b >= 10 && b <= 20);
        if (b > a) {
            max = a;
            a = b;
            b = max;
        }

        if (a1020) {
            return a;

        } else if (b1020) {
            return b;
        }
        return 0;
    }

}
