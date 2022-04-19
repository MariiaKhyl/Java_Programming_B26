package codingBat;

public class everyNth {
    public static void main(String[] args) {

        String str= "Miracle";
        int n = 2;
        String result = "";

        for (int i = 0; i < str.length(); i=i+n) {
            result += str.charAt(i);
        }
        System.out.println(result);


    }
}
