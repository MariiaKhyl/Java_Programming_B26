package codingBat;

public class intMax {
    public static void main(String[] args) {
        System.out.println(intMax(1,2,3));
    }
    public static int intMax (int a, int b, int c){
        int max = 0;

        if (a > max){
            max = a;
        }
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }
}
