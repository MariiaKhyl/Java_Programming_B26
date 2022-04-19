package codingBat;

public class commonEnd {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {7, 3,4};

        System.out.println(commonEnd(a,b));
    }

    public static boolean commonEnd (int [] a, int [] b){

        if (a.length >= 1 && b.length >= 1){

            if (a[0] == b[0] || a[a.length-1]==b[b.length-1]){
                return true;
            }

        }
        return false;

    }
}
