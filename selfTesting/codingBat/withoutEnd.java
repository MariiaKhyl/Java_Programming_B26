package codingBat;

public class withoutEnd {
    public static void main(String[] args) {
        System.out.println(withoutEnd("ab"));
    }
    public static String withoutEnd(String str){

        String str2 ="";

        if (str.length() <= 2){
            return str2;
        }
        return str.substring(1,str.length()-1);
    }
}
