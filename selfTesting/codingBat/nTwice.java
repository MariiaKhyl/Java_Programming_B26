package codingBat;

public class nTwice {
    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
    }
    public static String nTwice(String str, int n){

        return str.substring(0,n)+str.substring(str.length()-n);

    }

}
