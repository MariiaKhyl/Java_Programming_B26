package codingBat;

public class endsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("y"));
    }

    public static boolean endsLy(String str) {

        return  (str. length() > 1&&str.substring(str.length()-2).equals("ly"));


    }
}
