package codingBat;

public class extraEnd {

    public static void main(String[] args) {
        System.out.println(extraEnd("He"));
    }
    public static String extraEnd(String str){
        String str2 = "";
        if (str.length() == 2){
            return str+str+str;
        }
        if(str.length()>2) {
           str2 = str.substring(str.length() - 2, str.length()-1)+str.charAt(str.length()-1);
        }
        return str2+str2+str2;
    }
}
