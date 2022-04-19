package codingBat;

public class icyHot {
    public static void main(String[] args) {
        System.out.println(icyHot(2,120));
    }

    public static boolean icyHot (int temp1, int temp2){

        if (temp1 < 0 && temp2 >= 120 || temp2 < 0 && temp1 >= 100){
            return true;
        }else{
            return false;
        }
    }
}
