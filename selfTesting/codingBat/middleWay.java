package codingBat;

import java.util.Arrays;

public class middleWay {
    public static void main(String[] args) {

        int [] a = {1,7,3};
        int [] b = {4,5,6};
        System.out.println(Arrays.toString(middleWay(a,b)));

    }

    public static int[] middleWay(int[] a, int[] b) {

        int [] arr = new int[] {a[1],b[1]};

        return arr;

    }
}
