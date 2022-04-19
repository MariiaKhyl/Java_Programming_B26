package codingBat;

public class stringBits {
    public static String stringBits (String str){
        String result = "";

        for (int i = 0; i < str.length(); i+=2) {
            result += str.substring(i,i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Heeeeregskxd"));
    }
}
