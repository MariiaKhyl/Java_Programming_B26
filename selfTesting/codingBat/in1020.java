package codingBat;

public class in1020 {
    public static void main(String[] args) {
        System.out.println(in1020(8,99));
    }
    public static boolean in1020 (int a, int b){
        if ((a >= 10 && a <= 20) || (b <= 20 && b >= 10)){
            return true;
        }else{
            return false;
        }
    }
}
