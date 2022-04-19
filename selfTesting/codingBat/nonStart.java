package codingBat;

public class nonStart {
    public static void main(String[] args) {
        System.out.println(nonStart("hello","There"));
    }
    public static String nonStart(String a, String b){

        String str2 = "";
        if (a.length()<1 && b.length()<1){
            return str2;
        }
            return a.substring(1)+b.substring(1);
    }
}
