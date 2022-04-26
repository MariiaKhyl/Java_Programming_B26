package codingBat;

import java.util.Arrays;

public class make2 {
    public static void main(String[] args) {

        int [] a = {4, 5};
        int [] b = {1, 2, 3};


       System.out.println(make22(a,b));
    }
    public static int [] make22 (int [] a, int [] b){

        int [] arr = new int[2];

        if (a.length >= 2){
            arr[0] = a[0];
            arr[1] = a[1];
            return arr;
        }else if (a.length == 0){
            arr[0] = b[0];
            arr[1] = b[1];
            return arr;
        }else if (a.length == 1 && b.length == 1){
            arr[0] = a[0];
            arr[1] = b[0];
            return  arr;
        }

        return arr;


    }


}
